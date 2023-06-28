--5��_subquery.sql
--[2023-04-26 ��]

/*
�������� - �����ȿ� �� �ٸ� ������ ��� �ִ� ��

select * from ���̺�  --main query
where ���� ������ ( select �÷� from ���̺� where ����)  --subquery

()�ȿ� ���������� �ִ´�
*/

--Emp ���̺��� ��SCOTT�� ���� �޿��� ���� �޴� ����� �̸��� �޿��� ����Ͻÿ�
--���������� �̿����� �ʰ� ��ȸ
--1) ���� scott�� �޿��� ���Ѵ�
select * from emp; 

select sal from emp
where ename='SCOTT';  --3000

--2) 3000���� ���� �޴� ���� ��ȸ
select * from emp
where sal > 3000;

--�������� �̿�
select * from emp
where sal > (select sal from emp
                where ename='SCOTT'  );
--subquery �κ��� where���� ������ �����ʿ� ��ġ�ؾ� �ϸ�
--�ݵ�� ��ȣ�� ����� ��
--=> ������ �������� - ���������� ����� �ϳ��� ���� ���

/*
  => ���������� ������ ����� 1�Ǹ� ������, �� ����� main query�� �����ؼ�
  main query�� �����ϰ� ��
  
  ������ ���������� ��� where ������ ���Ǵ� ������
  =, !=, >, <, >=, <=
  
  �� ���������� ����
  1) ������ �������� - ���������� ����� 1���� ���� ���
  2) ������ �������� - ���������� ����� 2���� �̻��� ���
  3) �����÷� �������� - ���������� ����� ���� �÷��� ���
  4) ������ �ִ� ��������(������� ��������) - ���������� ���������� ���� �����Ǿ� 
        �ִ� ���
*/

--student ���̺�� department ���̺��� ����Ͽ� ������ �л��� 1����(deptno1)�� 
--������ �л����� �̸��� 1���� �̸��� ����Ͻÿ�
--1) �������� 1���� ��ȸ
select * from student;

select deptno1 from student
where name='������';  --101 

--2) ��ȸ�� ������ ���� ������ �л��� ��ȸ
select * from student
where deptno1=101;

--join
select s.*, d.DNAME "������" 
from student s join department d
on s.DEPTNO1=d.DEPTNO
where s.deptno1=101;

--�������� �̿�
select * from student
where deptno1=(select deptno1 from student
                where name='������');

--join
select s.*, d.DNAME "������" 
from student s join department d
on s.DEPTNO1=d.DEPTNO
where s.deptno1=(select deptno1 from student
                    where name='������');

--�ǽ�) Professor ���̺��� �Ի����� �۵��� �������� ���߿� �Ի��� ����� �̸��� �Ի���, �а����� ����Ͻÿ�.
--professor, department���̺� �̿�
select p.name "������", p.hiredate "�Ի���", d.dname "�а���"
from professor p join department d
on p.deptno = d.deptno
and hiredate > (select hiredate from professor
                    where name='�۵���');

--�ǽ�) student ���̺��� 1����(deptno1)�� 101���� �а��� ��� �����Ժ��� �����԰� ����
-- �л����� �̸��� �����Ը� ����Ͻÿ�
select name "�̸�", weight "������"
from student
where weight > (select avg(nvl(weight,0)) from student
                    where deptno1=101 );

--Professor ���̺��� �ɽ� ������ ���� �Ի��Ͽ� �Ի��� ���� �߿��� ������ �������� 
--������ ���� �޴� ������ �̸��� �޿�, �Ի����� ����Ͻÿ�.
--1) �ɽ��� �Ի���
select * from professor;

select hiredate from professor
where name='�ɽ�'; --1981-10-23

--2) �������� ����
select pay from professor
where name='������';  --550

--
select * from professor
where hiredate='1981-10-23'
and pay<550;

--subquery
select * from professor
where hiredate=(select hiredate from professor
                    where name='�ɽ�')
and pay<(select pay from professor
            where name='������');

--emp2 ���̺��� ������ ���� ���� ��� ���� ��ȸ
--Dept2 ���̺�� �����ؼ� �μ��� ��ȸ�� ��
--������ �ּҰ�(min)
select * from emp2;

