 package spring004;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.TestDao;
import com.thejoa703.dao.UserInfoDao;
import com.thejoa703.dto.UserInfoDto;


   @RunWith(SpringJUnit4ClassRunner.class)
   @ContextConfiguration(locations="classpath:config/root-context.xml") 

   public class Test1 {
      
      @Autowired ApplicationContext context;
      @Autowired DataSource datasource;
      @Autowired SqlSession sqlSession;
      @Autowired TestDao dao;
      @Autowired UserInfoDao userdao;
      
      @Ignore
      public void test1() {System.out.println(context);}
      
      @Ignore public void test2() {System.out.println(datasource);}
      
      @Ignore public void test3() {System.out.println(sqlSession);}
      
      @Test public void test4() {System.out.println(dao.now());}   
      //1. insert , selectAll
      @Ignore public void test5() {
    	  UserInfoDto dto = new UserInfoDto();
    	  dto.setEmail("a@a"); dto.setAge(1);
    	  System.out.println(userdao.insert(dto));
    	  
    	  System.out.println(userdao.selectAll());
      }
      //2. select
      @Ignore public void test6() {
    	  System.out.println(userdao.select(25));
      }
      //3. update
      @Ignore public void test7() {
    	  UserInfoDto dto = new UserInfoDto();
    	  dto.setEmail("b@b"); dto.setAge(2);
    	  dto.setNo(25);
    	  System.out.println(userdao.update(dto));
      }
      //4. delete
      @Ignore public void test8() {
    	  System.out.println(userdao.delete(25));
      }
      @Ignore public void test9() {
    	  System.out.println(userdao.select(25));
      }
}