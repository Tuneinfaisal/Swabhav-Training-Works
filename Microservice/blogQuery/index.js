const express = require("express");
const cors = require("cors");
const bodyParser = require("body-parser");

const app = express();
app.use(bodyParser.json());
app.use(cors());

const posts = {};

const LOCAl_HOST = "event-bus_svc";

app.get("/api/v1/blog/post",(req,res) => {
    res.send(posts);
})

const handleEvent=(type,data) => {
    if(type=="PostCreated") {
        const{postId,title} = data;
        posts[postId]={postId,title,comments:[]}
        return;
    }

    if(type=="CommentCreated") {
        const {commentId,postId,description} = data;
        const post = posts[postId];
        post.comments.push({commentId,description});
    }
}

app.post("/event-bus/events/listener",(req,res) => {
    const {type,data} = req.body;
    handleEvent(type,data);
    res.send({});
});

app.listen(5002, async() => {
    console.log("listening to port 5002");

    // const res = await axios.get("http://"+LOCAl_HOST+":5005/event-bus/events/listener");
    // const events = res.data;
    // for(let event of events) {
    //     console.log("processing events",event.type);
    //     handleEvent(event.type,event.data);
    // }
})