--5강_subquery.sql
--[2023-04-26 수]

/*
서브쿼리 - 쿼리안에 또 다른 쿼리가 담겨 있는 것

select * from 테이블  --main query
where 조건 연산자 ( select 컬럼 from 테이블 where 조건)  --subquery

()안에 서브쿼리를 넣는다
*/

--Emp 테이블에서 ‘SCOTT’ 보다 급여를 많이 받는 사람의 이름과 급여를 출력하시오
--서브쿼리를 이용하지 않고 조회
--1) 먼저 scott의 급여를 구한다
select * from emp; 

select sal from emp
where ename='SCOTT';  --3000

--2) 3000보다 많이 받는 직원 조회
select * from emp
where sal > 3000;

--서브쿼리 이용
select * from emp
where sal > (select sal from emp
                where ename='SCOTT'  );
--subquery 부분은 where절의 연산자 오른쪽에 위치해야 하며
--반드시 괄호로 묶어야 함
--=> 단일행 서브쿼리 - 서브쿼리의 결과가 하나의 행인 경우

/*
  => 서브쿼리를 수행한 결과가 1건만 나오고, 이 결과를 main query로 전달해서
  main query를 수행하게 됨
  
  단일행 서브쿼리일 경우 where 절에서 사용되는 연산자
  =, !=, >, <, >=, <=
  
  ※ 서브쿼리의 종류
  1) 단일행 서브쿼리 - 서브쿼리의 결과가 1개의 행인 경우
  2) 다중행 서브쿼리 - 서브쿼리의 결과가 2개행 이상인 경우
  3) 다중컬럼 서브쿼리 - 서브쿼리의 결과가 여러 컬럼인 경우
  4) 연관성 있는 서브쿼리(상관관계 서브쿼리) - 메인쿼리와 서브쿼리가 서로 연관되어 
        있는 경우
*/

--student 테이블과 department 테이블을 사용하여 이윤나 학생과 1전공(deptno1)이 
--동일한 학생들의 이름과 1전공 이름을 출력하시오
--1) 이윤나의 1전공 조회
select * from student;

select deptno1 from student
where name='이윤나';  --101 

--2) 조회한 전공과 같은 전공인 학생들 조회
select * from student
where deptno1=101;

--join
select s.*, d.DNAME "전공명" 
from student s join department d
on s.DEPTNO1=d.DEPTNO
where s.deptno1=101;

--서브쿼리 이용
select * from student
where deptno1=(select deptno1 from student
                where name='이윤나');

--join
select s.*, d.DNAME "전공명" 
from student s join department d
on s.DEPTNO1=d.DEPTNO
where s.deptno1=(select deptno1 from student
                    where name='이윤나');

--실습) Professor 테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름과 입사일, 학과명을 출력하시오.
--professor, department테이블 이용
select p.name "교수명", p.hiredate "입사일", d.dname "학과명"
from professor p join department d
on p.deptno = d.deptno
and hiredate > (select hiredate from professor
                    where name='송도권');

--실습) student 테이블에서 1전공(deptno1)이 101번인 학과의 평균 몸무게보다 몸무게가 많은
-- 학생들의 이름과 몸무게를 출력하시오
select name "이름", weight "몸무게"
from student
where weight > (select avg(nvl(weight,0)) from student
                    where deptno1=101 );

--Professor 테이블에서 심슨 교수와 같은 입사일에 입사한 교수 중에서 조인형 교수보다 
--월급을 적게 받는 교수의 이름과 급여, 입사일을 출력하시오.
--1) 심슨의 입사일
select * from professor;

select hiredate from professor
where name='심슨'; --1981-10-23

--2) 조인형의 월급
select pay from professor
where name='조인형';  --550

--
select * from professor
where hiredate='1981-10-23'
and pay<550;

--subquery
select * from professor
where hiredate=(select hiredate from professor
                    where name='심슨')
and pay<(select pay from professor
            where name='조인형');

--emp2 테이블에서 월급이 가장 적은 사원 정보 조회
--Dept2 테이블과 조인해서 부서명도 조회할 것
--월급의 최소값(min)
select * from emp2;

