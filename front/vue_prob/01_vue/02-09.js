const test1 = function (a, b) { //전통적인 함수 정의
  return a + b;
};
const test2 = (a, b) => { //화살표 함수 정의
  return a + b;
};
const test3 = (a, b) => a + b; //구현부에 리턴문만 존재하는 경우
console.log(test1(3, 4));
console.log(test2(3, 4));
console.log(test3(3, 4));
