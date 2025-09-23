package com.company.java010_ex;



public class ModifierEx001 {
	public static void main(String[] args) {
		
		Friend box = new Friend();
        System.out.println(box.sharedToy);
        //System.out.println(box.secretToy);
        System.out.println(box.familyToy);
        
        box.setSecretToy("로봇~~");
        System.out.println(box.getSecretToy());
	}
}
