//import builtin fs module
const fs=require("fs");
//asynchronous reading
//synchronous read
data=fs.readFileSync("test.txt")
console.log(data.toString())