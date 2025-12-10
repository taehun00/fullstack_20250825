package com.thejoa703;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import com.thejoa703.dao.Sboard2Dao;
import com.thejoa703.dto.BasicDto;
import com.thejoa703.dto.Sboard2Dto;
import com.thejoa703.service.Sboard2Service;
import com.thejoa703.service.TestService;

@SpringBootTest
class Boot001ApplicationTests {
	@Autowired TestService service;
	@Autowired
    private Sboard2Dao dao;
	@Autowired private Sboard2Service sservice;

	@Disabled@Test
	void contextLoads() { 				//Junit4 : @Ignore,	Junit5 : @Disabled
		BasicDto dto = new BasicDto();
		dto.setName("sally");
		dto.setAge(10);
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
	}

	@Disabled@Test
	void serviceTest() {
		System.out.println("..." + service.readTime());
	}
	
	@Disabled@Test
	void test() {
		Sboard2Dto dto = new Sboard2Dto();
        dto.setAppUserId(1);
        dto.setBtitle("테스트 제목");
        dto.setBcontent("테스트 내용");
        dto.setBpass("1234");
        dto.setBfile("test.png");
        dto.setBip("127.0.0.1");
        
        System.out.println(dao.insert(dto));
	}
	@Disabled@Test
	void test1() {
        Sboard2Dto dto = new Sboard2Dto();
        dto.setId(2); // 수정할 PK
        dto.setBtitle("수정된 제목");
        dto.setBcontent("수정된 내용");
        dto.setBfile("update.png");
        dto.setBpass("1234");

        System.out.println(dao.update(dto));
    }
	
	@Disabled@Test
    void test2() {
        //System.out.println(dao.updateHit(2));
		System.out.println(dao.selectAll());
		//System.out.println(dao.select(2));
		/*
		 * Sboard2Dto dto = new Sboard2Dto(); dto.setId(2); dto.setBpass("1234");
		 * System.out.println(dao.delete(dto));
		 */
    }
	
	@Disabled@Test
	void tests1() throws UnknownHostException {
		MockMultipartFile file = new MockMultipartFile( "file2", "file2.txt", "test/plain", "".getBytes());
		Sboard2Dto dto = new Sboard2Dto();
        dto.setAppUserId(1001);
        dto.setBtitle("테스트 제목");
        dto.setBcontent("테스트 내용입니다.");
        dto.setBpass("1234");
        dto.setBip( InetAddress.getLocalHost().getHostAddress() );
        
        System.out.println(sservice.insert(file, dto));

	}
	
	@Disabled@Test
	void tests2() {
		Sboard2Dto dto = new Sboard2Dto();
		dto.setId(4);
        dto.setBtitle("수정된 제목");
        dto.setBcontent("수정된 내용");
        dto.setBfile("update.png");
        dto.setBpass("1234");
        MockMultipartFile file = new MockMultipartFile( "file2", "file2.txt", "test/plain", "".getBytes());
        System.out.println(sservice.update(file, dto));
	}

	@Test
	void tests3() {
		//System.out.println(sservice.selectAll());
		
		System.out.println(sservice.select(5));
		//Sboard2Dto dto = new Sboard2Dto(); dto.setId(4); dto.setBpass("1234");
		//System.out.println(sservice.delete(dto));
	}
}
