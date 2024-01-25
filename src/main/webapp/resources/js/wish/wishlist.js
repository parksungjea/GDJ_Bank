const all = document.getElementById("checks");
let checks = document.querySelectorAll(".check");
const del = document.getElementById("del")
console.log("Dddd")
let j=0;
all.addEventListener("click", ()=>{ 
    console.log("Asdasd")
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

// del.addEventListener("click", function(){
//     let nums= [];
//     let mm=[];
//     for(let a=0; a<checks.length;a++){
//         if(checks[a].checked){
//         nums[a]=checks[a].value;
//         mm[a]=checks[a];
//     }
// }
// console.log("checks 배열 :"+checks);
// console.log("nums 배열 : "+nums);
//     console.log("mm 배열 : "+mm)
$("#del").click(function(){

    let nums = [];
    let checkElement=[];
    $(".check").each(function(idx, item){
        if($(item).prop("checked")){
           nums.push($(item).val());
           checkElement.push($(item));
        }
    });
    console.log(nums);
    console.log(checkElement);

    $.ajax({
        method:'post',
        url : '/wishlist/delete',
        traditional : true,
        data : {
            productNum : nums
        },

        success : function(res){
            if(res.trim()>0){
                for(let i =0; i<$(checkElement).length;i++){
                   $(checkElement[i]).parent().parent().remove();
                   
                 }
              //location.reload();
            }              
          },
          error : function(er){
            alert("실패")
        }
    //location.reload();

    //2.Element들 삭제
        
})
})



// btn.addEventListener("click",function(){
//     let ar = [];
//         for(let i =0; i<wishlist.length;i++){
            
//             if(wishlist[i].checked)
//             {
//                 ar.push(wishlist[i].value)
//             }
//         }
//         $.ajax({
//             method:'post',
//             url : '/wishlist/delete',
//             traditional : true,
//             data : {
//                 productNum : ar
//             },
//             success : function(res){
//               if(res.trim()>0){
//                 //location.reload();
//                 for(let i =0; i<wishlist.length;i++){
//                     if(wishlist[i].checked){
//                     wishlist[i].parentNode.parentNode.remove();
//                     i--;
//                     }
//                  }
//               }              
//             },
//             error : function(er){
//                 alert("실패")
//             }
//         })
//         console.log(ar);
//     })




