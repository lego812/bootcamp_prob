const p = new Promise((resolve, reject) => {
  setTimeout(() => {
    let num = Math.random(); //0~1
    if (num >= 0.8) {
      reject(`생성된 숫자가 0.8이상임-${num}`);
    }
    resolve(num);
  }, 2000);
});

p.then((result) => {
  console.log('처리 결과 : ', result);
});
p.catch((error) => {
  console.log('오류:', error);
});

console.log('## Promise 객체 생성!');

//promise는 성공과 실패를 출력하는 기능으로 보면 될듯
//함수 정의블록에서는 성공조건과 실패조건 ,그리고 성공 및 실패 시 반환값 정의
//then은 성공, catch는 실패
