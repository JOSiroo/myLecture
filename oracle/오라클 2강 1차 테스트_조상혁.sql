--[ ����Ŭ 2�� 1��]

--(1) test_file ���̺���  ���ϸ� �����ϱ�(example.txt, abc.java)
select substr('test_file',1,4) from dual;

--(2) employees ���̺��� salary�� 100�� �ڸ����� �����Ͻÿ�.
--õ���� ���б�ȣ�� ǥ��
select to_char(trunc(salary, -3), '9,999,999') from employees;


--(3) �������ڿ� ���÷κ��� 4�� 5���� 6�� 7�ð� 23�� 42�� ���� ��¥ ���ϱ�
select sysdate, sysdate + to_yminterval('04-05') + to_dsinterval('06 07:23:42')
from dual;


--(4) professor���̺��� ������ �Ի��� 60�� ���� ��¥�� ���Ͻÿ�.
select hiredate+60
from professor;


--(5) professor���̺��� ������ �Ի��� 3������ �Ǵ� ��¥?
select add_months(hiredate, 3)
from professor;



--(6) professor���̺��� ������ �Ի��� 10���� �Ǵ� ��¥?
select hiredate + to_yminterval('10-00')
from professor;



--(7) ���ú��� ������(2023-08-29)���� ���� �ϼ���?
select to_date('2023-08-29') - sysdate from dual;


--(8) 2023-02-01 ���� ���ñ��� ����� �ϼ���?
select sysdate - to_date('2023-02-01') from dual;


--(9) ���ú��� ũ��������(2023-12-25)���� ���� �޼���? (months_between)
select trunc(to_number(to_date('2023-12-25') - sysdate)/30, 0) from dual;


--(10) professor���̺��� �Ի����� ���ñ��� ���� �Ǿ���?
select trunc(sysdate - hiredate,0)
from professor;


--(11) professor���̺��� �Ի����� ���ñ��� ��� �Ǿ���?
select trunc((sysdate-hiredate)/30,0) from professor;


--(12) pd���̺��� ��ǰ�� ������� ��ð��� �������� ��ȸ
select  trunc((sysdate - regdate)*24,0)
 from pd;


--(13) 2020-02-07�� �ش��ϴ� ���� ������ ��¥��?
select last_day(to_date('2020-02-07')) from dual;


--(14) �������ڸ� ���� ������ ���ڷ� ��ȯ�ؼ� ����Ͻÿ�.
--2023-03-28 14:35:27 ��
select to_char(sysdate, 'yyyy-mm-dd hh:mi:ss dy') from dual;


--(15) emp ���̺��� hiredate Į���� �����Ͽ� �Ի����� 5���� ����� �̸��� 
--hiredate, job�� ���
select* from emp;
select hiredate,ename, job
from emp
where to_char(hiredate, 'mm') = '05';

--(16)emp ���̺��� job�� CLERK �̳� ANALYST�� ��� ��ȸ (in �̿�)
select *
from emp
where job in ('CLERK','ANALYST');

--(17) pd ���̺��� �����(regdate) ��  2023-03-10 ~ 2023-04-19 �� ������ �����͸� ��ȸ�ϱ�
--to_date �Լ� �̿��ϱ�
select * from pd
where to_date(regdate) between '2023-03-10' and to_date('2023-04-19')+1;


--(18) emp ���̺��� ����� �̸�, �Ի���, �޿�(sal), Ŀ�̼�(comm), ����(sal*12+comm)  ������ ��������
--comm�� null�̸� 0���� ���ǵ��� ó���Ѵ� -  nvl �Լ� ����ϱ�
select ename, hiredate, sal, nvl(comm,0), sal*12+nvl(comm,0)
from emp;

select * from emp;
--(19) emp���� �̸�, �Ի���, �޿�(sal), �μ� ������ ��ȸ�ϵ�, �޿��� ���� �ڸ����� �ݿø��Ͻÿ�. 
--�μ��� 20�̳� 30�� �����͸� ��ȸ
select ename, hiredate, round(sal,-2), job
from emp;


--(20) emp2 ���̺��� emp_type, position �÷��� ��ȸ�ϵ�
--�ߺ��� ��(���ڵ�)�� ����
select distinct emp_type, position from emp2;



--(21) emp ���̺��� comm�� ���� ���� ����� �̸�(ename), job, sal, comm ������ ��������
select ename, job, sal, comm
from emp
where comm is null;


--(22) department ���̺��� deptno, dname, build �÷��� ��ȸ
--���� : �а�(dname)�� '����'�̶�� �ܾ �� �а����� ��ȸ�ϱ�
--���� : dname ������ ������������ ����
select deptno, dname, build
from department
where dname like '%����%'
order by dname desc;



--(23)�������̺��� �޿�(pay)�� 350���� 500������ ������ �̸�(name), ���̵�(id), �޿�(pay) ������ ��������
select name, id, pay
from professor
where pay between 350 and 500;



--(24) student ���̺��� �����ؼ� 1������ 201���� �л��� �̸��� ��ȭ��ȣ�� ������ȣ�� ���. 
--��, ������ȣ�� ���ڸ� ���;� ��
select name,tel,substr(tel, 0,instr(tel,')')-1)
from student;



--(25) student ���̺��� 1������ 201���� �л����� �̸��� �г�, �ֹι�ȣ�� ����ϵ� 
--�ֹι�ȣ�� �� 7�ڸ��� '#'�� ǥ�õǰ� ���
select name, grade,to_char(substr(jumin,1,6), '999999') || '#######'
from student;
