select * from emp;

-- 집계 sum, max, min, avg, count
select sum(sal) from emp;
select sum(comm) from emp;
select sum(sal), max(sal), min(sal), avg(sal), count(sal) from emp;

select deptno, sum(sal)
from    emp
group by deptno;

-- having : 합계를 구했을 때 9000 이상인 그룹
select  deptno, sum(sal)
from    emp
group by    deptno
having  sum(sal) >= 9000;

-- 1
select sum(sal)
from emp;

-- 2
select ename, sum(sal)
from emp;
-- 에러, 행 개수가 안맞아서

-- 3
select sum(comm)
from emp;

-- 4
select sum(distinct sal), sum(all sal), sum(sal)
from emp;

-- 5
select count(*)
from emp;

-- 6
select count(*)
from emp
where deptno = 30;

-- 7
select count(distinct sal), count(all sal), count(sal)
from emp;

-- 8
select count(comm)
from emp;

-- 9 ??
select count(comm)
from emp
where comm is not null;

-- 10
select max(sal)
from emp
group by deptno
having deptno = 10;

-- 11
select min(sal)
from emp
group by deptno
having deptno = 10;

-- 12
select max(hiredate)
from emp
group by deptno
having deptno = 20;

-- 13
select min(hiredate)
from emp
group by deptno
having deptno = 20;


-- 14
select avg(sal)
from emp
group by deptno
having deptno = 30;

-- 15
select avg(distinct sal)
from emp
group by deptno
having deptno = 30;

-- 16 (?)
select avg(sal), deptno
from emp
group by deptno
having deptno = 10
union all
select avg(sal), deptno
from emp
group by deptno
having deptno = 20
union all
select avg(sal), deptno
from emp
group by deptno
having deptno = 30;

-- 17
select avg(sal), deptno
from emp
group by deptno;

-- 18
select deptno, job, avg(sal)
from emp
group by deptno, job
order by deptno;

-- 19 에러  집계함수와 일반컬럼을 함께 쓰려면 group by 필수
select ename, deptno, avg(sal)
from emp;

-- 20
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal) >= 2000;

-- 21 집계함수는 where 절이 아닌 having 절에서 사용가능하다.
select deptno, job, avg(sal)
from emp
where avg(sal) >= 2000
group by deptno, job
order by deptno, job;

-- 22
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal) >= 2000
order by deptno;

-- 23
select deptno, job, avg(sal)
from emp
where sal != 5000
group by deptno, job
having avg(sal) >= 2000
order by deptno;



-- 24
select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by deptno, job
order by deptno;