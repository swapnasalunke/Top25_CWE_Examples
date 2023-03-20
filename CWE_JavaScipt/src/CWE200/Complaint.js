// CWE-200	Exposure of Sensitive Information to an Unauthorized Actor Prevention

function login(username,pass) {
 console.log("Logged in");
}

uname = prompt("Enter userName: ")
pass = prompt("Enter password: ")
login(uname,pass)