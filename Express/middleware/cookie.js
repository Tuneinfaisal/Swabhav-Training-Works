module.exports = function(req,resp,next) {
    console.log("fetching cookie information from request :" + new Date());
    next();
}