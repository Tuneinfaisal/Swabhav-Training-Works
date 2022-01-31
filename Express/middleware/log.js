module.exports = function(req,resp,next) {
    console.log("inside logging middleware :" + new Date());
    next();
}