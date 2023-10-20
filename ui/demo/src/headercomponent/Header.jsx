import "./Header.css";
import { useState } from "react";
import Navbar from './Navbar'
function Header(){
    let [count, setCount] = useState(1);
    let [companyName,setCompanyName]=useState('altimaetrik chennai');
    let [players,setPlayers]=useState(["dhoni","virat","rohit","yuvraj","sachin","shewag"]);
    function add(){
      setCount(count=count+1);
      console.log(count);
      setPlayers([...players,"ncgs","Chennai"]);
    }
    function changeCompanyName($event){
      setCompanyName(companyName=$event.target.value);
    }
   return <>
        <div>Hai i am from Header class component</div>
        <div>{companyName}</div>
        
              <div>{players}</div>
      
        <button onClick={add}>Add</button>
        <div>{count}</div>
        <Navbar myCount={count}></Navbar> {/* it will Navbar component return an html */}
        </>
}
export default Header;