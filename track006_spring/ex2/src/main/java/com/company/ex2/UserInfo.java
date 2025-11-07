package com.company.ex2;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
public class UserInfo {
	private String name;
	private int age;
}
