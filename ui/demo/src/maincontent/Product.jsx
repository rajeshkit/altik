import React from "react";
import { useState } from "react";
import axios from "axios";
let Product=()=>{
        let [customer,setCustomer]=useState([]);
        const fetchData = async () => {
        try {
            const response = await axios.get("http://localhost:9090/customer-api/customers");
            console.log('====================================');
            console.log(response.data);
            console.log('====================================');
            setCustomer(response.data);
            } catch (error) {
            console.error("Error fetching data:", error);
        }
        };
        // need a something http call
        return <>
        <div>Hai i am from Product class component</div>
        <button onClick={fetchData}>GetAllCustomers</button>
        <ul>
        {customer.map((cust)=>{
              return <li>{cust.customerId} {cust.customerName} {cust.customerDob}</li>  
        })}
        </ul>

        </>
   

}
export default Product;