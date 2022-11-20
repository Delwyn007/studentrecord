
function openForm() {
    if(document.getElementById("myForm").style.display === "none"){
      document.getElementById("myForm").style.display = "block";
    }
    else{
      document.getElementById("myForm").style.display = "none";
    }
  }

  

function hideMyForm(){
    document.getElementById("myForm").style.display = "none";
  }

  function val(){
    if(b1==""){
      if(b2==""){
        alert("please enter a valid subject and a message "+b1);
      }
    }
    else{
      alert("your subject is entered ");
    }
    var b1=document.getElementById("a").value;
    var b2=document.getElementById("b").value;
    console.log(b1);
    const mail = {
      sub: b1,
      comp: b2,
      read:true,
    }
   window.localStorage.setItem('user', JSON.stringify(mail));
  }  
  var bc=document.getElementById("sur");
  bc.onclick=function(){
    val()
  }
  function vals(){
    while(b1!==null && b2!==null){
     
  }
}
  