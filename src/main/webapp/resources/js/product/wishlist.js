const bts = document.getElementById("bts");
const inp = document.getElementById("inp");
bts.addEventListener("click",function(){
   
    fetch("/wishlist/add?productNum="+inp.value, {
        method:"GET",
        
    })
    .then(response => response.text())
    .then(response => {
     console.log(response)   
    })
})