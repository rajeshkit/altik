let countryName="india";
export default countryName;
export let trainee="Abc";
export let name1=["chennai","pune","bangalore","Telungana","mumbai"];
export class Employee{
    employeeId=46446;
    employeeName="Rajesh";
    doj=new Date();
    display(){
       console.log(this.employeeId);
       console.log(this.employeeName);
       console.log(this.doj);
    }
}
//let emp=new Employee();
//console.log(`${emp.employeeId}  ${emp.employeeName}  ${emp.doj}`);

export let person = {
    firstName:"Rajesh",
    lastName:"N",
    phone:[97458,98988,45454],
    email:{
            personalEmail:"rajesh.kit@gmail.com",
            officialEmail:"rajesh.kit@freelancer.com"
          }
}
