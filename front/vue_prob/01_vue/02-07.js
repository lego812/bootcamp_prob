//변수를 여러 개 선언하는 동시에, 그것들에게 배열이나 객체의 값을 추출하여 할당하는 방법

let arr = [10,20,30,40];
let[a1,a2,a3]=arr; //변수 a1,a2,a3선언 및 arr의 값 할당
 console.log(a1, a2, a3);
 let p1 = { name:"홍길동", age:20, gender:"M" };
 let{name:n, age:a, gender}=p1; //변수 n와 a와 gender 선언하고, 객체p1의 속성값들을 할당하는 법
 
console.log(n, a, gender);