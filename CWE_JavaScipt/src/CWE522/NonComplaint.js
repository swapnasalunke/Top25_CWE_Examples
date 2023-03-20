//      CWE-522	Insufficiently Protected Credentials

let password = 'myPassword123';   // This code stores the user's password in a global variable

function login(username, pass) {
    if(pass==password){
  console.log("Login with", username)
  } else {
      console.log("Wrong password")
  }

}

uname = prompt("Enter userName:")
pass = prompt("Enter password:")
login(uname,pass)