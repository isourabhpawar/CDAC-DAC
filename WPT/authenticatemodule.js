userdata={"user1":"user123","user2":"user2123","admin":"admin123"}
userdata["asd"]="sdf";
console.log(userdata);
exports.validateuser=(uname,passwd)=>{
      var p=userdata[uname];
      return p===passwd
}

exports.addnewuser=(uname,passwd)=>{
    var p=userdata[uname];
    if(p!==undefined){
        return false;
    }else{
        userdata[uname]=passwd
        console.log(userdata);
        return true;
    }
}