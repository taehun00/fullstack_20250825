package com.company.java010_ex;

public class Friend {
	public String sharedToy = "블록";
	private String secretToy = "로봇";
	protected String familyToy = "퍼즐";
	
	public String getSecretToy() {
		return secretToy;
	}
	public void setSecretToy(String secretToy) {
		this.secretToy = secretToy;
	}
	public void printInfo() {
        System.out.println("Friend [sharedToy=\"" + sharedToy + "\", secretToy=\"" + secretToy + "\", familyToy=\"" + familyToy + "\"]");
    }
}