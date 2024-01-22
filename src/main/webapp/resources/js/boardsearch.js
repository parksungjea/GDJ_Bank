const pager = document.getElementsByClassName("pager");
const searchForm = document.getElementById("searchForm");
const page = document.getElementById("page");


for(i=0;i<pager.length;i++){
    pager[i].addEventListener("click", (e)=>{
        e.preventDefault();
       let p = e.target.getAttribute("date-page");
        searchForm.setAttribute("input")
        page.value=p;
        searchForm.submit();
    })
}

for(p of pager){
    p.addEventListener("click", (e)=>{
        e.preventDefault();
        let page = this.getAttribute("data-page");
        console.log(page);
        onsole.log('test')
        searchForm.submit();

    })
}
