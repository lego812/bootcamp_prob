DROP DATABASE IF EXISTS sqldb; -- 만약 sqldb가 존재하면 우선 삭제한다.
CREATE DATABASE sqldb;

USE sqldb;
CREATE TABLE usertbl -- 회원 테이블
( userID  	CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
  name    	VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr	  	CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1	CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2	CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
  height    	SMALLINT,  -- 키
  mDate    	DATE  -- 회원 가입일
);
CREATE TABLE buytbl -- 회원 구매 테이블(Buy Table의 약자)
(  num 		INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 순번(PK)
   userID  	CHAR(8) NOT NULL, -- 아이디(FK)
   prodName 	CHAR(6) NOT NULL, --  물품명
   groupName 	CHAR(4)  , -- 분류
   price     	INT  NOT NULL, -- 단가
   amount    	SMALLINT  NOT NULL, -- 수량
   FOREIGN KEY (userID) REFERENCES usertbl(userID)
);

INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울', NULL  , NULL      , 186, '2013-12-12');
INSERT INTO usertbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
INSERT INTO usertbl VALUES('YJS', '윤종신', 1969, '경남', NULL  , NULL      , 170, '2005-5-5');
INSERT INTO usertbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
INSERT INTO usertbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
INSERT INTO usertbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');
INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', NULL   , 30,   2);
INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200,  1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '모니터', '전자', 200,  5);
INSERT INTO buytbl VALUES(NULL, 'KBS', '청바지', '의류', 50,   3);
INSERT INTO buytbl VALUES(NULL, 'BBK', '메모리', '전자', 80,  10);
INSERT INTO buytbl VALUES(NULL, 'SSK', '책'    , '서적', 15,   5);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '청바지', '의류', 50,   1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);

SELECT * FROM usertbl;
SELECT * FROM buytbl;

-- 1.다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
select userID '사용자 아이디', sum(amount) '총 구매 개수' from buytbl group by userID;
select userID '사용자 아이디', sum(price*amount) '총 구매액' from buytbl group by userID;

-- 2.다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
select avg(amount) '평균 구매 개수' from buytbl;
select userID, avg(amount) '평균 구매 개수' from buytbl group by userID;

-- 3. 다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.
use usertbl;
select name, height from usertbl where height=(select max(height) from usertbl) or height=(select min(height) from usertbl);
select name, height from usertbl where height in ((select max(height) from usertbl), (select min(height) from usertbl));

-- 4.다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.
select count(mobile1) '휴대폰이 있는 사용자' from usertbl;

-- 5.buytbl 테이블로 다음을 처리하세요.
select userID 사용자, sum(amount*price) 총구매액 from buytbl group by userID;
select userID 사용자, sum(amount*price) 총구매액 from buytbl group by userID having 1000<sum(amount*price);

-- 6.world 데이터베이스에서 다음 질문을 처리하세요.
use world;
-- city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 총합을 구하시오.
select sum(population) from city where countrycode='kor';
-- city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최소값을 구하시오. 단 결과를 나타내는 테이블의 필드는 "최소값"으로 표시하시오.
select min(population) 최소값 from city where countrycode='kor';
-- city 테이블에서 국가코드가 'KOR'인 도시들의 평균을 구하시오.
select avg(population) from city where countrycode='kor';
-- city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최대값을 구하시오. 단 결과를 나타내는 테이블의 필드는 "최대값"으로 표시하시오.
select max(population) 최대값 from city where countrycode='kor';
-- country 테이블 각 레코드의 Name 칼럼의 글자수를 표시하시오.
select char_length(name) from country;
-- country테이블의 나라명(Name 칼럼)을 앞 세글자만 대문자로 표시하시오.
select concat((upper(substring(name,1,3))),substring(name,4)) from country;
-- country테이블의 기대수명(LifeExpectancy)을 소수점 첫째자리에서 반올림해서 표시하시오.
select round(LifeExpectancy) from country;

-- 7.employees db에서 각 부서별 관리자를 출력하세요.
use employees;

select * from dept_manager where to_date='9999-01-01';

-- 8.부서번호 d005 부서의 현재 관리자 정보를 출력하세요.
select * from dept_manager where to_date='9999-01-01' and dept_no='d005';

-- 9.employees 테이블에서 페이지네이션으로 페이지를 추출하려고 한다. 다음 조건하에서 8번 페이지의 데이터를 출력하세요.
select * from employees order by hire_date desc limit 140, 20; -- offset, amount
-- offset : (page-1) * amount

-- 10.employees db에서 재직자의 총 수를 구하시오.
select count(*) '재직자 수' from dept_emp where to_date='9999-01-01';

-- 11.employees db에서 재직자의 평균 급여를 출력하시오.
select avg(salary) from salaries where to_date='9999-01-01';

-- 12. 재직자 전체 평균 급여 보다 급여를 더 많이 받는 재직자를 출력하세요.
select * from salaries where salary>(select avg(salary) from salaries where to_date='9999-01-01') and to_date='9999-01-01';

-- 13. employees db에서 각 부서별 재직자의 수를 구하시오
select dept_no, count(*) from dept_emp where to_date='9999-01-01' group by dept_no order by dept_no;
