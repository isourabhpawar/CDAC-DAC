//import http library
const http=require("http")
//create a server
var server=http.createServer(function(req,resp){
    console.log("method:",req.method,"url: ",req.url)
    resp.writeHeader(200,{"content-type":"text/html"})
    resp.write("<h1>Hello world!!</h1>")
    resp.end("<h3>Welcome to nodejs programming</h3>")
})
//start the server and listen to the request
server.listen(3001,console.log("server started running on port 3001"))