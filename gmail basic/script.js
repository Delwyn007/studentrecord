function openForm() {
  if (document.getElementById("myForm").style.display === "none") {
    document.getElementById("myForm").style.display = "block";
  } else {
    document.getElementById("myForm").style.display = "none";
  }
}
window.onload = function hh() {
  debugger;
};

function hideMyForm() {
  document.getElementById("myForm").style.display = "none";
}

function val() {
  if (a == "") {
    if (b == "") {
      alert("please enter a valid subject and a message " + a);
    }
  } else {
    alert("your subject is entered ");
  }
  var a = document.getElementById("a").value;
  var b = document.getElementById("b").value;
  console.log(a);
  var user = JSON.parse(sessionStorage.getItem("user") || "[]");
  var mail = {
    sub: a,
    comp: b,
    read: false,
  };
  user.push(mail);
  sessionStorage.setItem("user", JSON.stringify(user));
}

var bc = document.getElementById("val");
bc.onclick = function () {
  val();
};
function vals() {
  while (b1 !== null && b2 !== null) {}
}

/*
user.push(Message)
var div1 = document.createElement("div");
var sub = document.createElement("p");
var com = document.createElement("p");
var div2 = document.createElement("div");



sub.innerHTML = "Subject: " + sub;
comp.innerHTML = "Compose: " + comp;

userdiv.append()

*/
