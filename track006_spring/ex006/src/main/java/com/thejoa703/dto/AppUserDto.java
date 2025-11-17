package com.thejoa703.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDto {
	private int appUserId;
	private String email;
	private String password;
	private int mbtiTypeId;
	private Date createdAt;
}
