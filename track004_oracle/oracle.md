# 1. 저장단위
변수 < 배열 < 클래스 < 콜렉션프레임워크 file DB
※ DB( mysql , oracle , mssql )

> java : jdbc -> dbcp -> orm (mybatis , jpa)

# 2. RDB (Relational DataBase)
1. 엔티티(entity)     - 테이블       - 관리할 대상 (고객, 주문, 상품)
2. 속성(attributy)    - 컬럼        - 대상의 특징 (주민번호, 이름, 나이)
3. 관계(relationship) - 대상간의 연결 - 고객은 주문을 한다

# 3. 데이터베이스 언어
1. 정의어(DDL) - create, alter, drop > cad
2. 조작어(DML) - insert, select, update, delete
3. 제어어(DCL) - grant, revoke


<<사원>>
> desc emp;
이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)    

<<부서>>
> desc dept;
이름     널?       유형           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 



#4. SELECT