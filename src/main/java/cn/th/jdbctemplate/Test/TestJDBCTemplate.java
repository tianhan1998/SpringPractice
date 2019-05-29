package cn.th.jdbctemplate.Test;

import cn.th.jdbctemplate.dao.UserDao;
import cn.th.jdbctemplate.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJDBCTemplate {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoId");
        User newuser= (User) applicationContext.getBean("userId");
//        userDao.update(user);
//        UserDao userDao=new UserDao();
        List<User> list = userDao.findAll();
        for (User user : list
        ) {
            System.out.println(user);
        }
        System.out.println(" ");
        System.out.println(userDao.find(2));
        System.out.println(" ");
        userDao.insert(newuser);
        list = userDao.findAll();
        for (User user : list
        ) {
            System.out.println(user);
        }
        System.out.println(" ");
        userDao.delete(5);
        list = userDao.findAll();
        for (User user : list
        ) {
            System.out.println(user);
        }
        System.out.println(" ");

    }
}
