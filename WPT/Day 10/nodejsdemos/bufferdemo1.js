//allocationg buffer of size 400 bytes
var buf1=Buffer.alloc(400)
//write data to the buffer, it returns number of characters
var l=buf1.write("Hello world!!!")
console.log("length : ", l)
//to display data from the buffer
console.log(buf1.toString());
//allocates buffer of size= length of the string
buf2=new Buffer("testing");
console.log(buf2.toString());
//allocates buffer of size= length of the buf2
target=Buffer.alloc(buf2.length)
//create a copy of buf2 contents into target
buf2.copy(target);
console.log(target.toString())
