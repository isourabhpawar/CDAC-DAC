const fs=require("fs");
fs.exists("sample.txt",function(flag){
    if(flag){
        console.log ("exists")
        fs.stat("sample.txt",function(err,status){
            if(err){
                console.log("error occured")
            }
            console.log(status);
        })
    }
    else{
        console.log("not exists")
    }

})