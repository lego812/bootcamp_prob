-- 국가 코드가 'KOR'인 도시를 찾아 인구수를 역순으로 표시하세요.
select population from city where CountryCode='KOR' order by Population desc;

-- city 테이블에서 국가코드와 인구수를 출력하라. 정렬은 국가코드별로 오름차순으로, 동일한 코드(국가) 안에서는 인구 수의 역순으로 표시하세요.
select countrycode, population from city order by CountryCode, population desc;

-- city 테이블에서 국가코드가 'KOR'인 도시의 수를 표시하세요.
select count(*) KOR from city where countrycode='kor';
select countrycode, count(*) from city group by CountryCode;

-- city 테이블에서 국가코드가 'KOR', 'CHN', 'JPN'인 도시를 찾으세요.
select name from city where countrycode in ('KOR', 'CHN', 'JPN');
select count(*) from city where countrycode in ('KOR', 'CHN', 'JPN') group by countrycode;

-- 국가코드가 'KOR'이면서 인구가 100만 이상인 도시를 찾으세요.
select name from city where CountryCode='kor' and population>=1000000;

-- 국가 코드가 'KOR'인 도시 중 인구수가 많은 순서로 상위 10개만 표시하세요.
select name from city where countrycode='kor' order by Population desc limit 0, 5;

-- city 테이블에서 국가코드가 'KOR'이고, 인구가 100만 이상 500만 이하인 도시를 찾으세요.
select name from city where countrycode='kor' and population between 1000000 and 5000000;