
// let form = document.getElementById("form");

// form.addEventListener("submit",()=>{
//     let name=document.getElementById("name").value;
//     let txt=document.getElementById("txt").value;
//     let local=window.localStorage.setItem("name",name)
//     local=window.localStorage.setItem("txt",txt)


// });

// let txt = document.getElementById("txt");
// let play = document.getElementById("btn");

// play.addEventListener("click",()=>{
//     speech(txt.value)
// })

// function speech(rio){
//     let talk=new SpeechSynthesisUtterance(rio)
//     window.speechSynthesis.speak(talk)
// }

// let grandparent=document.getElementById("grandparent");
// let parent=document.getElementById("parent");
// let child=document.getElementById("child");

// grandparent.addEventListener('click',()=>{
//     console.log("grandparent clicked");
//     grandparent.style.backgroundColor="red"
// })

// parent.addEventListener('click',()=>{
//     console.log("parent clicked");
//     parent.style.backgroundColor="green"
// })

// child.addEventListener('click',()=>{
//     console.log("child clicked");
//     child.style.backgroundColor="yellow"
// })


// let arr = []
// console.log(arr[0]= 89);
// console.log(arr[1]= 3);
// console.log(arr[2]= 45);
// console.log(arr[3]= 456);
// console.log(arr[4]= 34);
// console.log(arr);


    let arr = [76,56,43,56,78,6]
    console.log(arr);
btn.addEventListener('click',()=>{
    let a=window.prompt("enter index value",);
    (arr.splice(a,1))
    console.log(arr);
})

