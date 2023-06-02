const mysql=require("mysql")



var obj={
    host:'127.0.0.1',
    user:'root',
    password:'12345',
    database:'test',
    port:3306


}

var mysqlconnection=mysql.createConnection(obj);


mysqlconnection.connect((err)=>{  
    if(err){
        console.log("db connection failed"+err)

    }
    else{
        console.log("connection succesfull")
    }
  })



module.exports=mysqlconnection;