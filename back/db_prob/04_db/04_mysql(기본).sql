-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
-- ○ 사용자별로 구매 이력을 출력함
-- ○ 모든 컬럼을 출력함
-- ○ 구매 이력이 없는 정보는 출력하지 않음
select * from buytbl b inner join usertbl u on b.userId=u.userID;

-- 앞의 결과에서 userID가 'JYP'인 데이터만 출력하세요.
select * from buytbl b inner join usertbl u on b.userId=u.userID where b.userID='jyp';

-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
-- ○ 각 사용자별로 구매 이력을 출력하세요.
-- ○ 연결 컬럼은 userID로 함
-- ○ 결과를 userID를 기준으로 오름차순으로 정렬함
-- ○ 구매이력이 없는 사용자도 출력하세요.
-- ○ userID, name, prodName, addr, 연락처를 다음과 같이 출력함
select * from usertbl a left join buytbl b on a.userID=b.userID order by a.userID;

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.
select name, concat(mobile1, mobile2) as 전화번호 from usertbl where name not in (select name from usertbl where mobile2 is null);
select name, concat(mobile1, mobile2) as 전화번호 from usertbl where name in (select name from usertbl where mobile2 is not null);
select name, concat(mobile1, mobile2) as 전화번호 from usertbl where mobile2 is not null;

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람만 출력하세요.
select name, concat(mobile1, mobile2) as 전화번호 from usertbl where mobile2 is null;
select name, concat(mobile1, mobile2) as 전화번호 from usertbl where name in (select name from usertbl where mobile2 is null);
select name, concat(mobile1, mobile2) as 전화번호 from usertbl where name not in (select name from usertbl where mobile2 is not null);


