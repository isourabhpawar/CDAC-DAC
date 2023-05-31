exports.addition=function(n1,n2){
    return n1+n2;
}
exports.permutation=function(n,r){
    //n!/(n-r)!
    var ans=factorial(n)/factorial(n-r)
    return ans;
}

const factorial=function(num){
    f=1
    for(var i=1;i<=num;i++){
        f=f*i;
    }
    return f;
}

//console.log("addition: ",addition(23,24))
//console.log("factorial: "+factorial(5))