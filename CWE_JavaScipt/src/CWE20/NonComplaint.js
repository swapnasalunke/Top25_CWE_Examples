// CWE-20	Improper Input Validation

function setUserName(username) {
  console.log("Logged in as " + username);
}

uname = prompt("Enter userName:")
setUserName(uname)
