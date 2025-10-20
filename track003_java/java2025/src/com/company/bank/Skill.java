package com.company.bank;

public class Skill {
	String name;
	double cost;
	int damage;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(String name, double cost, int damage) {
		super();
		this.name = name;
		this.cost = cost;
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Skill [name=" + name + ", cost=" + cost + ", damage=" + damage + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
}
