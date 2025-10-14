-- 조건에 맞는 데이터 조회
-- #1. where
-- #2. 비교연산자 : = , != , <> , ^=
-- #3. 논리연산자 : AND, OR, NOR / BETWEEN
-- #4. like     : 패턴검색
-- #5. null 처리 : null 여부확인
-- #6. 집합연산자 : union (중복제거하고 합집합), union all (중복포함하고 합집합), minus(차집합), intersect(교집합)

-- #1. 전체데이터 조회 ( emp 테이블에서 )
select * from emp;

-- #2. where 조건조회
select * from emp where empno = 7839;
select * from emp where empno != 7839;

select * from emp where ename='KING';

select * from emp where empno = 7839 and ename='KING';
select * from emp where empno = 7839 or ename='WARD';

select * from emp where sal*12 = 36000;
select * from emp where sal > 3000;

select * from emp where ename >= 'FU';

select * from emp where deptno>=20 and deptno<=30;
select * from emp where deptno between 10 and 20;

select * from emp where deptno in (10, 30);

select * from emp where ename like 'A%';
select * from emp where ename like '__I%';

select * from emp where comm is null; -- = null XXX   is null OOO
select * from emp where comm is not null;


select * from emp where sal ^= 3000;
select * from emp where not sal = 3000;
select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';
select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
select * from emp where job != 'MANAGER' and job != 'SALESMAN' and job != 'CLERK';
select * from emp where job not in ('MANAGER', 'SALESMAN', 'CLERK');
select * from emp where sal >= 2000 and sal <= 3000;
select * from emp where sal between 2000 and 3000;
select * from emp where sal not between 2000 and 3000;
select * from emp where ename like 'S%';
select * from emp where ename like '_L%';
select * from emp where ename like '%AM%';
select * from emp where ename not like '%AM%';
select ename, sal, sal*12 + comm as annsal, comm from emp;

select * from emp where comm is null;
select * from emp where mgr is not null;
select * from emp where sal > null and comm is null;
select * from emp where sal > null or comm is null;