select min(pay) from emp2; --2000만원

select * from emp2
where pay=20000000;

--subquery
select * from emp2
where pay=(select min(pay) from emp2);

--join
select e.*, d.DNAME 
from emp2 e join dept2 d
on e.deptno=d.DCODE
and e.pay=20000000;

select e.*, d.DNAME 
from emp2 e join dept2 d
on e.deptno=d.DCODE
and e.pay=(select min(pay) from emp2);

--다중행 서브쿼리
/*
    - 서브쿼리의 결과가 2건 이상 출력되는 경우
    - 서브쿼리의 결과가 여러 건 출력되기 때문에 단일행 연산자를 사용할 수 없음
    
    ※ 다중 행 서브쿼리 연산자
    in - 같은 값을 찾는다 (포함된 값)
    <any - 최대값을 반환함 예) sal < any(100,200,300) => 300
    >any - 최소값을 반환함 예) sal > any(100,200,300) => 100
    <all - 최소값을 반환함 예) sal < all(100,200,300) => 100
    >all - 최대값을 반환함 예) sal > all(100,200,300) => 300
    
    any - 여러 개 중 아무거나 하나만 조건을 만족해도 된다는 의미
    all - 서브쿼리에서 반환되는 모든 row 값을 만족해야 함을 의미
*/

--예제) emp2 테이블과 dept2 테이블을 참조하여 근무지역 (dept2 테이블의 area 칼럼)이 
--서울 지사인 모든 사원들의 사번과 이름, 부서번호를 출력하시오
--1) 근무지역이 서울지사인 부서
select * from dept2;
select * from emp2;

select dcode from dept2
where area='서울지사'; --1000,1001,1002,1010

--2) 조회한 서울지사인 부서에 속한 사원들 조회
select * from emp2
where deptno in (1000,1001,1002,1010);

--subquery 이용
select * from emp2
where deptno in (select dcode from dept2
                    where area='서울지사');

--예제) emp2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 
--높은 사람의 이름과 직급, 연봉을 출력하시오.
--단, 연봉 출력형식은 천 단위 구분기호와 원 표시를 하시오.
--1) 과장 직급의 연봉 조회
select pay from emp2
where position='과장';  --5000,5600,5100,4900만원

--2) 조회한 연봉의 최소값보다 많이 받는 사원 조회
select * from emp2
where pay >any (50000000,56000000,51000000,49000000);

--다중행 서브쿼리 이용
select * from emp2
where pay >any (select pay from emp2
                    where position='과장');

--단일행 서브쿼리 이용
select * from emp2
where pay > (select min(pay) from emp2
                    where position='과장');

--emp2 테이블을 사용하여 전체 직원 중 과장 직급의 최대 연봉자보다 연봉이 높은 사람의 
--이름과 직급, 연봉을 출력하시오.
--1) 과장 직급의 연봉 조회
select pay from emp2
where position='과장';  --5000,5600,5100,4900만원

--2) 조회한 연봉의 최대값보다 많이 받는 사원 조회
select * from emp2
where pay >all (50000000,56000000,51000000,49000000);

--다중행 서브쿼리 이용
select * from emp2
where pay >all (select pay from emp2
                    where position='과장');

--단일행 서브쿼리 이용
select * from emp2
where pay > (select max(pay) from emp2
                    where position='과장');
                    

--실습)student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 
--가장 적게 나가는 학생보다 몸무게가 적은 학생의 이름과 몸무게를 출력하시오.
select name "이름", grade "학년", weight "몸무게"
from student
where weight < ALL (select weight from student
                    where grade=4 ); 

select name "이름", grade "학년", weight "몸무게"
from student
where weight < (select min(weight) from student
                    where grade=4 ); 
               
--emp2 테이블을 조회하여 각 부서별 평균 연봉을 구하고 그 중에서 평균 연봉이 가장 
--적은 부서의 평균 연봉보다 적게 받는 직원들의 부서명,직원명, 연봉을 출력하시오.
select * from emp2;

