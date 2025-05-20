-- tabledb 데이터베이스를 생성하세요.
-- ○ 만일, 이미 존재한다면 삭제하세요.
drop database if exists tabledb;
create database tabledb;

-- 다음 컬럼을 가지는 usertbl 테이블을 만드세요.
use tabledb;
create table usertbl (
	userID char(8) not null primary key,
    name varchar(8) not null,
    birthtyear int not null,
    addr char(2) not null,
    mobile1 char(3) null,
    mobile2 char(8) null,
    height smallint null,
    mDate date null
);

-- 다음 컬럼을 가지는 buytbl 테이블을 만드세요.
create table buytbl(
	num int auto_increment not null primary key,
    userID char(8) not null,
    prodName char(6) not null,
    groupName char(4) null,
    price int not null,
    amount smallint not null,
    foreign key(userID) references usertbl(userID)
);

-- 회원 테이블에 다음 데이터를 입력하세요.
insert into usertbl values ('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8'),
('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4' ),
('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
select * from usertbl;

-- 구매 테이블에 다음 데이터를 입력하세요.
-- ○ 에러가 난다면, 왜 발생하는지 설명하세요. ->외래키로 참조하는 usertbl에 userID jyp가없다. 이를 해결하기 위해서는 유저테이블에 jyp가 삽입된 데이터가 있어야 한다.
-- ○ 순서: userid, prodName, groupName, price, amount

INSERT INTO buytbl (userID, prodName, groupName, price, amount) VALUES 
  ('KBS', '운동화', NULL, 30, 2),
  ('KBS', '노트북', '전자', 1000, 1),
  ('JYP', '모니터', '전자', 200, 1);
  
-- 다음 컬럼을 가지는 usertbl을 정의하세요.
-- ○ 기존 usertbl이 존재하는 경우 삭제함
-- ○ 기본키는 테이블 레벨에서 정의하고 제약조건명을 함께 지정함
drop table if exists buytbl;
drop table if exists usertbl;
create table usertbl(
	userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null
);

drop table if exists prodtbl;
create table prodtbl(
	prodCode char(3) not null,
    prodID char(4) not null,
    prodDate date not null,
    proCar char(10) null,
    constraint pk primary key(prodCode, prodID)
);

-- usertbl과 buytbl을 바탕으로 다음 결과가 나오는 뷰를 정의하세요.
drop table if exists buytbl;
drop table if exists usertbl;

create table usertbl (
	userID char(8) not null primary key,
    name varchar(8) not null,
    birthtyear int not null,
    addr char(2) not null,
    mobile1 char(3) null,
    mobile2 char(8) null,
    height smallint null,
    mDate date null
);

create table buytbl(
	num int auto_increment not null primary key,
    userID char(8) not null,
    prodName char(6) not null,
    groupName char(4) null,
    price int not null,
    amount smallint not null,
    foreign key(userID) references usertbl(userID)
);

insert into usertbl values ('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8'),
('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4' ),
('JYP', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');

INSERT INTO buytbl (userID, prodName, groupName, price, amount) VALUES 
  ('KBS', '운동화', NULL, 30, 2),
  ('KBS', '노트북', '전자', 1000, 1),
  ('JYP', '모니터', '전자', 200, 1);
  
create view v_userbuytbl as
select a.userid, a.name, prodname, a.addr, concat(a.mobile1, a.mobile2) as 연락처
from usertbl a
join buytbl b
on a.userid=b.userid;

-- 위에서 정의한 뷰에서 userid가 '김범수'인 데이터만 출력하세요.
select * from v_userbuytbl where name='김범수';
  
select * from usertbl;
select * from buytbl;