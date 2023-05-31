const http=require("http");
const url=require("url");
function processrequest(req,resp){
    var q=url.parse(req.url,true);
    console.log(q);
    resp.writeHeader(200,{"content-type":"text/html"})
    switch(q.pathname){
        case "/home":
            resp.write("<h1>in home page</h1>");
            resp.end();
            break;
        case "/aboutus":
            resp.write("<h1>in aboutus page</h1>");
            resp.end("<h4>testing server with switch case</h4>");
            break;
        default:
            resp.write("<h1>in some othe page</h1>");
            resp.end();
            break
    }
   
}
var server=http.createServer(processrequest)
server.listen(3002,()=>{
    console.log("serverstarted at port 3002")
})