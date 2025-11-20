package com.thejoa703.service;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dto.AppUserDto;

@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired AppUserDao dao;
	
	public int deleteAdmin(AppUserDto dto) {
		// TODO Auto-generated method stub
		return dao.deleteAdmin(dto);
	}

	@Override
	public int updateAdmin(AppUserDto dto) {
		// TODO Auto-generated method stub
		return dao.updateAdmin(dto);
	}

	
	
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

	@Override
	public int insert2(MultipartFile file, AppUserDto dto) {
		if(!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			String uploadPath = "C:/file/";
			File img = new File(uploadPath + fileName);
			try {
				file.transferTo(img);
				dto.setUfile(fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			String fileName = "default/user" + (int)((Math.random()*7) + 1) + ".png";
			dto.setUfile(fileName);
		}
		
		return dao.insert2(dto);
	}

	@Override
	public int update2(MultipartFile file, AppUserDto dto) {
		if(!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			String uploadPath = "C:/file/";
			File img = new File(uploadPath + fileName);
			try {
				file.transferTo(img);
				dto.setUfile(fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dao.update2(dto);
	}

}
