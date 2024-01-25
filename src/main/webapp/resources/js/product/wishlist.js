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

// $("#bts").click(function(){
// $.ajax({
//     url:"/wishlist/add",
//     method:"GET",
//     data:{
//         inp:$("#inp").val        
//     },

//     success:function(r){
//             console.log(r)
//     }
// })

// })