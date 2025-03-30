let p = new Promise((resolve, reject) => {
    arr = ["first!", "second", "third"];
    resolve(arr)
});

p.then((msg) => {
    console.log(msg);
    return "second";
});

p.then((msg) => {
    console.log(msg);
    return "third";
})
p.catch((error) => {
  console.log("오류 발생 ==> " + error);
});
