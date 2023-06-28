--[ 오라클 2강 1차]

--(1) test_file 테이블에서  파일명만 추출하기(example.txt, abc.java)
select substr('test_file',1,4) from dual;

--(2) employees 테이블에서 salary를 100의 자리에서 버림하시오.
--천단위 구분기호도 표시
select to_char(trunc(salary, -3), '9,999,999') from employees;


--(3) 현재일자와 오늘로부터 4년 5개월 6일 7시간 23분 42초 후의 날짜 구하기
select sysdate, sysdate + to_yminterval('04-05') + to_dsinterval('06 07:23:42')
from dual;


--(4) professor테이블에서 교수의 입사일 60일 후의 날짜를 구하시오.
select hiredate+60
from professor;


--(5) professor테이블에서 교수의 입사후 3개월이 되는 날짜?
select add_months(hiredate, 3)
from professor;



--(6) professor테이블에서 교수의 입사후 10년이 되는 날짜?
select hiredate + to_yminterval('10-00')
from professor;



--(7) 오늘부터 수료일(2023-08-29)까지 남은 일수는?
select to_date('2023-08-29') - sysdate from dual;


--(8) 2023-02-01 부터 오늘까지 경과된 일수는?
select sysdate - to_date('2023-02-01') from dual;


--(9) 오늘부터 크리스마스(2023-12-25)까지 남은 달수는? (months_between)
select trunc(to_number(to_date('2023-12-25') - sysdate)/30, 0) from dual;


--(10) professor테이블에서 입사한지 오늘까지 몇일 되었나?
select trunc(sysdate - hiredate,0)
from professor;


--(11) professor테이블에서 입사한지 오늘까지 몇달 되었나?
select trunc((sysdate-hiredate)/30,0) from professor;


--(12) pd테이블에서 상품을 등록한지 몇시간이 지났는지 조회
select  trunc((sysdate - regdate)*24,0)
 from pd;


--(13) 2020-02-07에 해당하는 달의 마지막 날짜는?
select last_day(to_date('2020-02-07')) from dual;


--(14) 현재일자를 다음 형식의 문자로 변환해서 출력하시오.
--2023-03-28 14:35:27 목
select to_char(sysdate, 'yyyy-mm-dd hh:mi:ss dy') from dual;


--(15) emp 테이블의 hiredate 칼럼을 참조하여 입사일이 5월인 사원의 이름과 
--hiredate, job을 출력
select* from emp;
select hiredate,ename, job
from emp
where to_char(hiredate, 'mm') = '05';

--(16)emp 테이블에서 job이 CLERK 이나 ANALYST인 사원 조회 (in 이용)
select *
from emp
where job in ('CLERK','ANALYST');

--(17) pd 테이블에서 등록일(regdate) 이  2023-03-10 ~ 2023-04-19 일 사이의 데이터만 조회하기
--to_date 함수 이용하기
select * from pd
where to_date(regdate) between '2023-03-10' and to_date('2023-04-19')+1;


--(18) emp 테이블에서 사원의 이름, 입사일, 급여(sal), 커미션(comm), 연봉(sal*12+comm)  데이터 가져오기
--comm가 null이면 0으로 계산되도록 처리한다 -  nvl 함수 사용하기
select ename, hiredate, sal, nvl(comm,0), sal*12+nvl(comm,0)
from emp;

select * from emp;
--(19) emp에서 이름, 입사일, 급여(sal), 부서 정보를 조회하되, 급여는 십의 자리에서 반올림하시오. 
--부서가 20이나 30인 데이터만 조회
select ename, hiredate, round(sal,-2), job
from emp;


--(20) emp2 테이블에서 emp_type, position 컬럼을 조회하되
--중복된 행(레코드)은 제거
select distinct emp_type, position from emp2;



--(21) emp 테이블에서 comm의 값이 없는 사원의 이름(ename), job, sal, comm 데이터 가져오기
select ename, job, sal, comm
from emp
where comm is null;


--(22) department 테이블에서 deptno, dname, build 컬럼만 조회
--조건 : 학과(dname)에 '공학'이라는 단어가 들어간 학과만을 조회하기
--정렬 : dname 순으로 내림차순으로 정렬
select deptno, dname, build
from department
where dname like '%공학%'
order by dname desc;



--(23)교수테이블에서 급여(pay)가 350에서 500사이인 교수의 이름(name), 아이디(id), 급여(pay) 데이터 가져오기
select name, id, pay
from professor
where pay between 350 and 500;



--(24) student 테이블을 참조해서 1전공이 201번인 학생의 이름과 전화번호와 지역번호를 출력. 
--단, 지역번호는 숫자만 나와야 함
select name,tel,substr(tel, 0,instr(tel,')')-1)
from student;



--(25) student 테이블에서 1전공이 201번인 학생들의 이름과 학년, 주민번호를 출력하되 
--주민번호의 뒤 7자리는 '#'로 표시되게 출력
select name, grade,to_char(substr(jumin,1,6), '999999') || '#######'
from student;
