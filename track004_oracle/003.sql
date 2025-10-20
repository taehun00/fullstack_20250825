--#7. 집합연산자 : union(중복 제거하고 합집합)
select * from emp where deptno=10

union

select * from emp where deptno=10;

--#8. union all(중복 포함하고 합집합)
select * from emp where deptno=10

union all

select * from emp where deptno=10;

--#9. minus(차집합)
select * from emp

minus

select * from emp where deptno=20;

--#10. intersect(교집합)
select * from emp

intersect

select * from emp where deptno=20;

select empno, ename, sal, deptno from emp where deptno=10
union
select empno, ename, sal, deptno from emp where deptno=20;

-- 열의 갯수 다름 동작 x
select empno, ename, sal, deptno from emp where deptno=10
union
select empno, ename, sal from emp where deptno = 20;

-- 자료형 문제발생 동작 x
select empno, ename, sal, deptno from emp where deptno = 10
union
select ename, empno, deptno, sal from emp where deptno = 20;

-- 열개수와 자료형이 같으면 동작 o
select empno, ename, sal, deptno from emp where deptno = 10
union
select sal, job, deptno, sal from emp where deptno = 20;

--union은 합집합(중복 포함x) union all은 합집합(중복 포함o)
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION ALL
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;

--minus는 차집합
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP
MINUS
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;

--intersect는 교집합
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP
INTERSECT
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;


--문제 ex001 ~ 006
select * from emp where ename like '%S';

select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';

select empno, ename, job, sal, deptno from emp where deptno in (20, 30) and sal > 2000;

select empno, ename, job, sal, deptno from emp where deptno in (20) and sal > 2000
union
select empno, ename, job, sal, deptno from emp where deptno in (30) and sal > 2000;

select * from emp where sal >=2000 and sal <=3000;

select ename, empno, sal, deptno from emp where ename like '%E%' and deptno = 30 and sal not between 1000 and 2000;

select * from emp where comm is null and mgr is not null and job in ('MANAGER', 'CLERK') and ename not like '_L%';

