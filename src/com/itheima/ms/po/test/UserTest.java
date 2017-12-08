package com.itheima.ms.po.test;

import com.itheima.ms.po.User;
import com.itheima.ms.po.dao.UserDao;
import com.itheima.ms.po.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
         @Autowired
        private UserDao userDao;
        @Test
         public void test01(){
             User byUserId = userDao.findByUserId(36);
             System.out.println(byUserId);
         }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = applicationContext.getBean(UserMapper.class);
        User byUserId = bean.findByUserId(36);
        System.out.println(byUserId);
    }
}
