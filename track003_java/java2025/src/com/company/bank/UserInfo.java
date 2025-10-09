package com.company.bank;

public class UserInfo {
	String name;
	String id;
	String pw;
	Double money;
	SkillInfo skillInfo;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String name, String id, String pw, Double money, SkillInfo skillInfo) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.money = money;
		this.skillInfo = skillInfo;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", id=" + id + ", pw=" + pw + ", money=" + money + ", skillInfo=" + skillInfo
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public SkillInfo getSkillInfo() {
		return skillInfo;
	}
	public void setSkillInfo(SkillInfo skillInfo) {
		this.skillInfo = skillInfo;
	}
	
	
}
