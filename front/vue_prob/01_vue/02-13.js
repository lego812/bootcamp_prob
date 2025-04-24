let obj = { result: 0 };
obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner(); //이 시점에서는 메서드를 보유한 객체가 없으므로, 전역변수 obj에 0이 할당됨.
};
obj.add(3, 4);
console.log(obj);
console.log(result); //전역변수 result호출출

//{result} 

//this 관련주의해야할 것
/*
1. 기본적으로 this는 현재 호출중인 메소드를 보유한 객체한 객체로 연결됨
2. 그러나 호출 중인 메서드를 보유한 객체가 없다면, this는 전역객체와 연결됨
다음과 같은 상황에서는 화살표 함수를 쓰면 좋음
화살표 함수 내에서 this는 함수가 정의되는 유효스코프 내의 this를 자신의 유효범위로 끌어옴
*/