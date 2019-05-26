package cn.th.SpringAOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TestAopTest {

    @Test
    public void demo01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        UserService userService= (UserService)context.getBean("userServiceID");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}