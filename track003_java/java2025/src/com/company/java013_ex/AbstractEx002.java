package com.company.java013_ex;

/*
	 1) 상속도 구조 
	            Object
	              ↑
	        Astronaut { abstract explore(), report(), rest() }
	   ↑            ↑               ↑ 
	Engineer     Biologist       Pilot
	{ @explore(), @explore(),    @explore(),
	  @report(),  @report(),     @report(),
	  @rest() }   @rest() }      @rest() }

 */
abstract class Astronaut {
    protected String name;
    protected int stamina;

    public void setName(String name) { this.name = name; }
    public String setName() { return name; }
    public void setStamina(int stamina) { this.stamina = stamina; }
    public int getStamina() { return stamina; }

    abstract void explore();
    abstract void report();
    abstract void rest();
}

class Engineer extends Astronaut {
    @Override void explore() { System.out.print(this.name + " 엔지니어 탐사: 기계 장치 점검 완료!"); }
    @Override void report() { System.out.print(this.name + " 보고서: 에너지 시스템 안정적"); }
    @Override void rest() { System.out.println(this.name + " 휴식: 공구 정리하며 재충전 중..."); }
}

class Biologist extends Astronaut {
    @Override void explore() { System.out.print(this.name + " 생물학자 탐사: 외계 식물 샘플 채취!"); }
    @Override void report() { System.out.print(this.name + " 보고서: 생명체 흔적 발견"); }
    @Override void rest() { System.out.println(this.name + " 휴식: 생체 리듬 조절 중..."); }
}

class Pilot extends Astronaut {
    @Override void explore() {
        System.out.print(this.name + " 파일럿 탐사: 항로 재설정 및 우주선 조종!");
    }
    @Override void report() {
        System.out.print(this.name + " 보고서: 궤도 진입 성공");
    }
    @Override void rest() {
        System.out.println(this.name + " 휴식: 조종석에서 짧은 명상...");
    }
}


public class AbstractEx002 {
	public static void main(String[] args) {
        // Astronaut astro = new Astronaut();  // Q1. 왜 객체 생성이 불가능한가?
											// 구현부(explore(),report(),rest())에 {}가 없어서

        System.out.println("\n--- 우주 탐사 대원 시뮬레이션 ---");
        Astronaut[] crew = { new Engineer(), new Biologist(), new Pilot() };
        String[] names = { "Nova", "Flora", "Jet" };
        int[] stamina = { 75, 60, 85 };
        
        // Q2. 체력이 낮은 대원만 휴식  70미만이 휴식을 취하게 만들기 
        for (int i=0; i<crew.length; i++) {
        	int ran = (int)(Math.random()*20+5);
        	crew[i].name = names[i];
        	
        	crew[i].explore();
        	stamina[i]-=ran;
        	System.out.print(" 체력 -" + ran + "\n");
        	
        	crew[i].report();
        	stamina[i]+=10;
        	System.out.print(" 체력 +10\n");
        	
        	if(stamina[i]<70) {
        		crew[i].rest();
        		stamina[i]+=20;
        		System.out.print(" 체력 +20\n");
        	}
        	
        	if(stamina[i]<0) {
        		System.out.println("체력은 0 미만으로 떨어질 수 없습니다.");
        		stamina[i]=0;
        	}
        	
        	System.out.println("-> 현재 체력: " + stamina[i]);
        }
    }
}
