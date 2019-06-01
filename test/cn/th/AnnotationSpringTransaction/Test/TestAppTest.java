package cn.th.AnnotationSpringTransaction.Test;

import cn.th.AnnotationSpringTransaction.Service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAppTest {

    @Autowired
    private Service service;
    @Test
    public void demo() {
        service.transfer("jack","rose",1000);
    }
}