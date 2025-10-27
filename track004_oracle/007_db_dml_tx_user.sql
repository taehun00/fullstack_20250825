-- crud
-- dml 조작어 ( insert select update delete )
-- ddl 정의어 ( create alter drop )
-- dcl 제어어 ( 접근권한 ) grant(권한 주기), revote(권한 빼기)
-- tcl 제어어 ( 트랜잭션 ) commit(반영), rollback(되돌리기), savepoint(지점)

-- dml ■ insert
-- 1. 테이블 복사해오기
create table dept_temp as select * from dept;

desc dept_temp;
select * from dept_temp;

-- 2. insert
-- insert into 테이블 명 (필드1, 필드2,,,) values (값1, 값2,,,)
insert into dept_temp (deptno, dname, loc) values (50, 'DATABASE', 'SEOUL');
insert into dept_temp                      values (60, 'NETWORK', 'BUSAN');
insert into dept_temp                      values (70, 'WEB' , NULL);
insert into dept_temp (deptno, loc, dname) values (80, '', 'FRONT');

commit;

select * from dept_temp;

-- Q1.  EMP테이블을 복사해 EMP_TEMP 테이블을 만드시오. ( 구조확인, 전체데이터 확인)
-- Q2.  모든필드 명시하는 방법이용해서   다음의 값 넣기 - 9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10
-- Q3.  필드 명시 안하는 방법이용해서 다음의 값 넣기    - 1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20

create table emp_temp as select * from emp;

desc emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);
insert into emp_temp        values (1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20);

commit;

select * from emp_temp;

-- dml ■ update
update 테이블명
set 바꿀필드1 = 바꿀값1, 바꿀필드2 = 바꿀값2 ,,,
where 조건;

update dept_temp
set loc = 'INCHEON'; -- 전체 데이터 업데이트( 조건이 없음 )

update dept_temp
set loc = 'NEW YORK' WHERE deptno = 10;
update dept_temp
set loc = 'DALLAS' WHERE deptno = 20 and dname = 'RESEARCH';



select * from dept_temp;


-- dml ■ delete
delete from 테이블명 where 조건;

delete from dept_temp; -- 전체데이터가 삭제돼서 위험
delete from dept_temp where deptno = 10;
delete from dept_temp where deptno >= 30;

insert into dept_temp ( deptno, dname, loc ) 
                        select deptno, dname, loc from dept;
                    
commit;

select * from dept_temp;

-- Q1.  dept_temp  모든데이터 삭제
-- Q2.  insert 이용해서 데이터 삽입, 반영
-- Q3.  dept_temp 테이블에서  40번부서의이름을 DATABASE ,  지역을 SEOUL로 수정하시오.

delete from dept_temp;

insert into dept_temp (deptno, dname, loc) select deptno, dname, loc from dept;

update dept_temp
set dname = 'DATABASE', loc = 'SEOUL' where deptno = 40;

commit;

select * from dept_temp;

-- #0. 준비 -  다음 문제들을 풀으시오
-- Q1. DEPT 테이블을 복사해 DEPT_TCL테이블을 작성하시오.
-- Q2. DEPT_TCL 테이블에 다음과 같이 데이터를 입력, 수정, 삭제 하시오.
--    2-1.  데이터 삽입   50, 'DATABASE', 'SEOUL'
--    2-2.  부서번호가 40인  LOC를 INCHEON 으로 수정
--    2-3.  DNAMD이 RESEARCH 인데이터 삭제
--    2-4.  전체데이터 확인
desc dept;
desc dept_tcl;
select * from dept_tcl;

create table dept_tcl as select * from dept;

insert into dept_tcl (deptno, dname, loc) values (50, 'DATABASE', 'SEOUL');

update dept_tcl set loc = 'INCHEON' where deptno = 40;

delete from dept_tcl where dname = 'RESEARCH';

select * from dept_tcl;

--

commit;

rollback;

insert into dept_tcl dept_tcl values ( 20, 'AI', 'INCHEON');
rollback;
select * from dept_tcl;

-- savepoint

insert into dept_tcl values (60, 'AI', 'INCHEON');
savepoint sp_insert;


update dept_tcl set deptno=20 where deptno=60;
savepoint sp_update;

rollback to sp_insert;

select * from dept_tcl;

-- ddl ■ create
------
create table 테이블명 (
    필드명1, 자료형 옵션,
    필드명2, 자료형 옵션,
);
------

필드명 - 영문소문자
자료형 - 숫자 number, 문자열 varchar2(갯수), 날짜 date
옵션 - not null 필수입력, 기본값 primary key

create table dept_ddl(
    deptno number(2) primary key,
    dname varchar(50) not null,
    loc varchar(50)
);

desc dept_ddl;

------------------------------
alter table 테이블명 add           필드명 자료형;
                    drop column   필드명;
                    modify        필드명 자료형;
------------------------------
-- 컬럼 추가
alter table dept_ddl add admin varchar(50);
-- 컬럼 수정
alter table dept_Ddl modify admin varchar(100) not null;
-- 컬럼 삭제
alter table dept_ddl drop column admin;

desc dept_ddl;

drop table 테이블명;

drop table dept_ddl;
rollback;

desc dept_ddl;

--문제
create table mbtitype(
    mbti_type_id int primary key,
    name varchar(10),
    description varchar(100)
);

create table appuser(
    app_user_id int primary key,
    email varchar(100),
    password varchar(255),
    mbti_type_id int,
    created_at date
);
--문제1
alter table appuser add name varchar(50) null;

--문제2
alter table appuser modify email varchar(100) not null;

--문제3
alter table appuser modify password varchar(100);

--문제4
alter table mbtitype add category varchar(20);

--문제5
alter table mbtitype rename column description to details;

--문제6
rename mbtitype to mbtiinfo;

--문제7
alter table mbtitype rename details;

desc appuser;
desc mbtitype;
desc mbtiinfo;

insert into appuser (app_user_id, email, password, mbti_type_id, created_at) values (1, 'alice@example.com', 'hashed_pw_123', 2, TO_DATE('2025-10-01 10:00:00', 'YYYY-MM-DD HH24:MI:SS'));
insert into appuser (app_user_id, email, password, mbti_type_id, created_at) values (2, 'bob@example.com', 'hashed_pw_456', 1, TO_DATE('2025-10-02 14:30:00', 'YYYY-MM-DD HH24:MI:SS'));

select * from appuser;
insert into mbtiinfo (mbti_type_id, name, details, category) values (3, 'ENFP', '열정적이고 창의적인 성향', '');
insert into mbtiinfo (mbti_type_id, name, details, category) values (7, 'INTJ', '논리적이고 전략적인 성향', '');
select * from mbtiinfo;