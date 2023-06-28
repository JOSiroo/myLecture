--[ ����Ŭ 5�� ]


--(1) �������  �а�(deptno1)�� ���� �л����� �й�(studno), �̸�(name), �г�(grade), �а���ȣ(deptno1)�� ��ȸ�ϵ� �̸�(name)�� ������������ ��ȸ
--���� ���� �̿� 
select * from student;

select studno, name, grade, deptno1
from student
where deptno1 in (select deptno1 from student where name = '�����')
order by name desc;


--(2) �޿�(pay)�� ���� ��ü�� ��ձ޿����� ū ������ �̸�(name), ����(position), �޿�(pay), �Ի���(hiredate)�� ������ ��������.
--���� ���� �̿�
select * from professor;

select name, position, pay, hiredate
from professor
where pay > (select avg(pay) from professor);

--(3) emp2 ���̺�� dept2 ���̺��� �����Ͽ� �ٹ����� 
--(dept2 ���̺��� area Į��)�� ���׺����� ��� ������� ����� �̸�, �μ���ȣ�� ����Ͻÿ�
select * from emp2;
select * from dept2;

select d.area, e.empno, e.name, deptno
from emp2 e join dept2 d
on e.deptno = d.dcode
and d.area = '���׺���';

--(4) loc�� CHICAGO �� �ƴ� ��� ��� ��ȸ(emp, dept)
select * from emp;
select * from dept;

select *
from emp e left join dept d
on d.deptno = e.deptno
and not(d.loc = 'CHICAGO');

--(5) emp2 ���̺��� ��ȸ�Ͽ� �� �μ��� ��� ������ ���ϰ� �� �߿��� 
--��� ������ ���� ���� �μ��� ��� �������� ���� �޴� �������� �μ���,������, ������ ����Ͻÿ�.
--������ �������� �̿�
select * from emp2;

select deptno, name, pay
from emp2 
where pay > any(select avg(pay) from emp2 group by deptno);


--������ �������� �̿�

select deptno, name, pay
from emp2
where pay > (select min(avg(pay)) from emp2 group by deptno);

--(6) professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ 
--������ȣ�� �̸�, �Ի���, �а����� ����Ͻÿ�. 
--�� �а��̸������� �������� �����Ͻÿ�.
select * from professor;

select profno, name, hiredate, deptno
from professor
where hiredate in (select min(hiredate) from professor group by deptno);

--(7) Professor ���̺��� �ɽ� ������ ���� �Ի��Ͽ� �Ի��� ���� �߿��� ������ �������� ������ ���� 
--�޴� ������ �̸��� �޿�, �Ի����� ����Ͻÿ�.
select * from professor;

select name, pay, hiredate
from professor
where hiredate = (select hiredate from professor where name = '�ɽ�')
                and pay < (select pay from professor where name = '������');

--(8) employees ���̺��� ��ȸ�Ͽ� ������ �߿��� �ڽ��� �μ��� ��� �޿����� ���� �޴� ������� �̸�, �μ���ȣ, 
--����޿��� ����Ͻÿ�.
select * from employees;

select first_name || ' ' || last_name �̸�, department_id, salary
from employees
where salary < all(select avg(salary) from employees group by department_id);


--(9) job_history, jobs ���̺���  job_title�� Public Accountant �� ������� 
--job_history ���� ��ȸ
--in �̿�
select * from job_history;
select * from jobs;

select h.*
from jobs j right join job_history h
on j.job_id = h.job_id
and j.job_title in 'Public Accountant';


--(10) �а��� ������ �ο����� ����� ���ϱ�- professor ���̺� �̿�
select * from professor;

select deptno, count(*), round(count(*)/19*100,1)
from professor
group by rollup (deptno);

--(11) employees���� ��������� ���ӻ���� �̸� ���ϱ�
--��Į�󼭺����� �̿�
--���ӻ���� ��� ���ӻ���� ������ �����̶�� ���
select * from employees;

select first_name || ' ' || last_name ����̸�, 
   nvl((select first_name || ' ' || last_name 
        from employees e2 where e2.employee_id = e1.manager_id),'����') ���ӻ��
from employees e1;

--(12) employees ���̺��� ��ȸ�Ͽ� ������ �߿��� �ڽ��� �μ��� ��� �޿����� ���� �޴� ������� �̸�, �μ���ȣ, 
--����޿��� ����Ͻÿ�.
select * from employees;
select first_name || ' ' || last_name ����̸�, department_id,salary
from employees
where salary < all(select avg(salary) from employees group by department_id);


--(13) professor ���̺�� department ���̺��� ��ȸ�Ͽ� �������� ������ �а��̸��� ��ȸ
--��Į�� �������� �̿� 
select * from professor;
select * from department;

select p.*, (select dname from department d where d.deptno = p.deptno)
from professor p;

--(14) �� �μ��� �ش��ϴ� ����� ���ϱ�
--departments, employees �̿�
select * from departments;
select * from employees;

select  d.department_id,count(*)
from employees e join departments d
on e.department_id = d.department_id
group by rollup (d.department_id);



--(15) Student, exam_01 ���̺���  ������ 90�̻��� �л����� ���� ��ȸ
--exists �̿�
select * from student;
select * from exam_01;

select s.*
from student s
where exists(select 1 from exam_01 e where s.studno = e.studno and e.total >= 90);


--in �̿�
select *
from student
where studno in (select studno from exam_01 where total >= 90);
