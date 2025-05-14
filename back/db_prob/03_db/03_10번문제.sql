-- usertbl에서 김경호 보다 큰 사람들의 이름과 키를 출력하세요
select name, height from usertbl where height>(select height from usertbl where name='김경호');