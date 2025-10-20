package com.company.java011_ex;

class User002 {
   final String nation = "Korea";   
   final String jumin;   
   String name;

   public User002() { jumin="00000"; }
   public User002(String jumin, String name) {
      this.jumin = jumin;
      this.name = name;
   }
}

public class FinalEx {
   public static void main(String[] args) {
      User002 user1 = new User002("123456-1234567", "아이유");
      System.out.println(user1);   
      
      //user1.nation = "USA";                   //User002클래스에서 nation변수가 Korea로 값이 고정되어있는데 USA로 바꾸려해서.      
      //user1.jumin  = "123123-1234321";		//생성자에서 jumin변수를 00000으로 값이 할당됐는데 값을 123~으로 바꾸려해서. 
      user1.name = "IU"; 
      System.out.println(user1);   
   }
}