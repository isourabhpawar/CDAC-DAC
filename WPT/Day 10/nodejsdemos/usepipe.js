
const fs=require("fs");
//use data streaming if the file is larger than RAM size
//ceate readstream
var rs=fs.createReadStream("test.txt");
//create writestream
var ws=fs.createWriteStream("myfile.txt");
//adds pipe in bewtween source readstream and destination writestream
rs.pipe(ws);