package com.thejoa703.dto;

import lombok.Data;

@Data
public class AuthDto {
	private String auth;
	private String email;
	private int appUserId;
	private int authId;
}
