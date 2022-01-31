var express = require('express');
const port = 3000;
const app = express();

app.get('/',(req,resp) => {
    resp.send('hello from student controller...');
});

app.listen(port,() => {
    console.log(`up and running ${port}`);
});