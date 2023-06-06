const express=require("express");
const router=express.Router();
const connection=require('../db/dbconnect')

router.get("/employees",(req,resp)=>{
    connection.query("select * from employee",(err,data)=>{
        if(err){
            resp.status(500).send("data not found"+JSON.stringify(err))
        }else{
            resp.send(data)
        }
    })
})
router.get("/employees/employee/:empid",(req,resp)=>{
    connection.query("select * from employee where empid=?",[req.params.empid],(err,data)=>{
        if(err){
            resp.status(500).send("data not found"+JSON.stringify(err))
        }else{
            resp.send(data[0]);
        }
    })
})
router.post("/employee/employee/:eid",(req,resp)=>{
  var empid=req.body.empid;
  var ename=req.body.ename;
  var sal=req.body.sal
  connection.query("insert into employee values(?,?,?)",[empid,ename,sal],(err,result)=>{
    console.log(result);
    if(err){
        resp.status(500).send("data not inserted")
    }
    else{
        if(result.affectedRows> 0)
           resp.send("{'msg':'inserted successfully'}")
        else
        resp.send("{'msg':'not inserted '}")
    }
  })
})

router.put("/employee/employee/:eid",(req,resp)=>{
    var empid=req.body.empid;
    var ename=req.body.ename;
    var sal=req.body.sal
    connection.query("update employee set ename=?,sal=? where empid=?",[ename,sal,empid],(err,result)=>{
      console.log(result);
      if(err){
          resp.status(500).send("data not updated")
      }
      else{
        if(result.affectedRows> 0)
        resp.send("{'msg':'update successfully'}")
     else
     resp.send("{'msg':'not updated '}")
      }
    })
  })

  router.delete("/employee/employee/:eid",(req,resp)=>{
    connection.query("delete from employee where empid=?",[req.params.empid],(err,result)=>{
      console.log(result);
      if(err){
          resp.status(500).send("data not deleted")
      }
      else{
        if(result.affectedRows> 0)
        resp.send("{'msg':'deleted successfully'}")
     else
     resp.status(500).send("{'msg':'not deleted '}")
      }
    })
  })


module.exports=router;