select min(pay) from emp2; --2000����

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

--������ ��������
/*
    - ���������� ����� 2�� �̻� ��µǴ� ���
    - ���������� ����� ���� �� ��µǱ� ������ ������ �����ڸ� ����� �� ����
    
    �� ���� �� �������� ������
    in - ���� ���� ã�´� (���Ե� ��)
    <any - �ִ밪�� ��ȯ�� ��) sal < any(100,200,300) => 300
    >any - �ּҰ��� ��ȯ�� ��) sal > any(100,200,300) => 100
    <all - �ּҰ��� ��ȯ�� ��) sal < all(100,200,300) => 100
    >all - �ִ밪�� ��ȯ�� ��) sal > all(100,200,300) => 300
    
    any - ���� �� �� �ƹ��ų� �ϳ��� ������ �����ص� �ȴٴ� �ǹ�
    all - ������������ ��ȯ�Ǵ� ��� row ���� �����ؾ� ���� �ǹ�
*/

--����) emp2 ���̺�� dept2 ���̺��� �����Ͽ� �ٹ����� (dept2 ���̺��� area Į��)�� 
--���� ������ ��� ������� ����� �̸�, �μ���ȣ�� ����Ͻÿ�
--1) �ٹ������� ���������� �μ�
select * from dept2;
select * from emp2;

select dcode from dept2
where area='��������'; --1000,1001,1002,1010

--2) ��ȸ�� ���������� �μ��� ���� ����� ��ȸ
select * from emp2
where deptno in (1000,1001,1002,1010);

--subquery �̿�
select * from emp2
where deptno in (select dcode from dept2
                    where area='��������');

--����) emp2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� ������ 
--���� ����� �̸��� ����, ������ ����Ͻÿ�.
--��, ���� ��������� õ ���� ���б�ȣ�� �� ǥ�ø� �Ͻÿ�.
--1) ���� ������ ���� ��ȸ
select pay from emp2
where position='����';  --5000,5600,5100,4900����

--2) ��ȸ�� ������ �ּҰ����� ���� �޴� ��� ��ȸ
select * from emp2
where pay >any (50000000,56000000,51000000,49000000);

--������ �������� �̿�
select * from emp2
where pay >any (select pay from emp2
                    where position='����');

--������ �������� �̿�
select * from emp2
where pay > (select min(pay) from emp2
                    where position='����');

--emp2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ִ� �����ں��� ������ ���� ����� 
--�̸��� ����, ������ ����Ͻÿ�.
--1) ���� ������ ���� ��ȸ
select pay from emp2
where position='����';  --5000,5600,5100,4900����

--2) ��ȸ�� ������ �ִ밪���� ���� �޴� ��� ��ȸ
select * from emp2
where pay >all (50000000,56000000,51000000,49000000);

--������ �������� �̿�
select * from emp2
where pay >all (select pay from emp2
                    where position='����');

--������ �������� �̿�
select * from emp2
where pay > (select max(pay) from emp2
                    where position='����');
                    

--�ǽ�)student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� 
--���� ���� ������ �л����� �����԰� ���� �л��� �̸��� �����Ը� ����Ͻÿ�.
select name "�̸�", grade "�г�", weight "������"
from student
where weight < ALL (select weight from student
                    where grade=4 ); 

select name "�̸�", grade "�г�", weight "������"
from student
where weight < (select min(weight) from student
                    where grade=4 ); 
               
--emp2 ���̺��� ��ȸ�Ͽ� �� �μ��� ��� ������ ���ϰ� �� �߿��� ��� ������ ���� 
--���� �μ��� ��� �������� ���� �޴� �������� �μ���,������, ������ ����Ͻÿ�.
select * from emp2;

select deptno, avg(nvl(pay,0)) ��տ���
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
                    
--������ �������������� != ������ �̿�
--������ �������������� not in������ �̿�
/*
    ������ ���������� ������       ������ ���������� ������
    =                               in
    !=                              not in
    >,<                             >any, <any, >all, <all
*/
--�ٹ������� ������簡 �ƴ� ��� ����� ��ȸ(emp2, dept2)
select * from dept2;

select dcode from dept2
where area='�������';  --1005, 1009

