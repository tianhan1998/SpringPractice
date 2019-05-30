package cn.th.AnnotationSpringTransaction.Test;

import cn.th.AnnotationSpringTransaction.Service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) applicationContext.getBean("service");
        service.transfer("rose","jack",1000);
    }
}
