console.log("agreement");

const all = document.getElementById("checkAll");
const checks = document.getElementsByClassName("checks");
const checks2 = document.getElementsByClassName("opts");
// all.addEventListener("click" ,function(){
//      let v= all.getAttribute("checked")
//     v = all.checked;
//     for(let i = 0; i<checks.length;i++){
//         checks[i].setAttribute("checked", v);
//     }
    
// })
let n=0;
all.addEventListener("click", ()=>{ 
       let v =  all.checked;
       for(let i = 0; i< checks.length;i++){
        checks[i].checked=v;
       }

})

checks.addEventListener("click", function(){
    for(let i = 0; i<10; i++){
        n = checks[i].checked;
       if(n == false){
        i+=11;
       }

    }
    all.checked=n;

})

// for(let c of checks){
//     c.addEventListener("click", function(){
//         console.log(this.checked);
//     })
// }
//jquery
// $("#checkAll").click(()=>{
//     let v = $("checkAll").prop("checked");
//     $(".checks").prop("checked", v);
// });

// $(".checks").click(function(){
// console.log($(this.prop('checked')))

// })