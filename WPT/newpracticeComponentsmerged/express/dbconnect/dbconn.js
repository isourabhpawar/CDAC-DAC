




const mysql=require("mysql")

const mysqlconn=mysql.createConnection({
  "host":"127.0.0.1",
  "user":"root",
  "password":"12345",
  "port":3306,
  "database":"test"


})

mysqlconn.connect((err)=>{
    if(err){
        console.log(err)
    }
    else{
        console.log("connection done")
    }
})




module.exports=mysqlconn