select distinct job from emp;
select empno as employee_no, ename as employee_name, mgr as manager, sal as salary, comm as commission, deptno as department_no from emp order by deptno desc, ename;
select * from emp where sal >=2000 and sal <=3000;
select * from emp where sal between 2000 and 3000;
select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';
select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
select * from emp where ename like 'S%';
select * from emp where ename like '_L%';
select * from emp where ename like '%AN%';


-- ex001
select empno, substr(empno, 1, 2) || rpad('*', 2, '*') as masking_empno, ename, substr(ename, 1, 1) || rpad('*',LENGTH(ENAME) - 1, '*') as masking_ename
from emp
where length(ename) in (5,6);


-- ex002
select empno, ename, sal, trunc(sal/21.5, 2) as day_pay, round(sal/(21.5*8), 1) as time_pay
from emp;

-- ex003
select empno,
       ename,
       hiredate,
       to_char(next_day(add_months(hiredate, 3), '월요일'), 'YYYY-MM-DD') as r_job,
       nvl(to_char(comm), 'n/a') as comm
from emp;

-- ex004
select empno, ename, mgr,
    case
        when mgr is null then '0000'
        when substr(mgr,1,2) = 75 then '5555'
        when substr(mgr,1,2) = 76 then '6666'
        when substr(mgr,1,2) = 77 then '7777'
        when substr(mgr,1,2) = 78 then '8888'
        else to_char(mgr)
    end as chg_mgr
from emp;

select round(1234.5678), round(1234.5678, 0), round(1234.5678, 1), round(1234.5678, 2), round(1234.5678, -1), round(1234.5678, -2)
from dual;

select ceil(3.14), floor(3.14), ceil(-3.14), floor(-3.14)
from dual;

select mod(10,3), mod(10,2), mod(10,4)
from dual;

select sysdate 오늘, sysdate-1 어제, sysdate+1 내일
from dual;

select sysdate 오늘, add_months(sysdate, 3)
from dual;

select empno, ename, hiredate, add_months(hiredate, 120)
from emp;

select empno, ename, hiredate, sysdate, add_months(hiredate,504)
from emp
where add_months(hiredate,504) > sysdate;

select empno, ename, hiredate, to_date('2024-12-21', 'YYYY-MM-DD'),
    months_between(hiredate, to_date('2024-12-21', 'YYYY-MM-DD')),
    months_between( to_date('2024-12-21', 'YYYY-MM-DD'), hiredate),
    trunc(months_between( to_date('2024-12-21', 'YYYY-MM-DD'), hiredate))
from emp;

select sysdate, next_day(sysdate, '월요일'), last_day(sysdate)
from dual;

select sysdate, round(sysdate, 'cc'), round(sysdate, 'yyyy'), round(sysdate, 'q'), round(sysdate, 'ddd'), round(sysdate, 'hh')
from dual;

select sysdate, trunc(sysdate, 'cc'), trunc(sysdate, 'yyyy'), trunc(sysdate, 'q'), trunc(sysdate, 'ddd'), trunc(sysdate, 'hh')
from dual;

select empno, ename, empno + '500'
from emp
where ename='SCOTT';

select sysdate, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS')
from dual;

-- Q6-34
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON') AS MON,
       TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY') AS DY,
       TO_CHAR(SYSDATE, 'DAY') AS DAY
  FROM DUAL;

-- Q6-35
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MON_KOR,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MON_ENG,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MONTH_KOR,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MONTH_JPN,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MONTH_ENG
  FROM DUAL;

-- Q6-36
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DY_KOR,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DY_JPN,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DY_ENG,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DAY_KOR,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DAY_JPN,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DAY_ENG
  FROM DUAL;

-- Q6-37
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
       TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AM,
       TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
  FROM DUAL;

-- Q6-38
SELECT SAL,
       TO_CHAR(SAL, '$999,999') AS SAL_$,
       TO_CHAR(SAL, 'L999,999') AS SAL_L,
       TO_CHAR(SAL, '999,999.00') AS SAL_1,
       TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
       TO_CHAR(SAL, '000999999.99') AS SAL_3,
       TO_CHAR(SAL, '999,999,00') AS SAL_4
  FROM EMP;

select 1300 - to_number('1500')
from dual;

select '1,500' - '1,300'
from dual; -- X

select to_number('1,500', '999,999') - to_number('1,300', '999,999')
from dual;

select to_date('2025-10-17','YYYY-MM-DD')
from dual;