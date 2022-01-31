const express = require("express");
const bodyParser = require("body-parser");
const axios = require("axios");
const cors = require("cors");

const app = express();
app.use(cors());
app.use(bodyParser.json());


const events = [];
//other service will emit event
app.post("/event-bus/events", (req, res) => {
    const event = req.body;
    events.push(event);
    //notify all other services 5000,5001,5002
    axios.post("http://localhost:5000/event-bus/events/listener",event)
    .catch(e=>console.log(e))

    axios.post("http://localhost:5001/event-bus/events/listener",event)
    .catch(e=>console.log(e))

    axios.post("http://localhost:5002/event-bus/events/listener",event)
    .catch(e=>console.log(e))

    res.send({});
});

app.listen(5005,() => {
    console.log("listening in port 5005");
});