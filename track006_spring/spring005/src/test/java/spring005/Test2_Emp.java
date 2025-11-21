package spring005;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.EmpDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test2_Emp {
	@Autowired EmpDao dao;
	
	@Test
	public void test1() {
		Map<String, String> para = new HashMap<>();
		para.put("searchType", "ename");
		para.put("keyword", "SMITH");
		System.out.println(dao.test1(para));
	}
}
