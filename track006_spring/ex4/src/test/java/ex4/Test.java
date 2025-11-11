package ex4;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.MilkInfoDao;
import com.thejoa703.dto.MilkInfoDto;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")

public class Test {
	@Autowired ApplicationContext context;
	@Autowired DataSource datasource;
	@Autowired SqlSession sqlSession;
	@Autowired MilkInfoDao dao;
    
	
	@Ignore
	public void test1() {System.out.println(context);}
	@Ignore
	public void test2() {System.out.println(datasource);}
	@Ignore
	public void test3() {System.out.println(sqlSession);}
	@Ignore
	public void test4() {System.out.println(dao.selectAll());}
	@Ignore
	public void test5() {
		MilkInfoDto dto = new MilkInfoDto();
		dto.setMname("서울우유"); dto.setMnum(101);
		dto.setMtotal(1001);
		System.out.println(dao.insert(dto));
	}
	@Ignore
	public void test6() {
		System.out.println(dao.select(21));
	}
	@Ignore
	public void test7() {
		MilkInfoDto dto = new MilkInfoDto();
		dto.setMname("서울우유1"); dto.setMnum(102);
		dto.setMno(21);
		System.out.println(dao.update(dto));
	}
	@Ignore
	public void test8() {
		System.out.println(dao.delete(21));
	}
	@org.junit.Test
	public void test9() {
		System.out.println(dao.selectAll());
	}
}
