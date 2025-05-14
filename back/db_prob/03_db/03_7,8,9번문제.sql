select * from usertbl;

-- usertbl 테이블에서 키가 180~183 범위인 데이터를 출력하세요.
select * from usertbl where height between 180 and 183;

-- usertbl 테이블에서 주소가 '경남' 또는 '전남' 또는 '경북'인 데이터를 출력하세요.
select * from usertbl where addr='경남' or addr='전남' or addr='경북';
select * from usertbl where addr in ('경남','전남','경북');

-- usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요.
select * from usertbl where name like '김%';
select * from usertbl where name like '김__';