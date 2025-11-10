package spring003;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.ioc.IceCream;
import com.thejoa703.ioc.IceCreamShop;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class BeansTest {

	@Autowired ApplicationContext context;
	
	@Test public void test() {
		IceCreamShop bera31 = (IceCreamShop) context.getBean("shop");
		bera31.open();
	}
}
