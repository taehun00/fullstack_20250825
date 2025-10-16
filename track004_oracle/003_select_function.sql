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


-- 1. 문자열
-- 2. 숫자    : round / trunc(반올림/내림), ceil(올림), floor(내림), mod(나머지)
-- 3. 날씨    : sysdate(시스템날짜), add_months(몇달뒤에), next_day, last_day
-- 4. 변환    : to_char (날짜형식변환), to_date
-- 5. 조건    : decode, case(조건분기), nvl, nvl2 (null)
-----------------------
-- 2. 숫자
select round(1234.5678), round(1234.5678 , 2), trunc(1234.5678 , 2), ceil(1.1), floor(4.8), mod(10,3)
from dual;
-----------------------
-- 3. 날씨
select sysdate, add_months(sysdate, 2), months_between('25-12-1','24-12-1')
from dual;

select next_day(sysdate, '월요일') "다음주 월요일", last_day(sysdate) "해당 월의 마지막 날짜"
from dual;

-----------------------
-- 4. 변환 
select to_char(sysdate, 'YYYY-MM-DD'), to_date('2025-10-16', 'YYYY-MM-DD')
from dual;

select to_char(1234)+1, to_number('5678')+1
from dual;

-- select to_cher('일이삼사') + 1, to_number('5678') + 1 오류
-- from dual;

-- 5. 조건
select nvl( null, '대체값')
from dual;

select nvl( to_char(comm), '입력안됨.')
from emp;

select nvl2(null, 'A','B') -- null일 때 b, 아니면 a
from dual;

select nvl2(mgr, mgr, '--') from emp; -- 오류나는 이유
select nvl2(mgr, to_char(mgr), '--') from emp; -- 해결방안

select decode( deptno, 10, '부서10', 20, '부서20', 30, '부서30' )
from emp;

select case 
            when deptno=10 then '부서10' 
            when deptno=20 then '부서20' 
            when deptno=30 then '부서30' 
            else                '부서x'
       end
from emp;

select case deptno
            when 10 then '부서10' 
            when 20 then '부서20' 
            when 30 then '부서30' 
            else         '부서x'
       end
from emp;

--- 45
select empno, ename, sal, comm, sal+comm, nvl(comm,0), sal+nvl(comm,0)
from emp;

--- 46
select empno, ename, comm, nvl2(comm,'O','X'), sal*12 + nvl2(comm,comm,0) as annsal
from emp;

--- 47
select empno, ename, job, sal, decode(job, 'MANAGER', sal*1.1, 'SALESMAN', sal*1.05, 'ANALYST', sal, sal*1.03) as upsal
from emp;

--- 48
select empno, ename, job, sal,
    case job
        when 'MANAGER' then sal*1.1
        when 'SALESMAN' then  sal*1.05
        when 'ANALYST' then sal
        else    sal*1.03
    end as upsal
from emp;

--- 49
select empno, ename, comm,
    case
        when comm is null then '해당사항 없음'
        when comm = 0 then '수당없음'
        when comm > 0 then '수당 : ' || comm
        else '기타'
    end as comm_text
from emp;