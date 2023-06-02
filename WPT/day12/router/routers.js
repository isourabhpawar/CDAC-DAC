const express = require("express");

const router = express.Router();
const connection = require("../db/dbconnect");

router.get("/employee", (req, resp) => {
    
  connection.query("select * from employee", (err, data, fields) => {
    if (err) {
      resp.status(500).send("error on query" + JSON.stringify(err));
    } else {
        console.log(fields)
      resp.render("index", { empdata: data });
    }
  });
});
router.get("/displayaddform", (req, resp) => {
  resp.render("add-emp");
});

router.post("/insertEmployee", (req, resp) => {
  var empid = req.body.empid;
  var ename = req.body.ename;
  var sal = req.body.sal;
  connection.query(
    "insert into employee values (?,?,?)",
    [empid, ename, sal],
    (err, result) => {
      if (err) {
        resp.status(500).send("insertion failed " + JSON.stringify(err));
      } else {
        resp.redirect("/employee");
      }
    }
  );
});

router.get("/edit/:eid", (req, resp) => {
  connection.query(
    "select * from employee where empid=?",
    [req.params.eid],
    (err, data, fields) => {
      if (err) {
        resp.status(500).send("error at edit" + err);
      } else {
        resp.render("update-emp", { emp: data[0] });
      }
    }
  );
});

router.post("/updateEmployee", (req, resp) => {
  var empid = req.body.empid;
  var ename = req.body.ename;
  var sal = req.body.sal;

  connection.query(
    "update employee set ename=? ,sal=? where empid=?",
    [ename, sal, empid],
    (err, data, fields) => {
        if(err){
            resp.status(500).send("unable to update"+err)
        }
        else{
            resp.redirect("/employee")
        }
    }
  );
});



router.get("/delete/:eid",(req,resp)=>{
    connection.query("delete from employee where empid=?",[req.params.eid],(err,data)=>
    {
        if(err){
            resp.status(500).send("error at delete "+err)
        }else{
            console.log(data);
            resp.redirect("/employee");
        }
    })
})
module.exports = router;
