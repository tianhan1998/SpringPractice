package cn.th.AnnotationSpringTransaction.Test;

import cn.th.AnnotationSpringTransaction.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


public class TestApp {
    @Autowired
    private Service service;
    public void demo(){
        service.transfer("rose","jack",1000);
    }
}