select deptno, avg(nvl(pay,0)) 평균연봉
from emp2
group by deptno;

select * from emp2
where pay <all (select avg(nvl(pay,0))
                    from emp2
                    group by deptno);
--join
select e.*, d.DNAME
from emp2 e join dept2 d
on e.DEPTNO=d.DCODE
and e.pay<all (select avg(nvl(pay,0))
                from emp2
                group by deptno);	
                                        		
--
select * from emp2
where pay < (select min(avg(nvl(pay,0)))
                    from emp2
                    group by deptno);
                    
--단일행 서브쿼리에서는 != 연산자 이용
--다중행 서브쿼리에서는 not in연산자 이용
/*
    단일행 서브쿼리의 연산자       다중행 서브쿼리의 연산자
    =                               in
    !=                              not in
    >,<                             >any, <any, >all, <all
*/
--근무지역이 경기지사가 아닌 모든 사원들 조회(emp2, dept2)
select * from dept2;

select dcode from dept2
where area='경기지사';  --1005, 1009

select * from emp2
where deptno not in(1005, 1009);

--subquery이용
select * from emp2
where deptno not in(select dcode from dept2
                    where area='경기지사');


--loc가 DALLAS가 아닌 모든 사원 조회(EMP, DEPT)
select * from dept;
select * from emp;

select deptno from dept
where loc = 'DALLAS';  --20

select * from emp
where deptno != 20;

--subquery
select * from emp
where deptno != (select deptno from dept
                where loc = 'DALLAS');

--employees에서 job_id별 salary합계가 30000이상인 job_id에 속하는 사원 구하기
select job_id, sum(salary)
from employees
group by job_id
having sum(salary)>=30000;

select * from employees
where job_id in (select job_id
                from employees
                group by job_id
                having sum(salary)>=30000);


--다중 컬럼 서브쿼리(pairwise subquery)
--서브쿼리의 결과가 여러 컬럼인 경우

--student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력하시오.
--학년별 최대키 구하기
select * from student;

select grade, max(height)
from student
group by grade;

/*
1학년 - 179
2학년 - 184
3학년 - 177
4학년 - 182
*/         

--1학년 최대키를 갖는 학생 정보
select * from student
where grade=1 and height=179;  --김주현

--다중 컬럼 서브쿼리STUDENT 
select grade, height, studno, name from student
where (grade, height) in (select grade, max(height)
                            from student
                            group by grade);


--professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 
--입사일, 학과명을 출력하시오. 단 학과이름순으로 오름차순 정렬하시오.
select * from professor;

select deptno, min(hiredate)
from professor
group by deptno
order by deptno;  --101, 1980/06/23

select * from professor
where deptno=101 and hiredate='1980/06/23';  --조인형

--subquery
select deptno, hiredate, profno, name,pay from professor
where (deptno, hiredate) in (select deptno, min(hiredate)
                                from professor
                                group by deptno)
order by deptno;

--join
select p.deptno, hiredate, profno, name,pay, d.DNAME 
from professor p join department d
on p.deptno=d.DEPTNO
and (p.deptno, hiredate) in (select deptno, min(hiredate)
                            from professor 
                            group by deptno)
order by d.DNAME;

--emp2 테이블을 조회하여 직급별로 해당 직급에서 최대 연봉을 받는 직원의 이름과 
--직급, 연봉을 출력하시오. 단, 연봉순으로 오름차순 정렬하시오
select position "직급", pay  "연봉", name "사원명" 
from emp2
where (position, pay) IN ( select position, MAX(pay) 
                            from emp2
                            group by position)
order by 1; 

--직급이 없는 직원도 조회되도록
select nvl(position,'인턴') "직급", pay  "연봉", name "사원명" 
from emp2
where (nvl(position,'인턴'), pay) IN ( select nvl(position,'인턴'), MAX(pay) 
                            from emp2
                            group by position)
order by 2; 


--부서번호별로 기본급이 최대인 사원과 기본급이 최소인 사원 조회 - employees
select * from employees;

