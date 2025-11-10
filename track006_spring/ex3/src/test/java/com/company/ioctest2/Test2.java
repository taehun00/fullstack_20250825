package com.company.ioctest2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/test2.xml")
public class Test2 {
	@Autowired ApplicationContext context;
	
	@Test public void test() {
		AnimalFarm2 farm = (AnimalFarm2) context.getBean("animalFarm2");
		farm.print();
	}
}
