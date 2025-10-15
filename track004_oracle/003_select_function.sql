-- 003. select_function.sql
-- 1. 문자열
-- 1.1 upper 대문자, lower 소문자, initcap 대소문자 변환
-- 1.2 length 문자열길이
-- 1.3 substr 부분문자열, instr 위치문자열
-- 1.4 replace , lpad, rpad 채우기
-- 1.5 trim 공백빼기, ltrim 왼쪽, rtrim 오른쪽 
-- 1.6 concat 문자열연결
-- 2. 숫자
-- 3. 날씨
-- 4. 변환
-- 5. 조건

-- #1. 대소문자
select ename, upper(ename), lower(ename), initcap(ename) from emp;

-- #2. 문자열길이
select ename, length(ename), lengthb(ename), '킹', length('킹'), lengthb('킹') from emp;

-- #3. substr 부분문자열, instr 위치문자열
select ename, substr(ename, 1, 2), substr(ename, 1, 3), substr(ename, 4, 3) from emp;
select substr('oracle',-5) from dual;
select instr('oracle','a') from dual;

-- #4. replace, lpad, rpad 채우기
select replace('010-1234-5678','-',' ') from dual;
select lpad('oracle', 10, '#') from dual;

-- 5#. trim, ltrim, rtrim 공백제거
select trim('    *oracle*   '), ltrim('    *oracle* '), rtrim('          *oracle* ') from dual;

-- 6#. concat 문자열 연결(2개 밖에 안됨)
select concat('hello ', 'oracle') from dual;
select concat(concat('hello ', 'oracle'), '★') from dual;
select 'hello ' || 'oracle ' || '■' as a from dual;


-- 문자열 연습문제 1 ~ 16
select ename, upper(ename), lower(ename), initcap(ename) from emp;

select ename from emp where ename = upper('king');

select ename from emp where upper(ename) like upper('%KING%');

select ename, length(ename) from emp;

select ename, length(ename) from emp where length(ename) >= 5;

select length('한글'), lengthb('한글') from dual;

select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;

select job, substr(job,-length(job)), substr(job,-length(job),2), substr(job,-3) from emp;

select instr('HELLO, ORACLE!','L',1,1) as instr_1, instr('HELLO, ORACLE!','L',1,3) as instr_2, instr('HELLO, ORACLE!','L',1,2) as instr_3 
from dual;

select * from emp
where instr(ename, 'S') > 0;

select * from emp
where ename like '%S%';

select '010-1234-5678' as replace_before, replace('010-1234-5678','-',' ') as replace_1, replace('010-1234-5678','-','') as replace_2 from dual;

select 'Oracle', lpad('ORACLE',10,'#') as LPAD_1, rpad('ORACLE',10,'*') as RPAD_1, lpad('ORACLE',10,' ') as LPAD_2, rpad('ORACLE',10,' ') as RPAD_2 from dual;

select rpad('911225-',14,'*') as RPAD_JMNO, rpad('010-1234-',13,'*') as RPAD_PHONE from dual;

select concat(empno, ename), concat(empno, concat(':',ename)) from emp where ename = upper('Scott');

-- 16번
select 
    '[' || trim(' _ _Oracle_ _ ') || ']' as trim,
    '[' || trim(LEADING FROM ' _ _Oracle_ _ ') || ']' as trim,
    '[' || trim(TRAILING FROM ' _ _Oracle_ _ ') || ']' as trim,
    '[' || trim(BOTH FROM ' _ _Oracle_ _ ') || ']' as trim
from dual;

select 
    '[' || trim(' _ _Oracle_ _ ') || ']' as trim,
    '[' || ltrim(' _ _Oracle_ _ ') || ']' as trim,
    '[' || rtrim(' _ _Oracle_ _ ') || ']' as trim,
    '[' || trim(' _ _Oracle_ _ ') || ']' as trim
from dual;

-- 17번
select 
    '[' || trim('_ _Oracle_ _') || ']' as trim,
    '[' || trim(LEADING '_' FROM '_ _Oracle_ _') || ']' as trim,
    '[' || trim(TRAILING '_' FROM '_ _Oracle_ _') || ']' as trim,
    '[' || trim(BOTH '_' FROM '_ _Oracle_ _') || ']' as trim
from dual;

-- 18번
select 
    '[' || trim(' _ _Oracle_ _ ') || ']' as trim,
    '[' || ltrim(' _ _Oracle_ _ ') || ']' as ltrim,
    '[' || ltrim('_ _Oracle_ _','_') || ']' as ltrim_2,
    '[' || rtrim(' _ _Oracle_ _ ') || ']' as rtrim,
    '[' || rtrim('_ _Oracle_ _','_') || ']' as rtrim_2
from dual;
