show user;
select table_name from user_tables;

-- #3. 열조회
select empno, ename from emp;

-- #4. 중복제거
select distinct job from emp;
select all      job from emp;

-- #5. 연산 및 별칭
desc emp;

select ename "유저", sal as "월급", sal+sal+sal "3달치 월급" from emp;

-- #6. 정렬
select ename, sal from emp order by sal asc;

select ename, sal from emp order by sal desc;

-- ## Step3 연습문제
desc emp;
desc dept;
desc salgrade;
select * from emp;
select empno, ename, deptno from emp;
select distinct deptno from emp;
select distinct job, deptno from emp;
select job, deptno from emp;
select ename, sal, sal*12+comm as "연간총수입", comm from emp;
select ename, sal, sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm as "연간총수입", comm from emp;
select ename, sal, sal*12+comm as "annsal", comm from emp;
select * from emp order by sal asc;
select * from emp order by sal desc;
select * from emp order by deptno asc, sal desc;



select table_name from user_tables;

-- emp 테이블삭제
drop table emp;
-- emp 테이블 만들기  1. 정의어(DDL) - CREATE, ALTER, DROP
CREATE TABLE emp (
  empno NUMBER(4),
  ename VARCHAR2(10),
  job VARCHAR2(9),
  mgr NUMBER(4),
  hiredate DATE,
  sal NUMBER(7,2),
  comm NUMBER(7,2),
  deptno NUMBER(2)
);

desc emp;

-- emp 테이블 값넣기  2. 조작어(DML) - insert, select, update, delete
INSERT INTO emp VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('1981-11-17','YYYY-MM-DD'), 5000, NULL, 10);
INSERT INTO emp VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1981-05-01','YYYY-MM-DD'), 2850, NULL, 30);
INSERT INTO emp VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('1981-06-09','YYYY-MM-DD'), 2450, NULL, 10);
INSERT INTO emp VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('1981-04-02','YYYY-MM-DD'), 2975, NULL, 20);
INSERT INTO emp VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('1981-12-03','YYYY-MM-DD'), 3000, NULL, 20);
INSERT INTO emp VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('1980-12-17','YYYY-MM-DD'), 800, NULL, 20);
INSERT INTO emp VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('1987-07-13','YYYY-MM-DD'), 3000, NULL, 20);
INSERT INTO emp VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('1987-07-13','YYYY-MM-DD'), 1100, NULL, 20);
INSERT INTO emp VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('1982-01-23','YYYY-MM-DD'), 1300, NULL, 10);
INSERT INTO emp VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('1981-09-28','YYYY-MM-DD'), 1250, 1400, 30);
INSERT INTO emp VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('1981-02-20','YYYY-MM-DD'), 1600, 300, 30);
INSERT INTO emp VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('1981-09-08','YYYY-MM-DD'), 1500, 0, 30);
INSERT INTO emp VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('1981-12-03','YYYY-MM-DD'), 950, NULL, 30);
INSERT INTO emp VALUES (7521, 'WARD', 'SALESMAN', 7698, TO_DATE('1981-02-22','YYYY-MM-DD'), 1250, 500, 30);

commit; -- 삽입(반영)


select * from emp;


select distinct job from emp;

select empno as employee_no, ename as employee_name, mgr as manager, sal as salary, comm as commission, deptno as department_no 
from emp order by deptno desc, ename;



