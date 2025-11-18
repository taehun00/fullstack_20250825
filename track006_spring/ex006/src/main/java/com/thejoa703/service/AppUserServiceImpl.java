package com.thejoa703.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dto.AppUserDto;

@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired AppUserDao dao;
	
	public int insert(AppUserDto dto) {
		return dao.insert(dto);
	}

	public int update(AppUserDto dto) {
		return dao.update(dto);
	}

	
	public int delete(AppUserDto dto) {
		return dao.delete(dto);
	}

	
	public AppUserDto select(int id) {
		return dao.select(id);
	}

	
	public int join(String email) {
		return dao.join(email);
	}

	public List<AppUserDto> selectAll() {
		return dao.selectAll();
	}

	
	public AppUserDto login(AppUserDto dto) {
		return dao.login(dto);
	}

}
