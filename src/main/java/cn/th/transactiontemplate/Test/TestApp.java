package cn.th.transactiontemplate.Test;

import cn.th.transactiontemplate.Service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service= (Service) applicationContext.getBean("service");
        service.transfer("rose","jack",1000);
    }
}