select department_id, max(salary)
from employees
group by department_id
order by 1 desc;

select department_id, min(salary)
from employees
group by department_id 
order by 1 desc;

select department_id, salary, employee_id, first_name
from employees
where (department_id, salary) in (select department_id, max(salary)
                                    from employees
                                    group by department_id)
or (department_id, salary) in (select department_id, min(salary)
                                from employees
                                group by department_id)
order by department_id desc;                                                                    
                                    
--
select department_id, salary, employee_id, first_name
 from employees
 where (nvl(department_id, -999) , salary) in(select nvl(department_id, -999),max(salary)
                                              from employees
                                              group by department_id) 
or
       (nvl(department_id, -999), salary) in(select nvl(department_id, -999),min(salary)
                                             from employees
                                             group by department_id)
order by 1 desc;

--상호 연관 sub query(연관성 있는 서브쿼리, 상관관계 서브쿼리)
/*
- 서브쿼리가 메인쿼리에 독립적이지 않고, 연관관계 즉 조인을 통해 연결되어 있는 쿼리를 말함
- 서브쿼리와 메인쿼리 사이에서 조인이 사용됨
- 메인 쿼리의 컬럼이 서브쿼리의 where조건절에 사용됨

- Main query 값을 sub query에 주고 sub query를 수행한 후,
 그 결과를 다시 main query로 반환해서 수행하는 sub query
*/

--예제) emp2 테이블을 조회하여 직원들 중에서 자신의 직급의 평균 연봉과 같거나 많이 
--받는 사람들의 이름, 직급, 현재연봉을 출력하시오.
select * from emp2;

select avg(nvl(pay,0)) from emp2
where position='부장'; --71666666.6

select * from emp2
where position='부장' and pay>=71666666.6;

--subquery 이용
select position, pay, empno,name 
from emp2 a
where pay >= (select avg(nvl(pay,0)) from emp2 b
                where b.position=a.position)
order by position;

--professor 테이블을 조회하여 교수들 중에서 자신의 학과의 평균 급여보다 적게 받는 
--교수들의 이름, 학과, 현재급여를 출력하시오
select * from professor;

select avg(nvl(pay,0))
from professor
where deptno=101;  --400

select * from professor
where deptno=101 and pay<400;

--subquery이용
select deptno, pay, profno, name, position 
from professor a
where pay< (select avg(nvl(pay,0))
                from professor b
                where b.deptno=a.deptno);

--emp 테이블을 조회하여 직원들 중에서 자신의 job의 평균 연봉(sal)보다 적거나 같게 
--받는 사람들을 조회하시오.
select * from emp; 

select avg(nvl(sal,0))
from emp
where job='CLERK'; --1037.5

select * from emp
where job='CLERK' and sal < 1037.5;

select job, sal, empno, ename, hiredate 
from emp a
where sal < (select avg(nvl(sal,0))
                from emp b
                where b.job=a.job)
order by job;
	    
--exists연산자
/*
    - 특정 컬럼값이 존재하는지 여부를 체크
    - 서브쿼리가 반환하는 결과에 메인쿼리에서 추출될 데이터들이 존재하기만 하면
      조건을 만족하게 됨
    - 성능면에서는 in보다 exists가 월등히 우수함
    
    ※in, exists 비교
    1)in - 어떤 값에 포함되는지 여부를 체크
           in은 ()안에 비교할 값이 올 수도 있고, 서브쿼리가 올 수도 있다.
    2)exists - 특정 컬럼값이 존재하는지 여부를 체크
           exists는 오직 서브쿼리만 올 수 있다. 
*/                      
--부서테이블의 pdept값이 null이 아닌 부서에 속하는 사원 추출
select * from dept2;
select * from emp2;

--in 이용
select dcode from dept2
where pdept is not null; --1000,1001,1002,1003,...

select * from emp2
where deptno in (1000,1001,1002,1003);

--
select * from emp2
where deptno in (select dcode from dept2
                    where pdept is not null);

--exists이용
select * from emp2 e
where exists (select 1 from dept2 d
                    where d.DCODE=e.DEPTNO 
                    and pdept is not null);

