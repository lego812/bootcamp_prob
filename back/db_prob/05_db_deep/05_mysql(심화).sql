-- 다음 컬럼을 가지는 userTBL과 buyTBL을 정의하세요.
-- ○ 기존에 테이블이 존재하면 삭제함
-- ○ userTBL
-- ○ buyTBL

drop table if exists buytbl;
drop table if exists usertbl;

create table usertbl(
	userid char(8) not null,
    name char(10) not null,
    birthyear int not null,
    constraint pk_usertbl primary key(userID)
);

create table buytbl(
	num int auto_increment not null,
    userid char(8) not null,
    prodname char(6) not null,
    constraint pk_num primary key(num),
    constraint fk_buytbl foreign key(userid) references usertbl(userid)
);
desc usertbl;
desc buytbl;

-- ALTER를 이용해 userID를 외래키로 수정하세요
alter table buytbl
	add constraint foreign key(userid) references usertbl(userid);
    

-- 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
-- ○ 기존 buyTBL, userTBL을 삭제하세요.
-- ○ 컬럼
drop table if exists buytbl;
drop table if exists usertbl;
create table usertbl(
	userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null,
--  email char(30) null unique
	email char(30) null unique
);

desc usertbl;

-- 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
drop table if exists buytbl;
drop table if exists usertbl;
create table usertbl(
	userID char(8) not null primary key,
    name varchar(10),
    birthYear int check(birthyear>=1900 and birthyear<=2023),
    mobile char(3) not null
);

desc usertbl;

-- 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
-- ○ 기존 userTBL을 삭제하세요.
drop table if exists buytbl;
drop table if exists usertbl;

-- ○ 컬럼
create table usertbl(
	userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null default -1,
    addr char(2) not null default '서울',
    mobile1 char(3) null,
    mobile2 char(8) null,
--  height smallint null default 170,
	height smallint null,
    mdate date null
);

desc usertbl;

-- ○ 기본값 추가를 확인할 수 있는 데이터를 추가하세요.
alter table usertbl
 alter column height set default 170; 
alter table usertbl
 alter column birthyear set default -1; 
alter table usertbl
 alter column addr set default '서울'; 

-- 앞에서 만든 userTBL에 대해서 다음 조건을 처리하도록 수정하세요.
-- ○ mobile1 컬럼을 삭제함
alter table usertbl
	drop column mobile1;
-- ○ name 컬럼명을 uName으로 변경함
alter table usertbl
	change name uname varchar(10);
-- ○ 기본키를 제거함
alter table usertbl
	drop primary key;


-- 모든 문제는 employees 데이터베이스에서 수행한다.
-- employees db의 ERD
use employees;

-- 다음 정보를 가지는 직원 정보를 출력하는 EMPLOYEES_INFO 뷰를 작성하세요.
create view employees_info as
	select a.emp_no, a.birth_date, a.first_name, a.last_name, a.gender, a.hire_date, d.title, d.from_date as t_from, d.to_date as t_to,e.salary,e.from_date as s_from,e.to_date as s_to from employees a
    join dept_emp b on a.emp_no=b.emp_no
    join departments c on b.dept_no=c.dept_no
    join titles d on a.emp_no=d.emp_no
    join salaries e on a.emp_no=e.emp_no
    order by a.emp_no;
-- EMPLOYEES_INFO 뷰에서 재직자의 현재 정보만 출력하세요.   
select * from employees_info
	where t_to='9999-01-01' and s_to='9999-01-01';


-- 다음 정보를 가지는 부서 정보를 출력하는 EMP_DEPT_INFO 뷰를 작성하세요.
-- create view EMP_DEPT_INFO as
-- 	select a.emp_no, a.dept_no, b.dept_name, a.from_date, a.to_date from dept_emp a inner join departments b on a.dept_no=b.dept_no;

drop view if exists EMP_DEPT_INFO;
create view EMP_DEPT_INFO as
	select a.*, b.dept_name from dept_emp a 
    join departments b on a.dept_no=b.dept_no;

select * from EMP_DEPT_INFO order by emp_no;
select * from EMP_DEPT_INFO where to_date='9999-01-01' order by emp_no;