var express = require('express');
var path=require('path');
var app = express();

//server configuration
app.use(express.static(path.join(__dirname,'public')));

app.get('/', function (req, res) {
    res.sendFile(path.join(___dirname + '/index.html'));
 });


app.get('/hello', function (req, res) {
    var person={firstName:'Ravi',lastName:'Tambade',age:47};
    res.send(person);
});

var server = app.listen(7667, function () {
    var host = server.address().address
    var port = server.address().port
    console.log("Example app listening at http://localhost:7667", host, port)
});

  