//import library
const express=require("express");
const app=express();
const bodyparser=require("body-parser");
const router=require('./router/routers.js')
//add middlewares
app.use(bodyparser.urlencoded({extended:false}))
app.use(bodyparser.json())
//configure the application
//CORS settings
app.use(function(req, res, next) {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type');
    res.setHeader('Access-Control-Allow-Credentials', true);
    next();
});
//add url handler
app.use("/",router);

//start the server
app.listen(3002,function(){
    console.log("server running at port 3002")
})
module.exports=app;