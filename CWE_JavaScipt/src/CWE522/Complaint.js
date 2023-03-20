//      CWE-522	Insufficiently Protected Credentials prevention


function login(username, pass) {

  let password = 'myPassword123';
  if(pass==password){
  console.log("Login with", username)
  } else {
      console.log("Wrong password")
  }

}

uname = prompt("Enter userName:")
pass = prompt("Enter password:")
login(uname,pass)