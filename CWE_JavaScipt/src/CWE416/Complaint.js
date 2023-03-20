//      CWE-416	Use After Free prevention


function createUser() {
  let user = { name: "John", email: "john@example.com" };
  return user;
}

let user = createUser();
console.log(user.name);
user = null;
if (!user) {
    console.log("User is Null");

} else {
  console.log(user.name);
}