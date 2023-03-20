// CWE-125	Out-of-bounds Read Prevention

var arr = [1, 2, 3];
if (arr.length >= 4) {
  console.log(arr[3]);
} else {
  console.log("Index out of bounds");
}