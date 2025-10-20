package com.company.java003;
import java.util.Scanner;
public class Operator001 {
	public static void main(String[] args) {
		// 먼저 값(+,-,*,/,%,++,--) 비교(>,<) 조건(&&,||,?:) 대입(=)
		
		// 1. 값
		int a = 10, b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(0%2 + "\t" + 1%2 + "\t" + 2%2 + "\t" + 3%2);
		// 3으로 나눴을 때 0 / 나머지 0 1 2
		System.out.println(0%3 + "\t" + 1%3 + "\t" + 2%3 + "\t" + 3%3);
		
		// 2. 비교 ( ==, !=, <, >, <==, >== )
		System.out.println(10 > 3);
		System.out.println(10 == 3);
		// a가 짝수
		System.out.println(a%2 == 0);
		// b가 3의 배수
		System.out.println(b%3 == 0);
		
		// 3. && (모든조건만족시), || (여러조건중에 하나)
		System.out.println(true   &   true);
		System.out.println(true   &&  true);
		System.out.println(false  &   true);
		System.out.println(false  &&  true); // dead code
		
		System.out.println(true   |   true);
		System.out.println(true   ||  true); // dead code
		System.out.println(false  |   true);
		System.out.println(false  ||  true);
		
		// a가 2의 배수이면서 5의 배수라면 true / false
		System.out.println(a % 2 == 0 && a % 5 == 0);
		// a가 2의 배수이거나 3의 배수라면 true / false
		System.out.println(a % 2 == 0 || a % 3 == 0);
		
		// 4. 삼항연산자 (조건)? 참:거짓
		System.out.println( a == 10 ? "10입니다.":"10이 아닙니다.");
		
		// 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수, 아니라면 0
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int q3 = sc.nextInt();
		String result = q3 > 0 ? "양수" : (q3 < 0 ? "음수" : "0");
		
		// 5. 대입연산자
		int c = 10; int d = 3;
		System.out.println("1: " + ( c+=d ));   //1) c+d 2) c=13
		System.out.println("2: " + ( c-=d ));	//2) c-d 2) c=10
		
		// 6. 단항
		int a1 = 1, b1 = 1, c1 = 1, d1 = 1;
		
		System.out.println( ++ a1 );
		System.out.println(    a1 );
		System.out.println( b1 ++ );
		System.out.println(    b1 );
		
		System.out.println( -- c1 );
		System.out.println(    c1 );
		System.out.println( d1 -- );
		System.out.println( d1    );
	}
}
