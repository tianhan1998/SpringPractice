package cn.th.SpringHalfDynamicProxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("之前");
        Object obj = methodInvocation.proceed();
        System.out.println("之后");
        return obj;
    }
}
