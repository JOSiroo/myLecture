--[ 오라클 5강 ]


--(1) 김재수와  학과(deptno1)가 같은 학생들의 학번(studno), 이름(name), 학년(grade), 학과번호(deptno1)를 조회하되 이름(name)의 내림차순으로 조회
--서브 쿼리 이용 
select * from student;

select studno, name, grade, deptno1
from student
where deptno1 in (select deptno1 from student where name = '김재수')
order by name desc;


--(2) 급여(pay)가 교수 전체의 평균급여보다 큰 교수의 이름(name), 직급(position), 급여(pay), 입사일(hiredate)의 데이터 가져오기.
--서브 쿼리 이용
select * from professor;

select name, position, pay, hiredate
from professor
where pay > (select avg(pay) from professor);

--(3) emp2 테이블과 dept2 테이블을 참조하여 근무지역 
--(dept2 테이블의 area 칼럼)이 포항본사인 모든 사원들의 사번과 이름, 부서번호를 출력하시오
select * from emp2;
select * from dept2;

select d.area, e.empno, e.name, deptno
from emp2 e join dept2 d
on e.deptno = d.dcode
and d.area = '포항본사';

--(4) loc가 CHICAGO 가 아닌 모든 사원 조회(emp, dept)
select * from emp;
select * from dept;

select *
from emp e left join dept d
on d.deptno = e.deptno
and not(d.loc = 'CHICAGO');

--(5) emp2 테이블을 조회하여 각 부서별 평균 연봉을 구하고 그 중에서 
--평균 연봉이 가장 적은 부서의 평균 연봉보다 많이 받는 직원들의 부서명,직원명, 연봉을 출력하시오.
--다중행 서브쿼리 이용
select * from emp2;

select deptno, name, pay
from emp2 
where pay > any(select avg(pay) from emp2 group by deptno);


--단일행 서브쿼리 이용

select deptno, name, pay
from emp2
where pay > (select min(avg(pay)) from emp2 group by deptno);

--(6) professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 
--교수번호와 이름, 입사일, 학과명을 출력하시오. 
--단 학과이름순으로 오름차순 정렬하시오.
select * from professor;

select profno, name, hiredate, deptno
from professor
where hiredate in (select min(hiredate) from professor group by deptno);

--(7) Professor 테이블에서 심슨 교수와 같은 입사일에 입사한 교수 중에서 조인형 교수보다 월급을 적게 
--받는 교수의 이름과 급여, 입사일을 출력하시오.
select * from professor;

select name, pay, hiredate
from professor
where hiredate = (select hiredate from professor where name = '심슨')
                and pay < (select pay from professor where name = '조인형');

--(8) employees 테이블을 조회하여 직원들 중에서 자신의 부서의 평균 급여보다 적게 받는 사람들의 이름, 부서번호, 
--현재급여를 출력하시오.
select * from employees;

select first_name || ' ' || last_name 이름, department_id, salary
from employees
where salary < all(select avg(salary) from employees group by department_id);


--(9) job_history, jobs 테이블에서  job_title이 Public Accountant 인 사원들의 
--job_history 정보 조회
--in 이용
select * from job_history;
select * from jobs;

select h.*
from jobs j right join job_history h
on j.job_id = h.job_id
and j.job_title in 'Public Accountant';


--(10) 학과별 교수의 인원수와 백분율 구하기- professor 테이블 이용
select * from professor;

select deptno, count(*), round(count(*)/19*100,1)
from professor
group by rollup (deptno);

--(11) employees에서 사원정보와 직속상관의 이름 구하기
--스칼라서브쿼리 이용
--직속상관의 경우 직속상관이 없으면 사장이라고 출력
select * from employees;

select first_name || ' ' || last_name 사원이름, 
   nvl((select first_name || ' ' || last_name 
        from employees e2 where e2.employee_id = e1.manager_id),'사장') 직속상관
from employees e1;

--(12) employees 테이블을 조회하여 직원들 중에서 자신의 부서의 평균 급여보다 적게 받는 사람들의 이름, 부서번호, 
--현재급여를 출력하시오.
select * from employees;
select first_name || ' ' || last_name 사원이름, department_id,salary
from employees
where salary < all(select avg(salary) from employees group by department_id);


--(13) professor 테이블과 department 테이블을 조회하여 교수들의 정보와 학과이름을 조회
--스칼라 서브쿼리 이용 
select * from professor;
select * from department;

select p.*, (select dname from department d where d.deptno = p.deptno)
from professor p;

--(14) 각 부서에 해당하는 사원수 구하기
--departments, employees 이용
select * from departments;
select * from employees;

select  d.department_id,count(*)
from employees e join departments d
on e.department_id = d.department_id
group by rollup (d.department_id);



--(15) Student, exam_01 테이블에서  총점이 90이상인 학생들의 정보 조회
--exists 이용
select * from student;
select * from exam_01;

select s.*
from student s
where exists(select 1 from exam_01 e where s.studno = e.studno and e.total >= 90);


--in 이용
select *
from student
where studno in (select studno from exam_01 where total >= 90);
