package cn.th.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAop {
        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
                UserService userService = (UserService) context.getBean("userService");
                userService.addUser();
                userService.deleteUser();
                userService.updateUser();
        }
}