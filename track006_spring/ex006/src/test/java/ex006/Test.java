package ex006;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dto.AppUserDto;
import com.thejoa703.service.AppUserService;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test {
	@Autowired ApplicationContext context;
	@Autowired DataSource ds;
	@Autowired SqlSession session;
	@Autowired AppUserDao dao;
	@Autowired AppUserService service;
	
	@Ignore
	public void test1() {System.out.println(context);}
	@Ignore
	public void test2() {System.out.println(ds);}
	@Ignore
	public void test3() {System.out.println(session);}
	
	@Ignore
	public void test4() {
		//System.out.println(dao.select(14));
	
		
		//  AppUserDto dto = new AppUserDto(); dto.setEmail("iis2@naver.com");
		//  dto.setPassword("123"); dto.setMbtiTypeId(2);
		//  System.out.println(dao.insert(dto));
		 
		
		/*
		 * AppUserDto dto = new AppUserDto(); dto.setMbtiTypeId(1);
		 * dto.setEmail("iis2@naver.com"); dto.setPassword("123");
		 * System.out.println(dao.update(dto));
		 */
		
		/*
		 * AppUserDto dto = new AppUserDto(); dto.setEmail("iis2@naver.com");
		 * dto.setPassword("123"); System.out.println(dao.delete(dto));
		 */
		
		System.out.println(dao.selectAll());
	}
	
	@org.junit.Test
	public void test5() {
		AppUserDto dto = new AppUserDto();
		dto.setAppUserId(48);
		dto.setMbtiTypeId(33);
		System.out.println(dao.updateAdmin(dto));
	}
	
	
	
}
