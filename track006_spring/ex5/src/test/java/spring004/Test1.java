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


   @RunWith(SpringJUnit4ClassRunner.class)
   @ContextConfiguration(locations="classpath:config/root-context.xml") 

   public class Test1 {
      
      @Autowired ApplicationContext context;
      @Autowired DataSource datasource;
      @Autowired SqlSession sqlSession;
      
      @Ignore
      public void test1() {System.out.println(context);}
      
      @Ignore public void test2() {System.out.println(datasource);}
      
      @Test public void test3() {System.out.println(sqlSession);
      }   
}