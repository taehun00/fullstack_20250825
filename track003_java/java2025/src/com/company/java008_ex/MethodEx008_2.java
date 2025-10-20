package com.company.java008_ex;

public class MethodEx008_2 {

	public static void main(String[] args) {
		char []ch = {'A', 'B', 'C', '1', '@'};
		// lower(ch);
		
		/* [heap]						[stack]
		 * 								4) lower(1000번지) 7번째줄
		 * 2) 1000번지					3) ch[1000번지]   6번째줄
		 * {'A', 'B', 'C', '1', '@'}	
		 * 
		 								1) main
		 								
		 */
	}
}