--join이용
select e.*
from emp2 e join dept2 d
on e.DEPTNO=d.DCODE
and pdept is not null;
	 
--경기지사에 속하는 사원들의 정보 조회
--in
select dcode from dept2
where area='경기지사'; --1005,1009

select * from emp2
where deptno in (1005,1009); --in에 특정값이 나오는 경우

select * from emp2
where deptno in (select dcode from dept2
                    where area='경기지사'); --in에 서브쿼리가 나오는 경우

--exists
select * from emp2 e
where exists (select 1 from dept2 d
                    where d.dcode=e.deptno 
                    and area='경기지사'); 

--join
select e.*, d.*
from emp2 e join dept2 d
on e.deptno=d.dcode
--and d.area='경기지사'
order by d.area;

--월급이 3000달러 이상인 사원이 속한 부서 정보를 조회
--emp, dept이용
select * from dept
where deptno in(select deptno from emp
 		where sal>=3000)
order by deptno; 

select d.* from dept d
where exists(select 1 from emp e
 		where e.deptno=d.deptno
        	and e.sal>=3000)
order by d.deptno; 
       
select d.*, e.* from dept d join emp e
on e.deptno=d.deptno
and e.sal>=3000;
--order by e.sal; 

/*
    ※ 서브쿼리 위치별 이름
    서브쿼리는 오는 위치에 따라서 그 이름이 다름
    [1] scalar subquery
     select (subquery)
     - select절에 오는 서브쿼리로 한 번에 결과를 1행씩 반환함
     
    [2] inline view
     from (subquery)
     - from절에 오는 서브쿼리
        
    [3] subquery
     where (subquery)
     - where절에 오는 서브쿼리
*/

--emp2 테이블과 dept2 테이블을 조회하여 사원들의 이름과 부서이름을 출력하시오
--join이용
select * from emp2;
select * from dept2;

select e.name , d.Dname
from emp2 e join dept2 d
on e.deptno = d.dcode;



--outer join
select e.name, d.Dname, d.dname "부서명"
from emp2 e left join dept2 d
on e.deptno = d.dcode;



--scalar subquery이용
select e.name, nvl(e.position,'-') 직급, e.deptno,
    (select dname from dept2 d where d.dcode = e.deptno) 부서명     --dname 가져오기, 1행씩 반환
from emp2 e;
--=> select문에서 사용하려면 단일 서브쿼리 중에서 단일 행이면서 단일 컬럼인 경우만 가능
--(임의의 숫자나 문자로 인식 할 수 있는 서브쿼리)

--employees, departments - 사원정보, 부서명 조회
--scalar subquery
select e.*,
    (select d.department_name from departments d 
        where e.department_id = d.department_id) 부서명
from employees e
order by department_id desc;

--outer join
select * from employees;
select * from departments;

select e.*, d.department_name
from employees e left join departments d
on e.department_id = d.department_id;
order by e.department_id desc;
--=>scalar subquery는 outer조인과 동일
--사원정보를 모두 출력하고, 부서번호가 없는 경우 scalar subquery로 조회한 부서명은
--null값이 됨

--각 부서에 해당하는 사원수 구하기
select * from dept;
select * from emp;

select count(*)
from emp
where deptno = 10;  --3건

select d.*, (select count(*) from emp e where e.deptno = d.deptno)
from dept d;

--학과별 교수의 인원수, 백분율 구하기
select * from professor;

select count(*) from professor;

select deptno, count(*) 학과별인원, round(count(*)/19*100,1) 백분율
from professor
group by rollup (deptno);

select deptno, count(*) 학과별인원, round(count(*)/(select count(*) from professor)*100,1) 백분율
from professor
group by rollup (deptno);

--employees에서 job_id별 salary(급여)합계 금액이 전체 급여금액에서 차지하는 비율구하기
select job_id, sum(salary),round(sum(salary)/(select sum(salary) from employees)*100,1) 백분율
from employees
group by rollup(job_id);


