//      CWE-476	NULL Pointer Dereference prevention

let obj = null;
if (obj !== null && obj !== undefined) {
  console.log(obj.property);
} else {
  console.log('obj is null or undefined');
}