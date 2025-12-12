package com.thejoa703.dao;

import org.apache.ibatis.annotations.Mapper;

import com.thejoa703.dto.AppUserAuthDto;
import com.thejoa703.dto.AppUserDto;
import com.thejoa703.dto.AuthDto;

@Mapper
public interface AppUserDao {
	/* 회원관리 */
	public int insertAppUser(AppUserDto dto);
	public AppUserAuthDto readAuthByEmail(AppUserDto dto);
	public AppUserDto findByEmail(AppUserDto dto);
	public int iddoubleByEmail(AppUserDto dto);
	public int updateAppUser(AppUserDto dto);
	public int deleteAppUser(AppUserDto dto);
	
	/* 권한관리 */
	public int insertAuth(AuthDto dto);
	public int deleteAuth(AuthDto dto);
}
