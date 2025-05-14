-- usertbl을 mdata의 오름 차순으로 정렬하여 출력하세요.
select * from usertbl where mdate order by mdate;

-- usertbl을 mdata의 내림 차순으로 정렬하여 출력하세요.
select * from usertbl where mdate order by mdate desc;

-- usertbl을 height의 내림차순으로 정렬하고, 동률인 경우 name의 내림차순으로 정렬하여 출력하세요.
select * from usertbl order by height desc, name desc;