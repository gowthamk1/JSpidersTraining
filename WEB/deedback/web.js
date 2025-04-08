// // console.log("start");
// // console.log(a);

// // var a=200;
// // a=500;
// // console.log(a);
// // var x=3000;
// // let c=300;
// // console.log(a);
// // console.log(c);
// // console.log(window.a);
// // console.log(window.b);

// // var x=1000;
// // const z=5000;
// // console.log(z);

// // function max(){
// //     let abc = 1000000;
// // }

// // let str="photosynthesis"
// // console.log(str.charAt(4));
// // console.log(str.charCodeAt("i"));
// // console.log(str.concat("Hello"));
// // console.log(str.endsWith("t"));
// // console.log(str.startsWith("p"));
// // console.log(str.includes("y"));
// // console.log(str.indexOf("o"));
// // console.log(str.lastIndexOf("o"));
// // console.log(str.length);
// // console.log(str.match("t"));
// // console.log(str.padEnd(22,"!!!!!"));
// // console.log(str.padStart(22,"!!!!!"));
// // console.log(str.repeat(4));
// // console.log(str.replace("p","x"));
// // console.log(str.slice(2,6));
// // console.log(str.split("").reverse().join());
// // console.log(str.toUpperCase());
// // console.log(str.trimStart());
// // console.log(str.trimEnd());
// // console.log(str.toLowerCase());

// // console.log("START");

// // function LOCO () {
// //     var a=1000;
// //     console.log(a);
// //     let b=10;
// //     console.log(b);
// //     let c=290;
// //     console.log(c);
// //     console.log(this.b);
// // }

// // LOCO()

// // let b=57;
// // console.log(b);
// // console.log(this.a);
// // var g=6454;
// // console.log(g);
// // var a=700;
// // console.log(a);

// // console.log("START");
// // function first(){
// //     var a=9999;
// //     console.log(a);
    
// //     function second(){
// //         let b=9876;
// //         console.log(b);
// //         console.log(a);
// //     }return second
// // }
// // first()()

// // console.log("START");
// // function first(){
// //     var a=9999;
// //     console.log(a);
    
// //     function second(){
// //         let b=9876;
// //         console.log(b);
// //         console.log(a);

// //         function third(){
// //             let c=8741;
// //             console.log(c);
// //             var d="DAMAR";
// //             console.log(a);
// //             console.log(b);
// //             console.log(d);
// //         }return third
// //     }return second
// // }
// // first()()()

// // function max(a,b,task){
// //     return task(a,b);
// // }
// // let data1=max(100,200,function(abc,xyz){
// //     return(abc+xyz);
// // })
// // let data2=max(200,100,function(jio,rio){
// //     return(jio*rio);
// // })
// // console.log(data2)
// // console.log(data1)

// // function Hi(callback){
// //     console.log("How are you....?");
// //     callback()
// // }

// // function Hello(){
// //     console.log("I am fine....!");
// // }

// // Hi(Hello)

// // var car = new Vehicle("Honda","white","2010","UK");
// //     console. log(car);

// //     function Vehicle(model, color, year, country) {
// //     this.model = model;
// //     this.color = color;
// //     this.year = year;
// //     this.country = country;
// //     }

// //     function foo(){
// //         let x=(y=0);
// //         x++;
// //         y++;
// //         return x;
// //     }
// //     console.log(foo(),typeof x,typeof y);

// //     vary=1;
// //     if(function f(){}){
// //         y+=typeof f;
// //     }
// //     console.log(y);

// // function f1(){
// //     return;
// //     {
// //         message:"Hello World";
// //     }
// // }
// // console.log(f1());

// // function f2(first,second,first){
// //     console.log(first,second,first);
// // }
// // f2(1,2,3);

// // var arr1=new Array(3);
// // console.log(arr1);

// // var arr2=[];
// // arr2[2]=100;
// // console.log(arr2);

// // arr3=[, , ,];
// // console.log(arr3);

// // function add(item,items=[]){
// //     items.push(item);
// //     return items;
// // }
// // console.log(add("Orange"));
// // console.log(add("Apple"));

// // function outer(f=inner()){
// //     function inner(){
// //         return "Inner";
// //     }
// // }
// // outer()


// let arr=[100,300,278,965,4565,3000]
// console.log(arr);

// // Filter
// let fill = arr.filter((value)=>{
//     return value<1000;
// })
// console.log(fill);

// // Mapping
// let map=fill.map((value)=>{
//     return value+value*0.18;
// })
// console.log(map);

// // Reducing
// let reduce=map.reduce((acc,value)=>{
//     return acc+value;
// })
// console.log(reduce);

// let reduce1=map.reduce((acc,value)=>{
//     return acc+value;
// },+5)
// console.log(reduce1);

// let obj={
//     name:"heloooooo",
//     age:{
//         time:"20000"
//     }
// }
// console.log(obj.age);
// let{name,age}=obj;
// console.log(age.time="10000");

// console.log("helooo");
// console.log("helooo");
// setTimeout(()=>{
//     max()
//         console.log("hi");
// },5000)
// console.log("dingaa");
// setInterval(()=>{
//     console.log("I'am always sleepig");
// },3000)
// console.log("dingaa");


// let date= new Date()
// console.log(date);

// console.log(date.getDate()); 
// console.log(date.getDay());
// console.log(date.getHours());
// console.log(date.getMinutes());
// console.log(date.getSeconds());
// console.log(date.getFullYear());

// date.setFullYear(2019)
// console.log(date);


// DOM METHODS

console.log(window.location);
console.log(window.alert);
console.log(window.close);
console.log(window.history);

let max=window.document.createElement("div")
console.log(max);

document.body.appendChild(max);

max.innerHTML="<h4>Hello World</h4>"
document.body.style.backgroundColor="black"
max.style.color="red"




