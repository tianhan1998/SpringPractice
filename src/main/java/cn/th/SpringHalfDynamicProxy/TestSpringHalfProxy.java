package cn.th.SpringHalfDynamicProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHalfProxy {
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cn/th/SpringHalfDynamicProxy/bean.xml");
        UserService userService=(UserService)applicationContext.getBean("proxyFactoryBean");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
