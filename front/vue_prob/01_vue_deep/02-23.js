let obj1 = { name: '박문수', age: 29 };
let obj2 = { ...obj1, email: 'mspar@gmail.com' }; // obj의 값을 복사하고 추가적인 값을 더한 새로운 개체 생성

console.log(obj2);

obj2.name = '박다빈';

console.log(obj2);

let arr1 = [100, 200, 300];
let arr2 = ['hello', ...arr1, 'world'];
console.log(arr1);
console.log(arr2);
