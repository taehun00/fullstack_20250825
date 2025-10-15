select distinct job from emp;
select empno as employee_no, ename as employee_name, mgr as manager, sal as salary, comm as commission, deptno as department_no from emp order by deptno desc, ename;
select * from emp where sal >=2000 and sal <=3000;
select * from emp where sal between 2000 and 3000;
select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';
select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
select * from emp where ename like 'S%';
select * from emp where ename like '_L%';
select * from emp where ename like '%AN%';
