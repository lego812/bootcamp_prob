const p1 = { name: 'john', age: 20 };
p1.age = 22;
console.log(p1);
// p1 = { name: 'lee', age: 25 };


//함수나 객체를 만든 후에 이것의 메모리 주소가 바뀌지 않게 하고 싶다면 const를 사용
//const로 객체를 생성했다면, 객체 내부 속성은 변경됨. 그러나 새로운 객체 생성하여 할당하는 것은 X
