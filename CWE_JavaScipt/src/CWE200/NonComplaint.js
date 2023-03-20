// CWE-200	Exposure of Sensitive Information to an Unauthorized Actor

function login(username,pass) {
 console.log('Logging in with username: ' + username + ' and password: ' + pass);
}

uname = prompt("Enter userName: ")
pass = prompt("Enter password: ")
login(uname,pass)