--employees에서 사원정보와 직속상관의 이름, 급여 등급 구하기
--스칼라서브쿼리 이용
--직속상관의 경우 직속상관이 없으면 사장이라고 출력
--급여 등급은 salary가 5000 미만이면 하, 5000~9999사이면 중
--10000~19999사이면 상, 20000이상이면 특상
select * from employees;

select employee_id ,first_name|| ' '|| last_name 이름, last_name(select last_name from employees) 
from employees;

select a.employee_id 사원번호, a.first_name || ' ' || a.last_name 이름, 
      case when manager_id is null then '사장'
        else (select b.first_name from employees b where a.manager_id = b.employee_id) 
    end 직속상관이름,
     case when salary < 5000 then '하'
          when salary between 5000 and 9999 then '중'
          when salary between 10000 and 19999 then '상'
          when salary > 20000 then '특상'
    end 급여등급
from employees a;
--의사컬럼(pseudoColumn), 모조컬럼, 유령컬럼
/*
    테이블에 있는 일반적인 컬럼처럼 행동하기는 하지만, 실제로 테이블에 저장되어 있지
    않은 컬럼
    [1] ROWNUM : 쿼리의 결과로 나오는 각각의 ROW들에 대한 순서값을 가리키는 의사컬럼
                - 주로 특정 개수나 그 이하의 row를 선택할 때 사용됨
    
    [2] ROWID : 테이블에 저장된 각각의 row들이 저장된 주소값을 가진 의사컬럼
                - 모든 테이블의 모든 row들은 오직 자신만의 유일한 rowid값을 갖고 있다    
*/

select * from emp;

select rownum, empno, ename, sal, rowid as "ROW_ID"
from emp;

--emp테이블 전체에서 상위 5건의 데이터 조회
select rownum, empno, ename, sal
from emp
where rownum <= 5;

--order by이용, emp에서 ename순으로 정렬한 상태에서 상위 5건 조회
select rownum, empno, ename, sal
from emp
order by ename;
--inline view 이용

select rownum, empno, ename, sal
from (
    select empno,ename,sal
    from emp
)
where rownum <= 5
order by ename;

select rownum,empno, ename, sal
from (
    select empno, ename, sal
    from emp
    order by ename
)
where rownum <= 5;


--student에서 height순서대로 상위 7명의 학생 조회하기
select * from student;

select *
from student
order by height desc;

select rownum,A.*
from(
    select * from student
    order by height desc
) A
where rownum <= 7;

--employees에서 salary로 내림차순 정렬해서 상위 6건만 조회
select * from employ
select rownum,e.*
from (
    select * from employees
    order by salary desc
) e
where rownum <= 6;

--상위에서 2~4 사이인 데이터 조회하기
select rownum, empno, ename, sal
from emp
where rownum >5;

select rownum, empno, ename, sal
from emp
where rownum >1;

select rownum, empno, ename, sal
from emp
where rownum >= 1 and rownum < 5;
--=> rownum은 1이 포함되지 않으면 데이터를 읽어오지 못함
--=> 1이 포함되도록 조건을 지정해야함

--상위에서 2~4 사이인 데이터 조회하기

select
from (
    select first_name, hire_date, salary
    from employees
    order by salary desc
)
where rownum >= 2 and rownum <= 4;  --00건 : rownum에 1이 포함되지 않으므로 
--별칭 이용                           --       between도 포함
select rownum as rowcnt, first_name, hire_date, salary
from (
    select first_name, hire_date, salary
    from employees
    order by salary desc
)
where rowcnt >= 2 and rowcnt <= 4;

--한번 더 inline view 이용
select A.*   --로우넘은 원래 존재하는거
from 
(
    select rownum as rowcnt, first_name, hire_date, salary
    from 
    (
        select first_name, hire_date, salary
        from employees
        order by salary desc
    )
    
)A
where rowcnt >= 2 and rowcnt <= 4;

select A.*
from
(
    select rowcnt,first_name, hire_date, salary
    from
    (
        select rownum as rowcnt,first_name, hire_date, salary
        from employees
    )
)A
where rowcnt >= 2 and rowcnt <=4;

