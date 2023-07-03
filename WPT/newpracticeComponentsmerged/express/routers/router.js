


const express=require("express")
const router= express.Router();

const conn=require("../dbconnect/dbconn");



router.get("/vehicles/:vid", (req, resp) => {
    console.log("in get by id")
    conn.query(
      "select * from veh where vid=?",
      [req.params.vid],
      (err, data) => {
        if (err) {
          resp.status(500).send(JSON.stringify("data not found" + err));
          console.log(JSON.stringify(err));
        } else {
          resp.send(data[0]);
        }
      }
    );
  });
router.get("/vehicles",(req,resp)=>{
    conn.query("select * from veh",(err,data)=>{
        if(err){
            console.log(err)
        }
        else{
            resp.send(data)
        }
    })
})

router.delete("/vehicles/delete/:vid",(req,resp)=>{
    console.log("in delete")
    conn.query("delete from veh where vid=?",[req.params.vid],(err,data)=>{
        if(err){
            console.log(err)
        }
        else{
            resp.send("delted successfully")
        }
    })
})

router.post("/vehicles/vehicle/",(req,resp)=>{
    console.log("in post");
    conn.query("insert into veh values(?,?,?)",[req.body.vid,req.body.price,req.body.vname],(err,data)=>{
        if(err){
            console.log(err)
        }
        else{
            resp.send(data)
        }
    })
})

router.put("/vehicles/vehicle/",(req,resp)=>{
    console.log("in update ");
    conn.query("update veh set price=?, vname=? where vid=?",[req.body.price,req.body.vname,req.body.vid],(err,data)=>{
        if(err){
            console.log(err)
        }
        else{
            resp.send(data)
        }
    })
})


module.exports=router
