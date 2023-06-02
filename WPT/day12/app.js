const express=require('express')




const path= require("path")


const routes=require("./router/routers")

const app=express();
const bodyparser=require("body-parser")

//middleware
app.use(bodyparser.urlencoded({extended:false}))
app.set("view engine","ejs")
app.set("views",path.join(__dirname,"views"))
app.set(express.static(path.join(__dirname,"public")))

app.use("/js",express.static(path.resolve(__dirname,"public/js")))
app.use("/css",express.static(path.resolve(__dirname,"public/css")))
app.use("/image",express.static(path.resolve(__dirname,"public/image")))
app.use("/",routes)

//end middleware


app.listen(3005,()=>{console.log("listening at port 3005")})

module.exports=app;

