console.log("FileManager")


const filelist = document.getElementById("filelist");
const fileAdd = document.getElementById("fileAdd");
const del = document.getElementsByClassName("del");


filelist.addEventListener("click", function(e){


})
for(d of del){
    d.addEventListener("click", function(){
        alert("click");
    })
}

let result=1;
fileAdd.addEventListener("click", function(){
    let file1 = document.createElement("input");
    file1.setAttribute("type", "file");
    file1.setAttribute("class","form-control");
    file1.setAttribute("name","attachs")
    
    console.log(result);
    let filex = document.createElement("span");
    let text1 = document.createTextNode("X");
    filex.setAttribute("class", "input-group-text text-danger del");
    filex.appendChild(text1);
    
    let div1 = document.createElement("div")
    div1.setAttribute("class", "input-group my-2")
    filelist.appendChild(div1);
    
    
    if(result>5){
        alert("파일은 5개까지만 추가가 불가능합니다")
    }else{
    result++;
    div1.appendChild(file1);
    div1.appendChild(filex);
    
}

})

// let resultj = 1;
// let count = $("filelist").attr("data-file-count");
// let max = $("filelest").attr("data-file-max");
// $("#fileAdd").click(function(){
//     let element1 = `
//     <div class="input-group">											
//     <input class="form-control" type="file" name="attachs">
//     <span class="input-group-text text-danger del">X</span>
//     </div> 
//     `
    
//     if(resultj>5){  
//         alert("파일은 5개 까지만  추가가 가능합니다")
//     }else{
//         resultj++;
//         $("#filelist").appendChild(element1);
//       }
// })

// $(".del").click(function(){
// alert("Del Click")

// })


