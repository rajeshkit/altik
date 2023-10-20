import { useState } from "react";

        

function Headerf(){
    let [counter, setCounter] = useState(0);
    function increment(){
        setCounter(
            counter=counter+1
        );
    }
    return <> 
            <div>I am functional component</div>
            <button onClick={increment}>+</button>
            <p>Sollunga counter a:{counter}</p>
           </>
}
export default Headerf;