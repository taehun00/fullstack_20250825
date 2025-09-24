package com.company.java010_ex;

import com.company.java011_ex.Milk;

public class ModifierEx2 {
	public static void main(String[] args) {
      Milk m1 = new Milk();  
      m1.printInfo();
      //System.out.println( m1 );  
      m1.setMprice(2000);       
      //System.out.println( m1 );
      m1.printInfo();
   }
}

