console.log("agreement");

const req = document.getElementsByClassName("req");
const all = document.getElementById("checkAll");
const checks = document.getElementsByClassName("checks");
const checks2 = document.getElementsByClassName("opts");
const btn = document.getElementById("hhh");
let j=0;
all.addEventListener("click", ()=>{ 
       let v =  all.checked;
       for(let i = 0; i< checks.length;i++){
        checks[i].checked=v;
    }
    
})
let bl=true;
//모두선택
for(let n = 0;n<checks.length;n++){
checks[n].addEventListener("click", function(){
    for(let n = 0;n<checks.length;n++){
    j = checks[n].checked;
    console.log(j);
    if(j == false){
        n+=10;
        all.checked=j;
    }
    
    }
    if(j==true){
        all.checked=j;
    }
})
}


//@@@@@@@@@@@@@@@@@@@@@@@@
btn.addEventListener("click", function(){
    let flag=true;

    
    for(let r of req){
        if(!r.checked){
            flag=false;
            break;
        }
    }
    if(flag){
        location.href="./join";
    }else{
        alert("필수 약관은 동의 해야 한당");
    }
})
    
