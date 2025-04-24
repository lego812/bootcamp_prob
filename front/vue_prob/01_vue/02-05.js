function addContact(
  name = '',
  mobile = '',
  home = '없음',
  address = '없음',
  email = '없음'
) {
  let str = `name=${name}, mobile=${mobile}, home=${home}, address=${address}, email=${email}`; //문자열 템플릿으로 받고 싶을 때 벡틱주의의
  console.log(str);

  // console.log(name + ',' + mobile + ',' + home + ',' + address + ',' + email); //중간에 ','을 문자열로 하기
}
addContact('홍길동', '010-222-3331');
addContact('이몽룡', '010-222-3331', '02-3422-9900', '서울시');
