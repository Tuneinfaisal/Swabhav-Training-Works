const express = require("express");
const cors = require("cors");
const bodyParser = require("body-parser");
const uuid = require("uuid");
const axios = require("axios");
const app = express();

app.use(bodyParser.json());
app.use(cors());

const LOCAl_HOST = "event-bus_svc";

const posts = {};
app.post("/api/v1/blog/post", (req, res) => {
    const { title } = req.body;
    const postId = uuid.v4();
    posts[postId] = { title, postId };

    axios
        .post("http://"+LOCAl_HOST+":5005/event-bus/events", {
            type: "PostCreated",
            data: { title, postId },
        })
        .catch((e) => console.log(e.message));

    res.send(posts[postId]);
});

// app.get("/api/v1/blog/post", (req, res) => {
//     res.send(posts);
// });

app.post("/event-bus/event/listener", (req, res) => {
    const { type } = req.body;
    console.log("Received event : ", type);
    res.send({});
});

app.listen(5000, () => {
    console.log("listening to 5000");
});
