package com.company.bank;

import java.util.ArrayList;
import java.util.List;

public class SkillData {
	public static List<Skill> getDefaultSkills() {
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("파이어볼", 100.0, 30));
        skills.add(new Skill("아이스블래스트", 120.0, 25));
        skills.add(new Skill("썬더스트라이크", 150.0, 40));
        
        
        return skills;
    }
}
