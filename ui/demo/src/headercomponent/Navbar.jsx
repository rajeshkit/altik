import "./Navbar.css"
import axios from "axios";
import React, { useState, useEffect } from "react";
function Navbar(props){
    let [data,setData]=useState([]);
    console.log(props);
    const fetchData = async () => {
        try {
          const response = await axios.get("http://localhost:9090/customer-api/customers");
          console.log(response.data);
          setData(response.data);
        } catch (error) {
          console.error("Error fetching data:", error);
        }
      };
    useEffect(() => {
        fetchData();
    }, []);
    return <div id="nav">
        <h1>This is navbar functional component {props.myCount}</h1>
        {data.map((d)=>{
            return<div>{d.customerId}</div>
        })}
    </div>
}
export default Navbar;