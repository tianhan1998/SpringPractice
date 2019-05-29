package cn.th.SpringAOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopTest {

    @Test
    public void demo01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userServiceID");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}