const express = require('express');
const student = require('../models/student');
const router = express.Router();

router.get('/', async(req,res) => {
    try{
        const std = await student.find();
        res.json(std);
    }
    catch(err){
        res.send("Error " + err);
    }
})

function addStudent() {
    router.post('/', async(req,res) => {
        const std = new student({
            id: req.body.id,
            name: req.body.name,
            cgpa: req.body.cgpa
        })
    
        try{
            const s1 = await std.save();
            res.json(s1);
        }
        catch(err){
            res.send("Error " + err);
        }
    })
}

router.delete('/', async(req,res) => {
    try{
        const std = await student.find();
        res.json(std);
        const s1 = await student.remove();
    }
    catch(err){
        res.send("Error " + err);
    }
})

module.exports = router;