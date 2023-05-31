const fs=require("fs");
fs.exists("sample.txt",function(flag){
    if(flag){
        console.log ("exists")
        fs.stat("sample.txt",function(err,status){
            if(err){
                console.log("error occured")
            }else{
                //console.log(status);
                fs.open("sample.txt","r",function(err,fd){
                    var buff=Buffer.alloc(status.size);
                    //fs.read(file handle,buffer,buffer start pos,numberof characters,file position to read,callback)
                    fs.read(fd,buff,0,10,null,function(err,bytesread,buffer){
                        console.log(buffer.toString());
                    })
                })
            }
            
        })
    }
    else{
        console.log("not exists")
    }

})
