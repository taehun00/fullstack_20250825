package com.thejoa703.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthDto {
	private String auth;
	private String email;
	private int appUserId;
	private int authId;
	public AuthDto(String auth, String email) {
		super();
		this.auth = auth;
		this.email = email;
	}
	
	
	
}
