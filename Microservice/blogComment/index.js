const express = require("express");
const cors = require("cors");
const uuid = require("uuid");
const bodyParser = require("body-parser");
const app = express();
const axios = require('axios')

app.use(bodyParser.json());
app.use(cors());

const postIdAndComments = {};

const LOCAl_HOST = "event-bus_svc";

// app.get("/api/v1/blog/post/:postId/comment", (req, res) => {
//     const postId = req.params.postId;
//     const commentsArray = postIdAndComments[postId] || [];
//     res.send(commentsArray);
// });

app.post("/api/v1/blog/post/:postId/comment", (req, res) => {
    const { description } = req.body;
    const commentId = uuid.v4();
    const postId = req.params.postId;
    const comment = { commentId, description };
    const comments = postIdAndComments[postId] || [];
    comments.push(comment);
    postIdAndComments[postId] = comments; //adding if no key available

    axios.post("http://"+LOCAl_HOST+":5005/event-bus/events",{
        type:'CommentCreated',
        data: {
            postId,comments,description
        }
    })
    res.send(comments);
});

app.post("/event-bus/events/listener",(req,res) => {
    const {type} = req.body;
    console.log("Received event : ",type);
    res.send({});
})

app.listen(5001, () => {
    console.log("listening on 5001");
});
