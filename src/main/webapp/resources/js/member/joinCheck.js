console.log("join check")

let ps = document.getElementById("passWord");
let psch= document.getElementById("passWordCheck");
let psdiv = document.getElementById("passWordResult");
let pschdiv = document.getElementById("passWordCheckResult");
let btn = document.getElementById("btn2");
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


console.log()
//passWord@@@@@@@@@
let len;
ps.addEventListener("blur", function(){
len = ps.value.length
 if(len<8){
    psdiv.style.color="red"
    psdiv.innerText="최소 8글자 이상 이여야합니다";
 }
 if(len>8){
    psdiv.innerText="";
 }


})
//passWordCheck@@@@@@@@@@@@@@@
psch.addEventListener("keyup", function(){
    console.log(ps.value)
    console.log(psch.value)
if(ps.value == psch.value){
    pschdiv.style.color="green"
    pschdiv.innerText="비밀번호가 일치합니다";
}
if(ps.value != psch.value){
    pschdiv.style.color="red";
    pschdiv.innerText="비밀번호가 일치하지 않습니다";
}

})


let userid = document.getElementById("userName");
let pass = document.getElementById("passWord");
let name = document.getElementById("name");
let email = document.getElementById("email");
let phone = document.getElementById("phone");
let addr = document.getElementById("addRess");

//@btn@@@@@@@@@@@@@@@@@@@@
btn.addEventListener("click", function(){
    console.log("dddd")
    if(len<7){
        alert("비밀번호는 최소 8글자 이상이여야 합니다")
        return;
    }

    if(ps.value != psch.value){
        alert("비밀번호가 달라요");
        return;
    }

    if(len>7 && ps.value == psch.value){
        pschdiv.innerText="";
        psdiv.innerText="";
        alert("good~~")
        return;
      
    };

    if(userid.value == ""){
        alert("id를 입력하시용")
        return;
    }else if(pass.value == ""){
        alert("passWord를 입력하시용")
        return;
    }else if(name.value == ""){
        alert("name을 입력하시용")
        return;
    }else if(email.value == ""){
        alert("email을 입력하시용")
        return;
    }else if(phone.value == ""){
        alert("phoneNumber를 입력하시용")
        return;
    }else if(addr.value == ""){
        alert("addRess를 입력하시용")
        return;
    }



})





