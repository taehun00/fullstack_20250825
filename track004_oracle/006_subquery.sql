-- 서브쿼리     select 안에 select

-- #1. 평균급여보다 많이 받는 사원들
select ename, sal
from emp
where sal > ( select avg(sal) from emp)-- 평균급여
order by sal desc;

-- #2. deptno가 10인 부서의 job인 사원들 ename, sal
select ename, sal, deptno
from emp
where job in ( select job from emp where deptno = 10 )
order by sal desc;


-- 001
select sal
from emp
where ename = 'JONES';

-- 002
select empno, ename, job, mgr, hiredate, sal ,comm, deptno
from emp
where sal > 2975;

-- 003
select *
from emp
where sal > (select sal from emp where ename = 'JONES');

-- 004
select *
from emp
where hiredate < (select hiredate from emp where ename = 'SCOTT');


-- 005
select e.empno, e.ename, e.job, e.sal, e.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno 
and e.deptno = 20
and sal > ( select avg(sal) from emp );

-- 006
select *
from emp
where deptno in ( select deptno from emp where deptno in (20, 30));

-- 007
select *
from emp
where sal in (select max(sal) from emp group by deptno);


-- #3 다중행연산자
-- 1. in            "이 값이 목록에 있나요?" deptno in(10,20,30)
-- 2. any, some     "하나라도 만족하면 ok"              ■ 최소값 기준비교
--        컬럼 > any(서브쿼리) 최소값보다 크면 true
--        컬럼 < any(서브쿼리) 최대값보다 작으면 true
--        컬럼 > any(1,2,3)
--        컬럼 < any(1,2,3)

-- 3. all           "모두 만족해야 ok"                 ■ 최대값 기준비교
--        컬럼 > all(서브쿼리) 최대값보다 크면 true
--        컬럼 < all(서브쿼리) 최소값보다 작으면 true
-- 4. exist         "서브쿼리가 존재하면 ok"            ■

create table atest      as select 1 num from dual
                    union all select 2  from dual
                    union all select 3  from dual
                    union all select 4  from dual
                    union all select 5  from dual
                    union all select 6  from dual;
                    
select * from atest;

-- 컬럼 > any 1 최소값보다 크다, (반대)최대값보다 작다, 컬럼 > all 3 최대값보다 크다, (반대)최소값보다 작다
select num  from atest where  num < any(select num from atest  where num in(3,4,5)) order by num;
select num  from atest where  num > any(select num from atest  where num in(3,4,5)) order by num;
select num  from atest where  num < all(select num from atest  where num in(3,4,5)) order by num;
select num  from atest where  num > all(select num from atest  where num in(3,4,5)) order by num;


-- #4. 다중 열 서브쿼리
select ename, deptno, job
from emp
where (deptno, job) in (select deptno, job from emp where sal > 2000);


-- #5 인라인뷰 ( from)
select empno, ename, d.deptno, dname
from (select * from emp where deptno=20) e, (select * from dept) d
where e.deptno = d.deptno;

-- #6 with 
with
    e6 as (select * from emp where deptno = 30),
    d6 as (select * from dept)
select empno, ename, d6.deptno, dname
from e6, d6
where e6.deptno = d6.deptno;

with
    e6 as (select * from emp where deptno=30)
select count(*) from e6;

-- #7 스칼라서브쿼리 (데이터가 많은 경우 성능 저하)
select empno, ename, sal, (select grade from salgrade where emp.sal between losal and hisal) salgrade, deptno, 
        (select loc from dept where emp.deptno = dept.deptno) location
from emp;

-- 008
select max(sal)
from emp
group by deptno;

-- 009
select *
from emp
where sal = any (select max(sal) from emp group by deptno);

-- 010
select *
from emp
where sal = some (select max(sal) from emp group by deptno);

-- 011
select *
from emp
where sal < any (select max(sal) from emp where deptno = 30)
order by sal;

-- 012
select sal
from emp
where sal = any (select sal from emp where deptno = 30);

-- 013
select *
from emp
where sal > any (select sal from emp where deptno = 30);

-- 014
select *
from emp
where sal < all (select sal from emp where deptno = 30);

-- 015
select *
from emp
where sal > all (select sal from emp where deptno = 30);

-- 016
select *
from emp
where exists(select dname from dept where deptno = 10);

-- 017
select *
from emp
where exists(select dname from dept where deptno = 50);

-- 018
select *
from emp
where (deptno, sal) in (select deptno, max(sal) from emp group by deptno);

-- 019
select empno, ename, e.deptno, dname, loc
from (select * from emp where deptno = 10) e, (select * from dept) d
where e.deptno = d.deptno;

select empno, ename, e.deptno, dname, loc
from emp e join dept d on e.deptno = d.deptno
where e.deptno = 10;

-- 020
with
    e as (select * from emp where deptno = 10),
    d as (select * from dept)
select empno, ename, e.deptno, dname, loc
from e, d
where e.deptno = d.deptno;

-- 021
select empno, ename, job, sal, (select grade from salgrade where emp.sal between losal and hisal) salgrade,
        deptno, (select dname from dept where emp.deptno = dept.deptno) dname
from emp;


-- ex001
select job, empno, ename, sal, d.deptno, dname
from emp e, dept d
where e.deptno = d.deptno
and e.job in (select job from emp where ename = 'ALLEN');

-- ex002
select empno, ename, dname, hiredate, loc, sal, grade
from emp e, dept d, salgrade s
where e.sal > any (select avg(sal) from emp)
    and e.sal between s.losal and s.hisal
    and e.deptno = d.deptno
order by sal desc;

-- ex003
select empno, ename, job, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno
and e.deptno = 10
and job not in ( select job from emp where deptno = 30);

-- ex004
select empno, ename, sal, grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
and sal > all (select sal from emp where job = 'SALESMAN')
order by empno;

select empno, ename, sal, grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
and sal >  (select max(sal) from emp where job = 'SALESMAN' group by deptno)
order by empno;