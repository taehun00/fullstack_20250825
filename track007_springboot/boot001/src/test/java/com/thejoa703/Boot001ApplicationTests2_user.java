package com.thejoa703;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.transaction.annotation.Transactional;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dao.Sboard2Dao;
import com.thejoa703.dto.AppUserDto;
import com.thejoa703.dto.AuthDto;
import com.thejoa703.dto.BasicDto;
import com.thejoa703.dto.Sboard2Dto;
import com.thejoa703.service.Sboard2Service;
import com.thejoa703.service.TestService;

@SpringBootTest
@Transactional
class Boot001ApplicationTests2_user {
	@Autowired AppUserDao dao;
	
	@Test
	public void testCrudAppUserAuth() {
		// 사용자입력
		AppUserDto user = new AppUserDto();
		user.setEmail("1@1"); user.setPassword("1");
		user.setMbtiTypeId(1);user.setUfile("1.png");
		user.setMobile("010");user.setProvider("local");
		user.setProviderId("local_001");
		int result = dao.insertAppUser(user);
		System.out.println(result);
		// 권한입력
		AuthDto auth = new AuthDto();
		
		auth.setAppUserId(0);
		auth.setEmail("1@1");
		auth.setAuth("ROLE_USER");
		int result_auth = dao.insertAuth(auth);
		System.out.println("... 2." + result_auth);
		// 로그인
		AppUserDto login = new AppUserDto();
		login.setEmail("1@1"); login.setProvider("local");
		System.out.println(".............3" +dao.readAuthByEmail(login));
		//아이디중복
		AppUserDto iddouble = new AppUserDto();
		iddouble.setEmail("1@1"); iddouble.setProvider("local");
		System.out.println(".............4" +dao.iddoubleByEmail(iddouble));
		//마이페이지
		AppUserDto mypage = new AppUserDto();
		mypage.setEmail("1@1"); mypage.setProvider("local");
		AppUserDto findUser = dao.findByEmail(mypage);
		int id = findUser.getAppUserId();
		System.out.println(".............5" + findUser);
		//수정
		AppUserDto update = new AppUserDto();
		update.setMbtiTypeId(3);
		update.setNickname("nickname001"); update.setAppUserId(id);
		System.out.println("..............6" + dao.updateAppUser(update));
		//권한삭제
		AuthDto dauth = new AuthDto(); dauth.setEmail("1@1");
		System.out.println(".......8" + dao.deleteAuth(dauth));
		//사용자삭제
		AppUserDto delete = new AppUserDto();
		delete.setAppUserId(id);
		System.out.println("..........7" + dao.deleteAppUser(delete));
	}
}
