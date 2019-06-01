package cn.th.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAop {

    public void demo01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService)context.getBean("userServiceID");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}