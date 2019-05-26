package cn.th.JDKdynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactory {
    public static UserService createUserservice (){
        final UserService userService = new UserServiceImpl();
        final Myaspect myaspect = new Myaspect();
        //JDK动态代理
        UserService proxyuserservice = (UserService) Proxy.newProxyInstance(MyFactory.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myaspect.before();
                Object obj=method.invoke(userService,args);
                myaspect.after();
                return obj;
            }
        });
        return proxyuserservice;
    }
}
