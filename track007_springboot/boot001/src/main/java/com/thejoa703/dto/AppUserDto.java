package com.thejoa703.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDto {
	private int appUserId;
	private String email;
	private String password;
	private int mbtiTypeId;
	private String createdAt;
	private String ufile;
	private String mobile;
	private String nickname;
	private String provider;
	private String providerId;
	public AppUserDto(String email, String provider) {
		super();
		this.email = email;
		this.provider = provider;
	}
	
	
}
