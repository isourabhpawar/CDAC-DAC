import { useState } from "react";

const ProductList=(props)=>{

let [prodnm, setprodname]=useState("");

let addprodtoarr=()=>{
    props.insertprod(prodnm);
    setprodname("")

    console.log(props.prodarr)
}

let renderlist=props.prodarr.map((elem,index)=>{
    
    return (
    <li  key={index}>
        {elem}
    </li>);
    


});


    return (
        <div>
             ProdNames<input
            
            type="text" name="nm" id="nm" value={prodnm}  
            onChange={(event)=>{setprodname(event.target.value)}} 
            
            
            ></input>
            <button type="button" name="btn" id="btn" value="btn" onClick={addprodtoarr}>add new prod</button>
            <ul>
                {renderlist}
            </ul>
        
        </div>




    )



}


export default ProductList;
