### 1. java?
- 한 번 작성하면 어디서든 실행된다.
- JDK 설치 -> 작성 -> 컴파일 -> 실행
- JVM 운영체제의 다른 차이점을 처리해줘 개발자는 프로그램 작성만 집중
- 객체지향언어

### 2. java settion (1) 자바 다운로드 및 설치
- java.sun.com
- https://www.oracle.com/java/technologies/?er=221886
- 설치
- C:\Program Files\Java\jdk-11 폴더찾기

### 3. java setting (2) 환경설정
- 내컴퓨터 - [속성] - 시스템속성 - 환경변수 - 시스템변수

    JAVA_HOME    -----      C:\Program Files\Java\jdk-11

    path     -----         %JAVA_HOME%\bin

### 4. java setting (3) ECLIPSE
- eclipse.org
- [download] - Eclipse IDE for Java EE Developers

### 5. java settine (4) ECLIPSE 셋팅
- perspective : 개발에 유용한 view들 만 묶어놓은 작업창
    window - perspective - open perspective - [java]
- utf-8
    window - preferences - 검색 [enc]
- 이클립스 단축키
    - 명령어 불러오기   ctrl + space
    - 주석            ctrl + shift + /
    - import         ctrl + shift + o
    - 정렬            ctrl + shift + f
    - 한 줄 정렬       ctrl + alt + j

### 6. java

> Q)    패키지명 : com.company.java001_ex 
>       클래스명 : A000_ex.java
>       "한 번 작성하면 어디서든 실행된다." 출력

```bash
package com.company.java001_ex;

public class A000_ex {
	public static void main(String[] args) {
		System.out.println("한 번 작성하면 어디서든 실행된다.");
	}
}
```

### 7. 출력
System.out.print("Hello");   // 줄바꿈안됨.
System.out.println("Hello");   // 줄바꿈 됨.
System.out.println("Hello\nSally");   // 줄바꿈.
// 포맷형식  %s , %d
System.out.printf("이름 : %s  나이: %d " , "길동"  , 12 );

```bash
package com.company.java001;

public class A002 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("AB");
        System.out.println("ABC"); // 여러줄사용
        
        // 한줄로만드는 방법은?
        System.out.println("A\nAB\nABC");  // 줄바꿈  \n
        
        // 포맷형식  %s , %d
        System.out.printf("이름 : %s  나이: %d " , "길동"  , 12 );
    }
}

```
```bash
Q1
package : com.company.java001_ex
class   : A001_ex
출력내용  : Hello World! 
```

```bash
Q2
package : com.company.java001_ex
class   : A002_ex
문제 : 다음을 한줄로, 포맷형식에 맞게 처리하시오
    // 다음을 한 줄 출력
        System.out.println("X");
        System.out.println("XY");
        System.out.println("XYZ");
    // 포맷형식이용해서 출력	

출력내용  : 
    X
    XY
    XYZ

    도시 : 인천  ,  인구:1000000
```

#### ■7. 출력 (1)   println, print, printf
 1)  System.out.println("문자열-하고싶은말");  // \n줄바꿈
 2)  System.out.print("문자열-하고싶은말");   //줄바꿈처리안됨
 3)  System.out.printf("내나이%d ,  내이름%s , 좋아하는 숫자  파이 %f" , 10 , "ab" , 1.23 );
     %d 숫자정수 : 10,20,30  ( 소수점 안붙음)
     %s  문자열   :  "abc"
     %f 숫자실수 :  1.23 , 1.5, 3.14
     
   System.out.println("A");   
   System.out.println("AB");   
   System.out.println("ABC");   

   System.out.println("A\nAB\nABC");   

#### ■7. 출력 (2)   + 의미 , ()
System.out.println( 1+ 2 );    //3
System.out.println( 1+ 2 + "+" + 3 + 4);  // 3 + 34    ?
System.out.println( "" + 1 + 2);  // 12

1)            +    연산(더하기)
2)     숫자 +   숫자        - 더하기연산
3)     숫자 +   문자열 ,   문자열 + 숫자   - 출력
 

