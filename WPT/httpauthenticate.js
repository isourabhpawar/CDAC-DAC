//import modules
const http=require("http");
const url=require("url");
const m1=require("./authenticatemodule")
const fs=require("fs");

//create server
const server=http.createServer(function(req,resp){
   var q=url.parse(req.url,true);
   
   resp.writeHeader(200,{"content-type":"text/html"})
   switch(q.pathname){
    case "/login":
        var rs=fs.createReadStream("./public/loginform.html")
        rs.pipe(resp);
        break;
    case "/validateuser":
        var ans=false;
        var uname=q.query.uname;
        var passwd=q.query.passwd
        var ans=m1.validateuser(uname,passwd)
        if(ans){
            resp.write("<h3>Successful login</h3>");
            resp.write("<a href='/login'>login</a>/ <a href='/register'>registre me</a>");
            resp.end()
        }else{
                resp.write("<h3>unsuccessful login</h3>");
                resp.write("<a href='/login'>login</a>/ <a href='/register'>registre me</a>");
                resp.end()
            }
            break;
        case "/register":
            var rs=fs.createReadStream("./public/registration.html")
            rs.pipe(resp);
            break;
        case "/registeruser":
            var uname=q.query.uname;
            var passwd=q.query.passwd
            var ans=m1.addnewuser(uname,passwd)
            if(ans){
                resp.write("<h3>Successful registration</h3>");
                resp.write("<a href='/login'>login</a>/ <a href='/register'>registre me</a>");
                resp.end()
            }else{
                    resp.write("<h3>unsuccessful registration</h3>");
                    resp.write("<a href='/login'>login</a>/ <a href='/register'>registre me</a>");
                    resp.end()
                }
                break;
        default:
                   resp.write("<h3>Pls login or register</h3>");
                   resp.write("<a href='/login'>login</a>/ <a href='/register'>registre me</a>");
                    resp.end()
        }
   
})
//start the server
server.listen(3002,function(){
    console.log("server running at port 3002");
})