const bts = document.getElementById("bts");
const inp = document.getElementById("inp");
bts.addEventListener("click",function(){
   
    fetch("/wishlist/add?productNum="+inp.value, {
        method:"GET",
        
    })
    .then(response => response.text())
    .then(response => {
           let bl = confirm("찜됬습니다 장바구니로 가실래요?")
           if(bl){
               location.href="/wishlist/list";
        }else{
            location.href="/product/list";
           }
    })
})

//replyAdd (fetch)

const replyAdd = document.getElementById("replyAdd");
const replyContents = document.getElementById("replyContents")
const replyJumsu = document.getElementById("replyJumsu")
const replyForm = document.getElementById("replyForm");
const productNum = document.getElementById("productNum")
const div = document.getElementById("replyList")


fetch("../reply/list?productNum="+productNum.value, {
    method:"GET"
})
.then(r => r.text())
.then(r=>div.innerHTML=r)


replyAdd.addEventListener("click" , function(){
let form = new FormData(replyForm)


fetch("/reply/add",{
    method:"POST",
    headers:{
     "Content-type":"application/x-www-form-urlencoded"
   },
   
    body:"replyJumsu="+replyJumsu.value+"&productNum="+productNum.value+"&replyContents="+replyContents.value
})

.then(r=>r.text())
.then(res=>{
        div.innerHTML=res;
        replyContents.value="";

    })
    
})

// fetch("/reply/add", {
//     method:"POST",
//     headers:{
//         "Content-type":"application/x-www-form-urlencoded"
//     },
//     body:"replyContents="+replyContents.value+"&replyJumsu="+replyJumsu.value

// })
// .then(response => response.text())
// .then(res => {
//     console.log(res)
// })