연습문제1)  
패키지명 : com.company.java002_ex
클래스명 : PrintEx001
출력내용 : 
     println, print, printf를 이용해서 
   
    좋아하는 색상은 RED입니다.


연습문제2)  
패키지명 : com.company.java002_ex
클래스명 : PrintEx002
출력내용 : 
   다음의 코드를 10+3=13  나오게 도전!
   System.out.println(  10+3=10+3  );   

### 8.  변수
1. 값?
- 토큰 : 특정의미를 가진문자
- 리터럴, 키워드, 식별자, 연산자,구분자

  System.out.println("hello");

2. 값의 보관
- 값의 보관 == 메모리확보
- 변수 : 변하는 수 (오픈박스) ,  한개의 값
- 상수 : 변하지 않는(상) 수  (밀봉박스)
- 변수이름규칙 :   $_소문자7

3. 변수사용법
   자료형  변수명   

   int       a;         -       int  정수 1,2,3             a[ ]
   double b;         - double  실수 1.23              b[ ]
   
   a=10;                                                      a[10]
   a=20;                                                      a[20]

※ 상수    final   int    JAVA_HOME ;   - 수정못해!

#### ■9. 자료형 (1)
1) 자료형의 구분
- 기본형 : 실제값 저장
- 참조형 : 주소값 저장 ( String ) 

2) 기본자료형 
- 논리형 - boolean  true/false
- 정수형 - byte(1byte) -short(2byte) - int(4byte) ★  - long(8byte)  
                                                       long l = 4L;
- 실수형 - float(4byte)      - double(8byte) ★
          float f= 3.14f;     double d = 3.14;

***★ 자바 기본처리단위 *** 
***★ 실수는 정수보다 크다(표현가능한 값의 범위와 타입의 복잡성) *** 
ㅁ long(8byte)           <   float(4byte) 소수점 포함한 실수표현
  큰물통(딱물정량-정수)         고압탱크(압축해서 엄청난 물 담기 - 실수+지수)


기본문제1) DataType001
기본문제2) Input002 - scanner.nextInt
기본문제3) DataType003 - scanner.nextFloat

연습문제1)    ※ Input002  참고
패키지명 : com.company.java002_ex
클래스명 : InputEx001
출력내용 : 
   1-1.  나이를 입력받을 자료형 선택후  변수명  age로 하시오.  예) 10,20
   1-2.  Scanner이용해서 나이 입력받고 출력하시오.
  
    당신의 나이를 입력하시오 > _입력받기
    내 나이는 ** 입니다.

    ```bash
    package com.company.java002_ex;
    import java.util.Scanner;

    public class InputEx001 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("당신의 나이를 입력하시오 >");
            int age = sc.nextInt();
            
            System.out.println("내 나이는 " + age + "입니다.");
        }
    }
    ```

연습문제2)
패키지명 : com.company.java002_ex
클래스명 : InputEx002
출력내용 :  Scanner이용해서 좋아하는 수를 입력받고 출력하시오.
    좋아하는 수(정수)   입력하시오 > _입력받기
    좋아하는 숫자는 ** 입니다.

    ```bash
    package com.company.java002_ex;
    import java.util.Scanner;

    public class InputEx002 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            
            System.out.println("좋아하는 수(정수)를 입력하시오 > ");
            num = sc.nextInt();
            
            System.out.println("좋아하는 숫자는 " + num + "입니다.");
        }
    }
    ```

연습문제3)
패키지명 : com.company.java002_ex
클래스명 : InputEx003
출력내용 :  Scanner이용해서 태어난 년도 입력받아 나이 출력하기
     태어난 년도를 입력하세요. > _입력받기    2000
     당신의 나이는 25살 입니다.

    ```bash
    public class InputEx002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("태어난 년도 입력 > ");
		year = sc.nextInt();
		
		System.out.println("당신의 나이는 " + (2025 - year + 1) + "입니다.");
		}
    }
    ```