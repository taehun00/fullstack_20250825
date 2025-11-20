package com.thejoa703.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.thejoa703.dto.AppUserDto;

public interface AppUserService {
	public int insert(AppUserDto dto);
	public int update(AppUserDto dto);
	public int delete(AppUserDto dto);
	public AppUserDto select(int id);
	public List<AppUserDto> selectAll();
	public int join(String email);
	public AppUserDto login(AppUserDto dto);

	public int insert2(MultipartFile file, AppUserDto dto);
	public int update2(MultipartFile file, AppUserDto dto);
	
	public int deleteAdmin(AppUserDto dto);
	public int updateAdmin(AppUserDto dto);
}
