package com.company.java005_ex;
import java.util.Scanner;

public class Bank_Miniporject {
	//1. 필요한기능들
	// 각각의 기능별 - 추가, 조회, 입금, 출금, 삭제 
	// 보조기능     - empty()  빈칸찾기 ,  사용자인증정보 
	
	//2. 리턴값 메서드명 파라미터
	// 보조기능     - find()  빈칸찾기    int  find(){} ,  사용자인증정보   int  auth(){    }
	// 각각의 기능별 -        추가, 조회, 입금, 출금, 삭제 
	public static int is_idfind(String targetId, String[] Id) { // 회원가입 시
		for (int i =0;i<Id.length;i++) {					 // 아이디 동일하면 컷
			if(Id[i]!=null && targetId.equals(Id[i])) {
				System.out.println("이미 존재하는 아이디입니다.");
				return 0;
			}
		}
		return 1;
	}
	
	public static int aa(String []id,String []pw) {
		Scanner sc = new Scanner(System.in);
		int find = -1;  //find 인증할 번호
		
        System.out.print("[1]아이디 입력 > ");
        String tempid = sc.next();
        System.out.print("[2]비밀번호입력 > ");
        String temppass = sc.next();
		
		for(int i=0; i<id.length; i++) {
			if (tempid.equals(id[i]) && temppass.equals(pw[i])){
				find = i;
				break;
			}
		}
		return find;
	}
	
	public static int ebgum(Double put) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금 : ");
		put = sc.nextDouble();
		
	}
	
	public static void main(String[] args) {
		String []id = new String[3];
		String targetid;
		String []pw = new String[3];
		String findid;
		String findpw;
		int []age = new int[3];
		double []balance = new double[3]; // 잔액
		int count = 0;
		int a = 0;   		//switch 선택
		double putmoney = 0; 	// 입금
		double getmoney = 0; 	// 출금
		String confirm; 	// 계좌 삭제 여부
		Scanner sc = new Scanner(System.in);
		   
		for(;;) {
			System.out.println("======BANK======");
			System.out.println("1.추가");
			System.out.println("2.조회");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.삭제");
			System.out.println("9.종료");
			System.out.println("입력>>> ");
			a = sc.nextInt();
			
			switch(a) { // 1번째 switch
				
				case 1 :
					System.out.print("아이디 입력 : ");
					targetid = sc.next();
					
					int findd = -1;
					
					if(is_idfind(targetid, id) == 0){
						break;
					}
					id[count]=targetid;
					
					System.out.print("비밀번호 입력 : ");
					pw[count] = sc.next();
					System.out.print("나이 입력 : ");
					age[count] = sc.nextInt();
					System.out.print("잔액 입력 : ");
					balance[count] = sc.nextInt();
					if (balance[count]<0) {System.out.println("초기잔액이 음수가 나올 수 없습니다.");
						id[count] = null;
						pw[count] = null;
						age[count] = 0;
						balance[count] = 0;
					}
					count++;
					break;
					
				case 2 : case 3 : case 4 : case 5 :
					int find = aa(id,pw);
					/*
					 int find=-1;  //find 인증할 번호
            System.out.print("[1]아이디 입력 > ");  
            String tempid = scanner.next();
            System.out.print("[2]비밀번호입력 > ");  
            String temppass = scanner.next();
            for(int i=0; i<id.length; i++) { 
               if(tempid.equals(id[i]) && temppass.equals( pass[i] )  )
               { find=i;  break; } 
            }
					 */
					if (find == -1) {
						System.out.println("다시 입력해주세요");
						break;
					}
					
					switch(a) { // 2번째 swithch
						case 2 :
							System.out.println("==계좌조회");
							System.out.println("id : " + id[find]);
							System.out.println("pw : " + pw[find]);
							System.out.println("나이 : " + age[find]);
							System.out.println("잔액 : " + balance[find]);
								
							break;
							
						case 3 :
							
							System.out.print("입금 : ");
							putmoney = sc.nextDouble();
							if(putmoney<0) {System.out.println("입금을 할 수 없습니다.(음수 금지)"); break;}
							
							System.out.println("==입금완료");
							balance[find] += putmoney;
							System.out.println("잔액 : " + balance[find]);
							
							break;
						
						case 4 :
							System.out.print("출금 : ");
							getmoney = sc.nextDouble();
							if(getmoney<0) {System.out.println("출금을 할 수 없습니다.(음수 금지)"); break;}
							
							if(balance[find]<getmoney) {System.out.println("출금할 돈이 없습니다.");}
							else {
								balance[find] -= getmoney;
							}
							
							System.out.println("==출금완료");
							System.out.println("잔액 : " + balance[find]);
							
							break;
							
						case 5 :
							System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
							confirm = sc.next();
							
							if (confirm.equals("Y") || confirm.equals("y")) {
								
								id[find] = null;
								pw[find] = null;
								age[find] = 0;
								balance[find] = 0;
								
								System.out.println("계좌가 삭제되었습니다.");
							}
							else System.out.println("처음으로 돌아갑니다.");
							
							count--;
							
							break;
					} // 2번째 switch
					
					break;
					
				case 9 :
					System.out.println("종료");
					System.exit(0);
					break;
					
				default :
					System.out.println("잘못된 메뉴번호입니다.");
					break;
				
			} // 1번째 switch
			
		}
	}
}
