-- ■ 제약조건
1. NOT NULL     NULL입력금지
2. UNIQUE       중복금지, NULL 허용
3. PRIMARY KEY  고유식별자, 중복/NULL 금지
4. FOREIGN KEY  다른테이블 참조
5. CHECK        조건검사


-- rdb
-- 테이블 관계 속성
-- FOREIGN KEY
-- 1. 다른테이블 참조
-- 2. 부모테이블의 값만 입력 가능
-- 3. 참조무결성 유지

CREATE TABLE DEPT_FK(
    deptno number primary key,
    dname varchar2(50)
);

CREATE TABLE emp_fk(
    empno number primary key,
    ename varchar2(50) not null,
    deptno number(2),
    constraint fk_dept foreign key(deptno) references dept_fk(deptno) on delete cascade
);

insert into dept_fk  values (10, 'bug_hunter');
insert into dept_fk  values (20, 'pawject');
insert into dept_fk  values (30, 'test');
select * from dept_fk;
select * from emp_fk;

insert into emp_fk (empno, ename, deptno) values (1, 'first', 30);
insert into emp_fk (empno, ename, deptno) values (2, 'second', 40);  -- 부모에 없는 값은 못넣음

delete from dept_fk where deptno=30;
select * from emp_fk;

desc appuser;
desc post;

alter table post add constraint fk_post_appuser foreign key(APP_USER_ID) references appuser(APP_USER_ID);

ALTER TABLE  post  ADD CONSTRAINT  fk_post_appuser  FOREIGN KEY(APP_USER_ID)   REFERENCES  appuser(APP_USER_ID);

SELECT  constraint_name, table_name , column_name 
from  user_cons_columns
where  table_name='POST';  --대문자

select * from appuser;
delete from appuser;
delete from post;
commit;