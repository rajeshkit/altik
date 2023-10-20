let x;
async function test(){
    return 1;
    
}
console.log("test1");
console.log("test2"); 
let p = await test();
console.log(p);
console.log("test3");
console.log("test4");


// export class Employee{
//     _employeeId;
//     _employeeName;
//     _doj;
//     get doj() {
//         return this._doj;
//     }
//     set doj(value) {
//         this._doj = value;
//     }
//     get employeeId() {
//         return this._employeeId;
//     }
//     set employeeId(value) {
//         this._employeeId = value;
//     }
//     get employeeName() {
//         return this._employeeName;
//     }
//     set employeeName(value) {
//         this._employeeName = value;
//     }
//     display(){
//        console.log(this.employeeId);
//        console.log(this.employeeName);
//        console.log(this.doj);
//     }
// }
// let e=new Employee();
// e._employeeId=1111;//set
// e._employeeName="qwe";
// e._doj=new Date();
// console.log(`${e._employeeId} ${e._employeeName}  ${e._doj}` ); //get
// e.display();