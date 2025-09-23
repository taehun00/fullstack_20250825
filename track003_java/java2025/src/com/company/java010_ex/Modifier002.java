package com.company.java010_ex;
import com.company.java010.UserInfo;


class UserSon1 extends UserInfo{
	public void show() {
		System.out.println("부 이름 > " + super.name);
		System.out.println("부 금고번호 > " + super.safeCode);
		//System.out.println("부 집 > " + super.house);
		//System.out.println("부 iQ > " + super.iQ); //오류
		System.out.println("부 iQ > " + super.getiQ());
		
	}
}

public class Modifier002 {
	public static void main(String[] args) {
		UserInfo user = new UserInfo();
		user.name="ㅁㅁㅁ";
		//user.safeCode="1234";
		//user.house="충청북도충주";
		//user.iQ=144;
		user.setiQ(148);
		System.out.println(user.getiQ());
	}
}
