const pager = document.getElementsByClassName("pager");

for(p of pager){
    p.addEventListener("click", (e)=>{
        e.preventDefault();
        onsole.log('test')
    })
}
