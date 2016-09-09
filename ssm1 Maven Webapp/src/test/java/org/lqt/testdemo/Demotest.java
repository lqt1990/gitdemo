package org.lqt.testdemo;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.lqt.entity.User;
import com.cn.lqt.service.IUserService;



@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class Demotest {
  private static Logger logger = Logger.getLogger(Demotest.class);
//	private ApplicationContext ac = null;
  @Resource
  private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

  @Test
  public void test1() {
	  userService.add(new User(5,"lqt"));
    // System.out.println(user.getUserName());
    // logger.info("值："+user.getUserName());
   
  }
}