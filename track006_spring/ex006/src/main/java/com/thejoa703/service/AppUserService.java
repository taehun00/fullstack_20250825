package com.thejoa703.service;

import java.util.List;

import com.thejoa703.dto.AppUserDto;

public interface AppUserService {
	public int insert(AppUserDto dto);
	public int update(AppUserDto dto);
	public int delete(AppUserDto dto);
	public AppUserDto select(int id);
	public List<AppUserDto> selectAll();
	
	public AppUserDto login(AppUserDto dto);

}