select * from emp2
where deptno not in(1005, 1009);

--subquery�̿�
select * from emp2
where deptno not in(select dcode from dept2
                    where area='�������');


--loc�� DALLAS�� �ƴ� ��� ��� ��ȸ(EMP, DEPT)
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

--employees���� job_id�� salary�հ谡 30000�̻��� job_id�� ���ϴ� ��� ���ϱ�
select job_id, sum(salary)
from employees
group by job_id
having sum(salary)>=30000;

select * from employees
where job_id in (select job_id
                from employees
                group by job_id
                having sum(salary)>=30000);


--���� �÷� ��������(pairwise subquery)
--���������� ����� ���� �÷��� ���

--student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ����Ͻÿ�.
--�г⺰ �ִ�Ű ���ϱ�
select * from student;

select grade, max(height)
from student
group by grade;

/*
1�г� - 179
2�г� - 184
3�г� - 177
4�г� - 182
*/         

--1�г� �ִ�Ű�� ���� �л� ����
select * from student
where grade=1 and height=179;  --������

--���� �÷� ��������STUDENT 
select grade, height, studno, name from student
where (grade, height) in (select grade, max(height)
                            from student
                            group by grade);


--professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, 
--�Ի���, �а����� ����Ͻÿ�. �� �а��̸������� �������� �����Ͻÿ�.
select * from professor;

select deptno, min(hiredate)
from professor
group by deptno
order by deptno;  --101, 1980/06/23

select * from professor
where deptno=101 and hiredate='1980/06/23';  --������

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

--emp2 ���̺��� ��ȸ�Ͽ� ���޺��� �ش� ���޿��� �ִ� ������ �޴� ������ �̸��� 
--����, ������ ����Ͻÿ�. ��, ���������� �������� �����Ͻÿ�
select position "����", pay  "����", name "�����" 
from emp2
where (position, pay) IN ( select position, MAX(pay) 
                            from emp2
                            group by position)
order by 1; 

--������ ���� ������ ��ȸ�ǵ���
select nvl(position,'����') "����", pay  "����", name "�����" 
from emp2
where (nvl(position,'����'), pay) IN ( select nvl(position,'����'), MAX(pay) 
                            from emp2
                            group by position)
order by 2; 


--�μ���ȣ���� �⺻���� �ִ��� ����� �⺻���� �ּ��� ��� ��ȸ - employees
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

--��ȣ ���� sub query(������ �ִ� ��������, ������� ��������)
/*
- ���������� ���������� ���������� �ʰ�, �������� �� ������ ���� ����Ǿ� �ִ� ������ ����
- ���������� �������� ���̿��� ������ ����
- ���� ������ �÷��� ���������� where�������� ����

- Main query ���� sub query�� �ְ� sub query�� ������ ��,
 �� ����� �ٽ� main query�� ��ȯ�ؼ� �����ϴ� sub query
*/

--����) emp2 ���̺��� ��ȸ�Ͽ� ������ �߿��� �ڽ��� ������ ��� ������ ���ų� ���� 
--�޴� ������� �̸�, ����, ���翬���� ����Ͻÿ�.
select * from emp2;

select avg(nvl(pay,0)) from emp2
where position='����'; --71666666.6

select * from emp2
where position='����' and pay>=71666666.6;

--subquery �̿�
select position, pay, empno,name 
from emp2 a
where pay >= (select avg(nvl(pay,0)) from emp2 b
                where b.position=a.position)
order by position;

--professor ���̺��� ��ȸ�Ͽ� ������ �߿��� �ڽ��� �а��� ��� �޿����� ���� �޴� 
--�������� �̸�, �а�, ����޿��� ����Ͻÿ�
select * from professor;

select avg(nvl(pay,0))
from professor
where deptno=101;  --400

select * from professor
where deptno=101 and pay<400;

--subquery�̿�
select deptno, pay, profno, name, position 
from professor a
where pay< (select avg(nvl(pay,0))
                from professor b
                where b.deptno=a.deptno);

--emp ���̺��� ��ȸ�Ͽ� ������ �߿��� �ڽ��� job�� ��� ����(sal)���� ���ų� ���� 
--�޴� ������� ��ȸ�Ͻÿ�.
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
	    
