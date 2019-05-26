package cn.th.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyFactory {
    public static UserService createUserService(){
        final UserService userService=new UserService();
        final Myaspect myaspect = new Myaspect();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MethodInterceptor() {//MethodInterceptor(环绕通知/增强)
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                myaspect.before();
                Object obj=method.invoke(userService,args);
                methodProxy.invokeSuper(proxy,args);
                myaspect.after();
                return obj;
            }
        });
        UserService proxyuserservice = (UserService)enhancer.create();
        return proxyuserservice;
    }
}
