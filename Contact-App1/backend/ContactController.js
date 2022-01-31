const port = 2000;

app.get('/',(req,res) => {
    res.send();
})

app.post('/',(req,res) => {
    res.send();
})

app.listen(port, () => {
    console.log(`listening to ${port}`);
});
