let p = new Promise((resolve, reject) => {
    arr = ["first!", "second", "third"];
    resolve(arr[])
});

p.then((msg) => {
    console.log(msg);
    return "second";
});

.then((msg) => {
    console.log(msg);
    return "third";
})
.catch((error) => {
  console.log("오류 발생 ==> " + error);
});
