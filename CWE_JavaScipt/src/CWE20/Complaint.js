// CWE-20	Improper Input Validation Prevention

function setUserName(username) {
    var pattern = /^[a-zA-Z0-9_]+$/; 
    if (pattern.test(username)) {
      console.log("Username is set!");
    } else {
      console.log("Invalid username");
    }
    
  }
  
  uname = prompt("Enter userName:")
  setUserName(uname)
  