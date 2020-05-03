package org.example.test;

import org.example.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void  Test1()
    {
        //加载配置文件
        ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService as= (AccountService)ac.getBean("AccountService");
        //调用方法
        as.findAll();

    }
}
