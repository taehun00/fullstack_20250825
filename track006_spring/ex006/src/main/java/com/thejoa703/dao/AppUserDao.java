package com.thejoa703.dao;

import java.util.List;

import com.thejoa703.dto.AppUserDto;

@AppUser
public interface AppUserDao {
	public int insert(AppUserDto dto);
	public int update(AppUserDto dto);
	public int delete(AppUserDto dto);
	public AppUserDto select(int id);
	public List<AppUserDto> selectAll();
	public int join(String email);
	public AppUserDto login(AppUserDto dto);

	public int insert2(AppUserDto dto);
	public int update2(AppUserDto dto);
}