--emp 테이블을 조회하여 직원들 중에서 자신의 job의 평균 연봉(sal)보다 적거나 같게 받는 사람들을 조회하시오.
--상관관계
select * from emp;
select ename, job ,sal
from emp a
where sal <= (select avg(sal)
                from emp b
                where b.job = a.job)
order by job;

--각 학과에 해당하는 교수의 수 구하기 -department, professor
select * from department;
select * from professor;

select p.deptno 학과명, count(p.deptno) 인원수
from professor p join department d
on p.deptno = d.deptno
group by rollup (p.deptno);

select d.deptno 학과명,(select count(*) from professor p where p.deptno = d.deptno) 교수의수
from department d
order by 교수의수 desc;

--각 학과에 해당하는 학생수 구하기
--department , student 테이블
select * from department;
select * from student;

select d.dname 학과명,
decode((select count(*) from student s where d.deptno = s.deptno1),0,'없음',(select count(*) from student s where d.deptno = s.deptno1)) 인원수,
(select count(*) from professor p where p.deptno = d.deptno) 교수의수
from department d
order by 인원수 desc;

--Professor 테이블에서 월급을 많이 받는 교수 순으로 10명 조회하기
select * from professor;

select rownum,A.*
from
(
    select * from professor
    order by pay desc
) A
where rownum <= 10;

select *
from professor
where pay >= 330;


--Student, exam_01 테이블에서 총점이 90이상인 학생들의 정보 조회
select * from student;
select * from exam_01;

select s.studno 학번, s.name 이름, s.grade 학년, e.total 점수
from student s join exam_01 e
on s.studno = e.studno
and total >= 90;

select *
from student
where studno in (select studno from exam_01 where total >= 90);

select *
from student s
where exists(select 1 from exam_01 e 
                where e.studno = s.studno and e.total >= 90);

--1.job이 MANAGER인 사원들 조회(emp)
select * from emp where job = 'MANAGER';

--2. job이 Manager인 모든 사원들보다 입사일이 빠른(작은) 사원 데이터 조회 => all 이용 (emp)
select * from emp
where hiredate < all(select hiredate from emp where job = 'MANAGER');

--3. ALL없이 결과값 출력 <= MIN함수를 써서
--all를 안쓸려면 서브쿼리에서 발생되는 데이터가 1개이면  됨
--결과값이 무조건 하나인 경우=> 집계함수 (집계함수는 결과값이 1개)
select *
from emp
where hiredate < (select min(hiredate) from emp where job = 'MANAGER');

--4. sales부서에 근무하는 사원 데이터 조회
select * from emp;
select * from dept;

select e.*
from emp e join dept d
on e.deptno = d.deptno
and e.deptno = 30;

select *
from emp 
where deptno = (select deptno from dept where dname = 'SALES');

--5. 평균급여보다 급여를 많이 받는 사원 데이터 가져오기 (emp)
select *
from emp
where sal > all(select avg(sal) from emp);

--inline view
--employees에서 사원정보를 조회하고, job_id별 salary평균도 출력
select * from employees;

select job_id,nvl(avg(sal),0) from employees 
    group by job_id
    order by job_id;

 
--job_id별 salary평균
select e1.job_id, e1.employee_id, e1.first_name, e1.hire_date, e1.salary, e2.평균급여
from employees e1 join
(
    select job_id,nvl(avg(salary),0) 평균급여 from employees
    group by job_id
) e2
on e1.job_id = e2.job_id;


--로그인 처리
--id:simson, pwd:a1234 가 모두 맞으면 로그인 성공, id만 일치하면 비밀번호 불일치
--id가 없으면 해당아이디 없음
select * from member;

select case (select count(*) from member where id = 'simson' and passwd = 'a1234')
            when 1 then '로그인성공'
            else '로그인 실패'
        end 로그인
from dual;

select case (select count(*) from member where id = 'simson' and passwd = 'a1234')
            when 1 then '로그인성공'
            else 
                case (select count(*) from member where id = 'simson')
                    when 1 then '비밀번호 불일치'
                    else '해당 아이디 존재하지 않음'
                end
        end 로그인
