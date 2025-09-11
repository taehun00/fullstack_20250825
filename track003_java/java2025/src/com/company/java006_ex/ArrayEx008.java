package com.company.java006_ex;

public class ArrayEx008 {
	public static void main(String[] args) {
		String[] name={"아이언맨","헐크","캡틴","토르","호크아이"};
	    int[] kor={100,20,100,30,35};   
	    int[] eng={100,50,100,30,100};
	    int[] mat={100,30,100,40,100};
	    int[] aver=new int[5];
	    String[] hab = new String[5];
	    String[] jang = new String[5];
	    int[] rank = new int[5];
	    int b=0;
	    
	    
	    for (int i=0; i<name.length; i++) {
	    	aver[i]=(kor[i] + eng[i] + mat[i]) / 3; //평균
	    	
	    	if(aver[i]>=60) {
	    		hab[i] = "합격";
	    	}
	    	else if(aver[i]<60) {
	    		hab[i] = "불합격";
	    	}
	    	
	    	if(aver[i]>=95) {
	    		jang[i] = "장학생";
	    	}
	    	else if(aver[i]<95) {
	    		jang[i] = "----";
	    	}
	    }
	    
	    
	    for (int i=0; i<name.length; i++) {
	    	rank[i]=1;
	    }
	    
	    for (int i=0; i<name.length; i++) { //둥수
	    	
	    	for (int j=0; j<name.length; j++) {
	    		if (aver[i] < aver[j]) {
	    			rank[i]++;
	    		}
	    		
	    	}
	    }
	    /*
	    for (int i=0; i<name.length; i++) {
	    	for (int j=0; j<name.length; j++) {
			    if (aver[i] == aver[j]) {
			    	b++;
			    }
			    else {}
	    	}
	    	b-=1;
	    } // 몇개가 중복된 평균 점수 인지 b/2개로 해야함
	    */
	    /*
	    for (int i=0; i<name.length; i++) {
	    	boolean Same = false;
	    	for (int j=0; j<name.length; j++) {
	    		
		    	if (i !=j && aver[i] == aver[j]) {
		    		Same = true;
		    		break;
			    	
		    		
			    }
		    	
		    	
	    	}
	    	if (!Same) {
	    		rank[i]--;
	    	}
	    }
	    */
	    
	    System.out.println(":::::::::::::::::::::::::::::::::::::::");
	    System.out.println("이름\t 국어\t 영어\t 수학\t 평균\t 등수\t 합격여부\t 장학생");
	    System.out.println(":::::::::::::::::::::::::::::::::::::::");
	    for (int i=0; i<name.length; i++) {
	    	System.out.println(name[i] + "\t "+ kor[i] + "\t "+ eng[i] + "\t "+ mat[i] + "\t "+ aver[i] + "\t " + rank[i] + "\t" + hab[i] + "\t "+ jang[i]);
	    }
	    System.out.println(":::::::::::::::::::::::::::::::::::::::");
	}
}
