const fs=require("fs");
fs.writeFile("sample1.txt","welcome to nodejs programming",function(err){
    if(err){
        console.log("error",err);

    }else{
        console.log(length);
        fs.readFile("sample1.txt",function(err,data){
            if(err){
                console.log("error occured",err)
            }else{
                console.log(data.toString())
            }
        })
    }

})

fs.writeFileSync("sample.txt","hello world!!");
const data=fs.readFileSync("sample.txt")
console.log(data.toString());