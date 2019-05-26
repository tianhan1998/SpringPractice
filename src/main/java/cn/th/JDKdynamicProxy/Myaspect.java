package cn.th.JDKdynamicProxy;

public class Myaspect {
    public void before(){
        System.out.println("前");
    }
    public void after(){
        System.out.println("后");
    }
}
