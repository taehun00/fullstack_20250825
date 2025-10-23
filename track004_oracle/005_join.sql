-- 1. join
-- 여러테이블을 한개의 테이블처럼 사용하는 것
-- 공통컬럼 기준으로 연결
-- 1-1. 등가조인 (=) : where절         emp.deptno = dept.deptno
-- 비등가조인 :                  sal between losal and hisal
-- 자체조인     : emp e1, emp e2

-- 1-2. outer join : 매칭되지 않은 행도 포함, left, right, full outer join

-- ERD : entity(테이블) Relationship(관계) Diagram(표)
--       entity(테이블) Relationship(관계) Attribute(속성)

-- #1. 내부조인(등가조인)
select *
from emp e, dept d
where e.deptno = d.deptno;

select *
from emp e join dept d
on (e.deptno = d.deptno);

select *
from emp e join dept d using(deptno);

select *
from emp e natural join dept d;

-- #2. 외부조인 ( 매칭되지 x )
select * from dept;  -- deptno 10, 20, 30, 40
select * from emp;   -- deptno 10, 20, 30

-- 1. 조건(+) ORACLE에서만       -- (+) 없는데이터 NULL 보충, (+) 안붙은 테이블의 데이터를 보장
select ename, dname
from emp e, dept d
where e.deptno = d.deptno(+);   -- emp 테이블 보장, dept에서 모자라는 데이터 없는데이터 NULL 채울게

select ename, dname
from emp e, dept d
where e.deptno(+) = d.deptno;   -- dept 테이블 보장, emp에서 모자라는 데이터 없는데이터 NULL 채울게

-- 2. LEFT JOIN , RIGHT JOIN(ANSI 조인)
select ename, dname
from emp e inner join dept d on (e.deptno = d.deptno);      -- inner join, 내부조인, 겹치는 애들만


select ename, dname
from emp e right outer join dept d on (e.deptno = d.deptno);     -- right 테이블 보장 

select ename, dname
from emp e left outer join dept d on (e.deptno = d.deptno);  -- left 테이블 보장

-- 3. OUTER JOIN
select ename, dname
from emp e full outer join dept d
on e.deptno = d.deptno;




-- emp e, dept d 별명 / empno, ename, deptno, dname
select e.empno, e.ename, d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno;

select e.empno, e.ename, d.deptno, d.dname
from emp e join dept d on (e.deptno = d.deptno);

select empno, ename, deptno, dname
from emp e join dept d using (deptno);

select empno, ename, deptno, dname
from emp e natural join dept d;

-- 001
select *
from emp, dept;

-- 002
select *
from emp e, dept d
where e.deptno = d.deptno;

-- 003 
select *
from emp e, dept d
where e.deptno = d.deptno;

-- 004
select empno, ename, deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno;

-- 005
select e.empno, e.ename, d.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno
order by d.deptno, e.empno;

-- 006
select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc
from emp e, dept d
where sal >= 3000 and e.deptno = d.deptno;

select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc
from emp e join dept d on (e.deptno = d.deptno)
where sal >= 3000;

select empno, ename, e.sal, deptno, dname, d.loc
from emp e join dept d using (deptno)
where sal >= 3000;

select empno, ename, e.sal, deptno, dname, d.loc
from emp e natural join dept d
where sal >= 3000;

-- 007 join using, natural join 안됨
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, s.grade, s.losal, s.hisal 
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, s.grade, s.losal, s.hisal 
from emp e join salgrade s on (e.sal between s.losal and s.hisal);



-- 008 join using, natural join 안됨
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename 
from emp e1, emp e2
where e1.mgr = e2.empno
order by e1.mgr;

select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename 
from emp e1 join emp e2 on (e1.mgr = e2.empno)
order by e1.mgr;

-- 009
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno(+)
order by empno;

-- 010
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1, emp e2
where e1.mgr(+) = e2.empno
order by empno;

-- 011
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
from emp e natural join dept d
order by deptno, empno;

-- 012
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
from emp e join dept d using (deptno)
where sal >= 3000
order by deptno, empno;

-- 013
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
from emp e join dept d on (e.deptno = d.deptno)
where sal <=3000
order by deptno, empno;

-- 014
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno)
order by e1.empno;

-- 015
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 right outer join emp e2 on (e1.mgr = e2.empno)
order by e1.empno;

-- 016
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 full outer join emp e2 on (e1.mgr = e2.empno)
order by e1.empno;

-- ex001
select d.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where sal > 2000  and e.deptno = d.deptno
order by d.deptno;

select d.deptno, d.dname, e.empno, e.ename, e.sal
from emp e join dept d on e.deptno = d.deptno
where sal > 2000
order by d.deptno;

-- ex002
select d.deptno, d.dname, trunc(avg(e.sal)) avg_sal, max(e.sal) max_sal, min(e.sal) min_sal, count(e.empno) cnt
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname
order by d.deptno;

select d.deptno, d.dname, trunc(avg(e.sal)) avg_sal, max(e.sal) max_sal, min(e.sal) min_sal, count(e.empno) cnt
from emp e join dept d on e.deptno = d.deptno
group by d.deptno, d.dname
order by d.deptno;

-- ex003
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e, dept d
where e.deptno(+) = d.deptno
order by d.deptno, e.ename;

select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e
right outer join dept d on e.deptno = d.deptno
order by d.deptno, e.ename;

select deptno, dname, empno, ename, job, sal
from emp 
right outer join dept  using (deptno)
order by deptno, ename;


-- ex004
select d.deptno, dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno deptno_1, losal, hisal, grade, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1, dept d, salgrade s, emp e2
where e1.deptno(+) = d.deptno and e1.sal between losal(+) and hisal(+) and e1.mgr = e2.empno(+)
order by d.deptno, e1.empno;


select d.deptno, dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno deptno_1, losal, hisal, grade, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 right join dept d on (e1.deptno = d.deptno)
            left join salgrade s on (e1.sal between losal and hisal)
            left join emp e2 on(e1.mgr = e2.empno)

order by d.deptno, e1.empno;



