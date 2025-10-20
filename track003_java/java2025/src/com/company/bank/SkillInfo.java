package com.company.bank;

import java.util.Arrays;
import java.util.List;

public class SkillInfo {
	List<Skill> skillList;
	List<String> skillBag;
	public SkillInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SkillInfo(List<Skill> skillList, List<String> skillBag) {
		super();
		this.skillList = skillList;
		this.skillBag = skillBag;
	}
	@Override
	public String toString() {
		return "SkillInfo [skillList=" + skillList + ", skillBag=" + skillBag + "]";
	}
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	public List<String> getSkillBag() {
		return skillBag;
	}
	public void setSkillBag(List<String> skillBag) {
		this.skillBag = skillBag;
	}
	
	
}
