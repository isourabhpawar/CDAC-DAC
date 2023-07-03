const express= require("express");

const app=express();
const bodyparser=require("body-parser")
const cors=require("cors")
const router=require("./routers/router.js")
app.use(cors({
    origin: 'http://localhost:3000'}));
    
app.use(bodyparser.urlencoded({extended:false}))
app.use(bodyparser.json())


app.use("/",router)
app.listen(3005,()=>{
    console.log("runnning 3005")
})



module.exports=app