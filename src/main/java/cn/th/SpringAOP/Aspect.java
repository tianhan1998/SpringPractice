package cn.th.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
class Aspect{
    @Pointcut("execution(* cn.th.SpringAOP.*.*(..))")
    private void myCutPoint(){
    }
    @Around("myCutPoint()")
    public Object myAround(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("前");
        Object obj=joinPoint.proceed();
        System.out.println("后");
        return obj;
    }
}

