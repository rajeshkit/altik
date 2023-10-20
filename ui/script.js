let traineeNames=['Damu','sudeep','Rohit','Balaya'];
let userInputTextBox=document.querySelector("#username");
console.log(userInputTextBox);
let spanTag = document.querySelector("#myname");
userInputTextBox.addEventListener("keyup",function($event){

   spanTag.innerHTML = $event.target.value;
});
let buttonObject=document.querySelector('#buttonclick');
buttonObject.addEventListener("click",()=>{
        let ul = document.createElement('ul');
        for (const traineeName of traineeNames) {
            let li = document.createElement('li');
            let text=document.createTextNode(traineeName);
            li.append(text);
            
            ul.appendChild(li);
           
        }
        console.log(ul);
        document.body.appendChild(ul);
});






















// class Customer{
//     _customerId;
//     get customerId() {
//         return this._customerId;
//     }
//     set customerId(value) {
//         this._customerId = value;
//     }
    
  

// }
// let c=new Customer();
// console.log(c._customerId);
// c._customerId=1234;
// console.log(c._customerId);
























// // let k=["rajesh",56,4.6,true,{name:'chennai'}];
// // let h=[56,34,57,34]
// // let myData=[...k,...h,false,4545,false,true];
// // console.log(myData);
// // let person={age:20,qualification:'34'}








// // let k=10;
// // if(k){
// //     console.log(k);
// // }else{
// //     console.log("else part");
// // }



// // let person ={
// //     id:132,
// //     name:"Rajesh",
// //     city:"Namakkal",
// //     isMarried:true,
// //     rank:4.5
// // }
// // console.log(person);

// // console.table(person)
// // let pv = Object.values(person);
// // let pk = Object.keys(person);
// // console.table(pv);
// // console.table(pk);

// // for (const iterator in pv) {
// //    console.log(iterator); 
// // }
