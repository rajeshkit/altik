let firstName="altimetrik";
let  officeLocation="chennai"
let  isWorkingToday=true;
export let noOfEmployees=500
// console.log(firstName+" "+officeLocation+" "+isWorkingToday+" "+noOfEmployees);
// console.log(
//   `Firstname is ${firstName} Officelocation is ${officeLocation} @is office is holiday today ${isWorkingToday} total employees@ ${noOfEmployees}`);
//String template literals
// //Destructuring
//       let name1=["chennai","pune","bangalore","Telungana","mumbai"];
//       let [city1,city2,...city3]=name1;
//       console.log(city1 + " "+city2+" "+city3);
//     //   let city1 = name1[0];
//     //   let city2 = name1[1];
//     //   let city3 = name1[2];
//      function test([n1,n2]){
//         console.log("Test method array values:"+n1+" "+n2);
//      } 
//      test(name1);
// let person = {
//     firstName:"Rajesh",
//     lastName:"N",
//     phone:[97458,98988,45454],
//     email:{
//             personalEmail:"rajesh.kit@gmail.com",
//             officialEmail:"rajesh.kit@freelancer.com"
//           }
// }
// function test1({firstName,phone}){
//   console.log("Test1 method array values:"+firstName+" "+phone);
// } 
// test1(person);



//   let {phone:[phone1,phone2,phone3],email:{personalEmail}}=person;
// console.log(phone3+" "+personalEmail);






//    let name1=["chennai","pune","bangalore"];
//    console.log(name1);
//    let city=["hyd","Telungana","cbe"];
//    console.log(city);
//    let allCityNames=[...name1,...city,"mumbai"];
//     console.log(allCityNames);


// //Spread and Rest Operator
//     let personal = {
//     firstName:"Rajesh",
//     lastName:"N"
//     }
//     let contacts={
//         phone:97458,
//         email:"rajesh.kit@gmail.com"
//     }
//     let personalDetails= {...personal,...contacts,job:'Trainer'};
//     console.log(personalDetails);








// var y = function(a,b,...t){
//     console.log(a+" "+b+" "+t);
// }
// y(23,45,767,"erer",true);
//Destructure


// function display(fn){
//     console.log("line 1");
//     fn();
//     console.log("line 2");
//     console.log("line 3");
// }
// display(()=>console.log("welcome to demo"));

// display(()=>console.log("multiply"));
//Ways to create a function 
// function add(no1,no2){ // function declaration
//     return no1+no2;
// }

// var total = add(34,45);
// console.log(total);

// var m=function multiply(no1,no2){ // function expression
//     console.log(no1*no2);      
// };
// m(656,343);
// var x = function(no1,no2){ // anonymous function 
//     console.log(no1/no2);
// };
//x(200,100);
// var x1 = (no1,no2)=>console.log(no1/no2);                           
// x1(4464,343)
// let person = {
//     firstName:"Rajesh",
//     lastName:"N",
//     phone:97458,
//     email:"rajesh.kit@gmail.com",
// }
// for (const k in person) {
//     console.log(person[k]);
    
// }
// for (const i of Object.values(person)) {
//     console.log(i);
// };








// console.log(Object.entries(person));
// console.log(Object.keys(person));
//  console.log(Object.values(person));

// var a=[34,56,true,34,"vijay",35.4,null,undefined];
        
// for (let index = 0; index < a.length; index++) {
//     const element = a[index];
//     console.log(element);
    
// }
// for (const i of a) { //for of - used to iterate the array
//     console.log(i);
// }
// a.forEach(e=>console.log(e));