--exists������
/*
    - Ư�� �÷����� �����ϴ��� ���θ� üũ
    - ���������� ��ȯ�ϴ� ����� ������������ ����� �����͵��� �����ϱ⸸ �ϸ�
      ������ �����ϰ� ��
    - ���ɸ鿡���� in���� exists�� ������ �����
    
    ��in, exists ��
    1)in - � ���� ���ԵǴ��� ���θ� üũ
           in�� ()�ȿ� ���� ���� �� ���� �ְ�, ���������� �� ���� �ִ�.
    2)exists - Ư�� �÷����� �����ϴ��� ���θ� üũ
           exists�� ���� ���������� �� �� �ִ�. 
*/                      
--�μ����̺��� pdept���� null�� �ƴ� �μ��� ���ϴ� ��� ����
select * from dept2;
select * from emp2;

--in �̿�
select dcode from dept2
where pdept is not null; --1000,1001,1002,1003,...

select * from emp2
where deptno in (1000,1001,1002,1003);

--
select * from emp2
where deptno in (select dcode from dept2
                    where pdept is not null);

--exists�̿�
select * from emp2 e
where exists (select 1 from dept2 d
                    where d.DCODE=e.DEPTNO 
                    and pdept is not null);

--join�̿�
select e.*
from emp2 e join dept2 d
on e.DEPTNO=d.DCODE
and pdept is not null;
	 
--������翡 ���ϴ� ������� ���� ��ȸ
--in
select dcode from dept2
where area='�������'; --1005,1009

select * from emp2
where deptno in (1005,1009); --in�� Ư������ ������ ���

select * from emp2
where deptno in (select dcode from dept2
                    where area='�������'); --in�� ���������� ������ ���

--exists
select * from emp2 e
where exists (select 1 from dept2 d
                    where d.dcode=e.deptno 
                    and area='�������'); 

--join
select e.*, d.*
from emp2 e join dept2 d
on e.deptno=d.dcode
--and d.area='�������'
order by d.area;

--������ 3000�޷� �̻��� ����� ���� �μ� ������ ��ȸ
--emp, dept�̿�
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
    �� �������� ��ġ�� �̸�
    ���������� ���� ��ġ�� ���� �� �̸��� �ٸ�
    [1] scalar subquery
     select (subquery)
     - select���� ���� ���������� �� ���� ����� 1�྿ ��ȯ��
     
    [2] inline view
     from (subquery)
     - from���� ���� ��������
        
    [3] subquery
     where (subquery)
     - where���� ���� ��������
*/

--emp2 ���̺�� dept2 ���̺��� ��ȸ�Ͽ� ������� �̸��� �μ��̸��� ����Ͻÿ�
--join�̿�
select * from emp2;
select * from dept2;

select e.name , d.Dname
from emp2 e join dept2 d
on e.deptno = d.dcode;



--outer join
select e.name, d.Dname, d.dname "�μ���"
from emp2 e left join dept2 d
on e.deptno = d.dcode;



--scalar subquery�̿�
select e.name, nvl(e.position,'-') ����, e.deptno,
    (select dname from dept2 d where d.dcode = e.deptno) �μ���     --dname ��������, 1�྿ ��ȯ
from emp2 e;
--=> select������ ����Ϸ��� ���� �������� �߿��� ���� ���̸鼭 ���� �÷��� ��츸 ����
--(������ ���ڳ� ���ڷ� �ν� �� �� �ִ� ��������)

--employees, departments - �������, �μ��� ��ȸ
--scalar subquery
select e.*,
    (select d.department_name from departments d 
        where e.department_id = d.department_id) �μ���
from employees e
order by department_id desc;

--outer join
select * from employees;
select * from departments;

select e.*, d.department_name
from employees e left join departments d
on e.department_id = d.department_id;
order by e.department_id desc;
--=>scalar subquery�� outer���ΰ� ����
--��������� ��� ����ϰ�, �μ���ȣ�� ���� ��� scalar subquery�� ��ȸ�� �μ�����
--null���� ��

--�� �μ��� �ش��ϴ� ����� ���ϱ�
select * from dept;
select * from emp;

select count(*)
from emp
where deptno = 10;  --3��

