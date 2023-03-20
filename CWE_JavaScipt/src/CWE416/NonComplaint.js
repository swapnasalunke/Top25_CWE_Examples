//      CWE-416	Use After Free


function createUser() {
  let user = { name: "John", email: "john@example.com" };
  return user;
}

let user = createUser();
console.log(user.name);

user = null;
console.log(user.name); // Error: accessing property of null