from dual;

--사용자로부터 입력값 받아와서 처리하기
select case (select count(*) from member where id = :id and passwd = :pwd)
            when 1 then '로그인성공'
            else 
                case (select count(*) from member where id = :id)
                    when 1 then '비밀번호 불일치'
                    else '해당 아이디 존재하지 않음'
                end
        end 로그인
from dual;

--decode 이용
select decode((select count(*) from member where id = :id and passwd = :pwd),1,'로그인 성공',
        decode((select count(*) from member where id = :id),1,'비밀번호 불일치', '해당 아이디가 존재하지 않음')) 
        로그인
from dual;


--inline view
--gogak에서 10대, 30대 남자 조회
--10,12,17  => 10
--30,33,38  => 30

select * from gogak;

select gno, gname, jumin,
    case when substr(jumin, 7, 1) in ('1', '3') then '남' else '여' end 성별,
    extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
            +1 나이,
    trunc(extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
            +1, -1) 연령대
from gogak;
--where 성별 = '남';

select A.*
from
(
select gno, gname, jumin,
    case when substr(jumin, 7, 1) in ('1', '3') then '남' else '여' end 성별,
    extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                +1 나이,
    trunc(extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                 +1, -1) 연령대
    from gogak
) A
where 성별 = '남' and 연령대 in (10, 30);

--gogak에서 연령대별 인원수와 백분율 출력

select 연령대, count(*) 인원수, round(count(*)/(select count(*) from gogak)*100,1) 백분율
from
(
    select gno, gname, jumin,
        case when substr(jumin, 7, 1) in ('1', '3') then '남' else '여' end 성별,
        extract(year from sysdate)
            -(substr(jumin,1,2)
                + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                    +1 나이,
        trunc(extract(year from sysdate)
            -(substr(jumin,1,2)
                + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                     +1, -1) 연령대
        from gogak
)A
group by 연령대
order by 연령대;


--학년별, 성별 인원수와 백분율 구하기  --숙제
--student



--job_history의 정보를 조회하되 job_id에 해당하는 job_title, dapartment_id에 해당하는
--부서명도 조회
--스칼라 서브쿼리 이용
--job_history, jobs, departments
select j.*, 
        (select a.job_title from jobs a where j.job_id = a.job_ID) 잡타이틀, 
        (select department_id from departments d 
            where d.department_id = j.department_id) 디파트먼트아이디
from job_history j;

--사원정보도 조회
select j.*,
        (select a.job_title from jobs a where j.job_id = a.job_ID) 잡타이틀, 
        (select department_id from departments d 
            where d.department_id = j.department_id) 디파트먼트아이디, e.*
from job_history j right join employees e
on j.employee_id = e.employee_id;

--departments, employees 조인해서 부서에 해당하는 사원들 정보 조회하기
--사원은 모두 출력
--부서번호 순서로 정렬
select d.*, e.employee_id, e.first_name, e.salary
from departments d right join employees e
on d.department_id = e.department_id;

select * from employees;
 
--부서장명도 조회
--departments테이블에서 employees와 조인해서 부서장명을 먼저 구한다
select  e.first_name || ' ' || last_name 부서장명
from department d right join employees e
on d.manager_id = e.employee_id
order by d.department_id;

--inline view이용
select A.*, e.first_name 부서장명
from 
(   
    select  d.*,e.first_name,e.salary,e.first_name
    from department d right join employees e
    on d.manager_id = e.employee_id
    order by d.department_id
) A right join employees e
on A.manager_id = e.employee_id
order by A.department_id;





----각 부서에 속하는 사원정보를 조회하고, 부서별 평균급여도 출력하시오


--[1] 각 부서에 속하는 사원정보를 조회하는 데이터 집합 구하기


--[2] 부서별 평균급여를 조회하는 데이터 집합 (salary+salary*commission_pct)



--[3] 두 개의 데이터집합을 이용해서 outer join한다