select d.*, (select count(*) from emp e where e.deptno = d.deptno)
from dept d;

--�а��� ������ �ο���, ����� ���ϱ�
select * from professor;

select count(*) from professor;

select deptno, count(*) �а����ο�, round(count(*)/19*100,1) �����
from professor
group by rollup (deptno);

select deptno, count(*) �а����ο�, round(count(*)/(select count(*) from professor)*100,1) �����
from professor
group by rollup (deptno);

--employees���� job_id�� salary(�޿�)�հ� �ݾ��� ��ü �޿��ݾ׿��� �����ϴ� �������ϱ�
select job_id, sum(salary),round(sum(salary)/(select sum(salary) from employees)*100,1) �����
from employees
group by rollup(job_id);


--employees���� ��������� ���ӻ���� �̸�, �޿� ��� ���ϱ�
--��Į�󼭺����� �̿�
--���ӻ���� ��� ���ӻ���� ������ �����̶�� ���
--�޿� ����� salary�� 5000 �̸��̸� ��, 5000~9999���̸� ��
--10000~19999���̸� ��, 20000�̻��̸� Ư��
select * from employees;

select employee_id ,first_name|| ' '|| last_name �̸�, last_name(select last_name from employees) 
from employees;

select a.employee_id �����ȣ, a.first_name || ' ' || a.last_name �̸�, 
      case when manager_id is null then '����'
        else (select b.first_name from employees b where a.manager_id = b.employee_id) 
    end ���ӻ���̸�,
     case when salary < 5000 then '��'
          when salary between 5000 and 9999 then '��'
          when salary between 10000 and 19999 then '��'
          when salary > 20000 then 'Ư��'
    end �޿����
from employees a;
--�ǻ��÷�(pseudoColumn), �����÷�, �����÷�
/*
    ���̺� �ִ� �Ϲ����� �÷�ó�� �ൿ�ϱ�� ������, ������ ���̺� ����Ǿ� ����
    ���� �÷�
    [1] ROWNUM : ������ ����� ������ ������ ROW�鿡 ���� �������� ����Ű�� �ǻ��÷�
                - �ַ� Ư�� ������ �� ������ row�� ������ �� ����
    
    [2] ROWID : ���̺� ����� ������ row���� ����� �ּҰ��� ���� �ǻ��÷�
                - ��� ���̺��� ��� row���� ���� �ڽŸ��� ������ rowid���� ���� �ִ�    
*/

select * from emp;

select rownum, empno, ename, sal, rowid as "ROW_ID"
from emp;

--emp���̺� ��ü���� ���� 5���� ������ ��ȸ
select rownum, empno, ename, sal
from emp
where rownum <= 5;

--order by�̿�, emp���� ename������ ������ ���¿��� ���� 5�� ��ȸ
select rownum, empno, ename, sal
from emp
order by ename;
--inline view �̿�

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


--student���� height������� ���� 7���� �л� ��ȸ�ϱ�
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

--employees���� salary�� �������� �����ؼ� ���� 6�Ǹ� ��ȸ
select * from employ
select rownum,e.*
from (
    select * from employees
    order by salary desc
) e
where rownum <= 6;

--�������� 2~4 ������ ������ ��ȸ�ϱ�
select rownum, empno, ename, sal
from emp
where rownum >5;

select rownum, empno, ename, sal
from emp
where rownum >1;

select rownum, empno, ename, sal
from emp
where rownum >= 1 and rownum < 5;
--=> rownum�� 1�� ���Ե��� ������ �����͸� �о���� ����
--=> 1�� ���Եǵ��� ������ �����ؾ���

--�������� 2~4 ������ ������ ��ȸ�ϱ�

select
from (
    select first_name, hire_date, salary
    from employees
    order by salary desc
)
where rownum >= 2 and rownum <= 4;  --00�� : rownum�� 1�� ���Ե��� �����Ƿ� 
--��Ī �̿�                           --       between�� ����
select rownum as rowcnt, first_name, hire_date, salary
from (
    select first_name, hire_date, salary
    from employees
    order by salary desc
)
where rowcnt >= 2 and rowcnt <= 4;

--�ѹ� �� inline view �̿�
select A.*   --�ο���� ���� �����ϴ°�
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

