package com.thejoa703.ioc;

//@Data
public class DiTest {
	private String name;
	private int age;
	public DiTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DiTest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "DiTest [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
