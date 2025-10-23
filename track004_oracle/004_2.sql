-- 1
select * from emp;

-- 2. 집계함수 - sum, count, max, min, avg
select sum(sal) from emp;

-- 3. 부서의 직업별 급여의 평균
select deptno,  avg(sal) from emp group by deptno;

-- 4. where vs having       급여의 평균에서 2000 이상
select deptno, job, avg(sal)
from emp
where sal>= 2000        -- 전체데이터에서 필터
group by deptno, job
having avg(sal) > 2000; -- group by에서 나온 급여의 평균으로

-- 5. rollup, cube, grouping sets / pivot, unpivot{
-- rollup : 10부서의 작업 급여의 평균, 20부서의 급여의 평균, 30부서의 급여의 평균 - 전체 총계
select deptno, job, count(*), round(avg(sal),1)
from emp
--group by deptno, job;
group by rollup(deptno, job);


-- cube : 전쳬총계 , job 총계 , deptno 총계, deptno + job 각각 세부내용   큰거에서 > 작은걸로
select deptno, job, count(*), round(avg(sal),1)
from emp
group by cube(deptno, job);

-- grouping     해당컬럼이 실제로 그룹화되었니?
select deptno, job, grouping(deptno), grouping(job)
from emp
group by cube(deptno, job); -- deptno + job, job, deptno, 둘다세부

-- pivot
select  *
from ( select 컬럼1, 컬럼2, 집계대상컬럼 from 테이블명 ) -- 원본데이터 : pivot을 적용할 대상
pivot ( 집계함수(집계대상) for 컬럼기준 in (값1, 값2, 값3,,,) ); -- 집계함수 : 어떤컬럼기준으로 만들 것인지 지정

-- job별 부서 10, 20, 30의 최대급여
select *
from ( select deptno, job, sal from emp )
pivot ( max(sal) for deptno in (10,20,30));

-- 직무별 부서별 사원 수 - job별 부서 10, 20, 30의 사원 수
select *
from ( select job, deptno, empno from emp )
pivot ( count(empno) for deptno in (10, 20, 30) );

-- 부서별 직무 평균 급여
select *
from ( select deptno, job, sal from emp )
pivot ( avg(sal) for job in ('CLERK', 'MANAGER', 'SALESMAN') );

-- unpivot 열데이터를 행으로
select * 
from (
    select deptno, max( decode(job,'CLERK', sal)) CLERK, max( decode(job, 'MANAGER', sal)) MANAGER
    from emp
    group by deptno

) -- 원본데이터 : unpivot을 적용할대상 (열 형태로 집계된 데이터)
unpivot (
    sal for job in (CLERK, MANAGER)
); -- unpivot : 열을 행으로 변환, 기준컬럼 열이름이었던 것을 행 값으로 변환


-- 25
select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by rollup(deptno, job);

-- 26
select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by cube(deptno, job);

-- 27
select deptno, job, count(*)
from emp
group by deptno, rollup(job);

-- 28
select deptno, job, count(*)
from emp
group by job, rollup(deptno);

-- 29
select deptno, job, count(*)
from emp
group by grouping sets(deptno, job)
order by deptno, job;

-- 30
select deptno, job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp
group by rollup(deptno, job);

-- 31
select decode(grouping(deptno), 1, 'ALL_DEPT', deptno) deptno , decode(grouping(job), 1, 'ALL_JOB', job) job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by rollup(deptno, job);

-- 32
select deptno, job, count(*), sum(sal), grouping(deptno), grouping(job), grouping_id(deptno, job)
from emp
group by cube(deptno, job)
order by deptno, job;

-- 1) DEPTNO (O), JOB(0)               GROUPING_ID (0)
-- 2) DEPTNO (O), JOB(1: NULL)         GROUPING_ID (1)
-- 3) DEPTNO (1: NULL), JOB(0)         GROUPING_ID (2)
-- 4) DEPTNO (1: NULL), JOB(1: NULL)   GROUPING_ID (3)

-- 33
select deptno, ename
from emp
group by deptno, ename;

-- 34
select deptno, listagg( ename, ', ' ) within group( order by sal desc ) enames
from emp
group by deptno;


-- 35
select deptno, job, max(sal)
from emp
group by deptno, job
order by deptno, job;

-- 36
select *
from (
    select job, deptno, sal
    from emp
)
pivot( max(sal) for deptno in (10, 20, 30));

-- 37
select *
from (
    select job, deptno, sal
    from emp
)
pivot( max(sal) for job in ('CLERK', 'SALESMAN', 'PRESIDENT', 'MANAGER', 'ANALYST'));

-- 38
select  deptno,
        max( decode( job, 'CLERK', sal ) ) clerk,
        max( decode( job, 'SALESMAN', sal ) ) SALESMAN,
        max( decode( job, 'PRESIDENT', sal ) ) PRESIDENT,
        max( decode( job, 'MANAGER', sal ) ) MANAGER,
        max( decode( job, 'ANALYST', sal ) ) ANALYST
from    emp
group by deptno
order by deptno;

-- 39
select  *
from (
    select  deptno,
        max( decode( job, 'CLERK', sal ) ) clerk,
        max( decode( job, 'SALESMAN', sal ) ) SALESMAN,
        max( decode( job, 'PRESIDENT', sal ) ) PRESIDENT,
        max( decode( job, 'MANAGER', sal ) ) MANAGER,
        max( decode( job, 'ANALYST', sal ) ) ANALYST

    from emp
    group by deptno
)
unpivot(
    sal for job in(clerk, salesman, president, manager, analyst)
)
order by deptno, sal;


-- ex001
select deptno, trunc(avg(sal)) avg_sal, max(sal) max_sal, min(sal) min_sal, count(*) cnt
from emp
group by deptno;

-- ex002
select job, count(*)
from emp
group by job
having count(*) >= 3;

-- ex003
select to_char(hiredate, 'YYYY') hire_year, deptno, count(*) cnt
from emp
group by deptno, to_char(hiredate, 'YYYY')
order by deptno, cnt;

-- ex004
select 
    case
        when comm is not null and comm > 0 then 'O'
        else 'X'
    end EXIST_COMM,
    count(*) cnt
from emp
group by 
    case 
        when comm is not null and comm > 0 then 'O'
        else 'X'
    end;

select nvl2(comm, 'O', 'X') exist_comm, count(*) cnt
from emp
group by nvl2(comm, 'O', 'X');
-- ex005
select deptno, to_char(hiredate, 'YYYY') hire_year, count(*) cnt, max(sal) max_sal, sum(sal) sum_sal, avg(sal) avg_sal
from emp
group by rollup(deptno, to_char(hiredate, 'YYYY'));

