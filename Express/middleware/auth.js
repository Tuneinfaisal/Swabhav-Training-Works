module.exports = function(req,resp,next) {
    console.log("inside auth middleware checking user authentication :" + new Date());
    next();
}