--emp ���̺��� ��ȸ�Ͽ� ������ �߿��� �ڽ��� job�� ��� ����(sal)���� ���ų� ���� �޴� ������� ��ȸ�Ͻÿ�.
--�������
select * from emp;
select ename, job ,sal
from emp a
where sal <= (select avg(sal)
                from emp b
                where b.job = a.job)
order by job;

--�� �а��� �ش��ϴ� ������ �� ���ϱ� -department, professor
select * from department;
select * from professor;

select p.deptno �а���, count(p.deptno) �ο���
from professor p join department d
on p.deptno = d.deptno
group by rollup (p.deptno);

select d.deptno �а���,(select count(*) from professor p where p.deptno = d.deptno) �����Ǽ�
from department d
order by �����Ǽ� desc;

--�� �а��� �ش��ϴ� �л��� ���ϱ�
--department , student ���̺�
select * from department;
select * from student;

select d.dname �а���,
decode((select count(*) from student s where d.deptno = s.deptno1),0,'����',(select count(*) from student s where d.deptno = s.deptno1)) �ο���,
(select count(*) from professor p where p.deptno = d.deptno) �����Ǽ�
from department d
order by �ο��� desc;

--Professor ���̺��� ������ ���� �޴� ���� ������ 10�� ��ȸ�ϱ�
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


--Student, exam_01 ���̺��� ������ 90�̻��� �л����� ���� ��ȸ
select * from student;
select * from exam_01;

select s.studno �й�, s.name �̸�, s.grade �г�, e.total ����
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

--1.job�� MANAGER�� ����� ��ȸ(emp)
select * from emp where job = 'MANAGER';

--2. job�� Manager�� ��� ����麸�� �Ի����� ����(����) ��� ������ ��ȸ => all �̿� (emp)
select * from emp
where hiredate < all(select hiredate from emp where job = 'MANAGER');

--3. ALL���� ����� ��� <= MIN�Լ��� �Ἥ
--all�� �Ⱦ����� ������������ �߻��Ǵ� �����Ͱ� 1���̸�  ��
--������� ������ �ϳ��� ���=> �����Լ� (�����Լ��� ������� 1��)
select *
from emp
where hiredate < (select min(hiredate) from emp where job = 'MANAGER');

--4. sales�μ��� �ٹ��ϴ� ��� ������ ��ȸ
select * from emp;
select * from dept;

select e.*
from emp e join dept d
on e.deptno = d.deptno
and e.deptno = 30;

select *
from emp 
where deptno = (select deptno from dept where dname = 'SALES');

--5. ��ձ޿����� �޿��� ���� �޴� ��� ������ �������� (emp)
select *
from emp
where sal > all(select avg(sal) from emp);

--inline view
--employees���� ��������� ��ȸ�ϰ�, job_id�� salary��յ� ���
select * from employees;

select job_id,nvl(avg(sal),0) from employees 
    group by job_id
    order by job_id;

 
--job_id�� salary���
select e1.job_id, e1.employee_id, e1.first_name, e1.hire_date, e1.salary, e2.��ձ޿�
from employees e1 join
(
    select job_id,nvl(avg(salary),0) ��ձ޿� from employees
    group by job_id
) e2
on e1.job_id = e2.job_id;


--�α��� ó��
--id:simson, pwd:a1234 �� ��� ������ �α��� ����, id�� ��ġ�ϸ� ��й�ȣ ����ġ
--id�� ������ �ش���̵� ����
select * from member;

select case (select count(*) from member where id = 'simson' and passwd = 'a1234')
            when 1 then '�α��μ���'
            else '�α��� ����'
        end �α���
from dual;

select case (select count(*) from member where id = 'simson' and passwd = 'a1234')
            when 1 then '�α��μ���'
            else 
                case (select count(*) from member where id = 'simson')
                    when 1 then '��й�ȣ ����ġ'
                    else '�ش� ���̵� �������� ����'
                end
        end �α���
from dual;

--����ڷκ��� �Է°� �޾ƿͼ� ó���ϱ�
select case (select count(*) from member where id = :id and passwd = :pwd)
            when 1 then '�α��μ���'
            else 
                case (select count(*) from member where id = :id)
                    when 1 then '��й�ȣ ����ġ'
                    else '�ش� ���̵� �������� ����'
                end
        end �α���
from dual;

--decode �̿�
select decode((select count(*) from member where id = :id and passwd = :pwd),1,'�α��� ����',
        decode((select count(*) from member where id = :id),1,'��й�ȣ ����ġ', '�ش� ���̵� �������� ����')) 
        �α���
from dual;


--inline view
--gogak���� 10��, 30�� ���� ��ȸ
--10,12,17  => 10
--30,33,38  => 30

select * from gogak;

select gno, gname, jumin,
    case when substr(jumin, 7, 1) in ('1', '3') then '��' else '��' end ����,
    extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
            +1 ����,
    trunc(extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
            +1, -1) ���ɴ�
from gogak;
--where ���� = '��';

select A.*
from
(
select gno, gname, jumin,
    case when substr(jumin, 7, 1) in ('1', '3') then '��' else '��' end ����,
    extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                +1 ����,
    trunc(extract(year from sysdate)
        -(substr(jumin,1,2)
            + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                 +1, -1) ���ɴ�
    from gogak
) A
where ���� = '��' and ���ɴ� in (10, 30);

--gogak���� ���ɴ뺰 �ο����� ����� ���

select ���ɴ�, count(*) �ο���, round(count(*)/(select count(*) from gogak)*100,1) �����
from
(
    select gno, gname, jumin,
        case when substr(jumin, 7, 1) in ('1', '3') then '��' else '��' end ����,
        extract(year from sysdate)
            -(substr(jumin,1,2)
                + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                    +1 ����,
        trunc(extract(year from sysdate)
            -(substr(jumin,1,2)
                + case when substr(jumin, 7, 1) in ('1', '2') then 1900 else 2000 end)
                     +1, -1) ���ɴ�
        from gogak
)A
group by ���ɴ�
order by ���ɴ�;


--�г⺰, ���� �ο����� ����� ���ϱ�  --����
--student



--job_history�� ������ ��ȸ�ϵ� job_id�� �ش��ϴ� job_title, dapartment_id�� �ش��ϴ�
--�μ��� ��ȸ
--��Į�� �������� �̿�
--job_history, jobs, departments
select j.*, 
        (select a.job_title from jobs a where j.job_id = a.job_ID) ��Ÿ��Ʋ, 
        (select department_id from departments d 
            where d.department_id = j.department_id) ����Ʈ��Ʈ���̵�
from job_history j;

--��������� ��ȸ
select j.*,
        (select a.job_title from jobs a where j.job_id = a.job_ID) ��Ÿ��Ʋ, 
        (select department_id from departments d 
            where d.department_id = j.department_id) ����Ʈ��Ʈ���̵�, e.*
from job_history j right join employees e
on j.employee_id = e.employee_id;

--departments, employees �����ؼ� �μ��� �ش��ϴ� ����� ���� ��ȸ�ϱ�
--����� ��� ���
--�μ���ȣ ������ ����
select d.*, e.employee_id, e.first_name, e.salary
from departments d right join employees e
on d.department_id = e.department_id;

select * from employees;
 
--�μ���� ��ȸ
--departments���̺��� employees�� �����ؼ� �μ������ ���� ���Ѵ�
select  e.first_name || ' ' || last_name �μ����
from department d right join employees e
on d.manager_id = e.employee_id
order by d.department_id;

--inline view�̿�
select A.*, e.first_name �μ����
from 
(   
    select  d.*,e.first_name,e.salary,e.first_name
    from department d right join employees e
    on d.manager_id = e.employee_id
    order by d.department_id
) A right join employees e
on A.manager_id = e.employee_id
order by A.department_id;





----�� �μ��� ���ϴ� ��������� ��ȸ�ϰ�, �μ��� ��ձ޿��� ����Ͻÿ�


--[1] �� �μ��� ���ϴ� ��������� ��ȸ�ϴ� ������ ���� ���ϱ�


--[2] �μ��� ��ձ޿��� ��ȸ�ϴ� ������ ���� (salary+salary*commission_pct)



--[3] �� ���� ������������ �̿��ؼ� outer join�Ѵ�

