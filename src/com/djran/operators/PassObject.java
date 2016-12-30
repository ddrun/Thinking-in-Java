package com.djran.operators;

/**
 * Created by d.djran@gmail.com on 2016-12-30.
 * 本实例描述对象在方法中的传值：将一个对象作为参数传递给某个方法，实际上传递的只是该方法的引用
 * 在方法内的对象仍然执行所传递的对象，方法作用域内对对象的修改仍然会影响原对象的值
 */
class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c='n';
    }
    public static void main(String[] args){
        Letter x=new Letter();
        x.c='m';
        System.out.println("1: x.c="+x.c);
        f(x);
        System.out.println("2: x.c="+x.c);
    }
}
/**
 * 输出结果如下：
 * 1: x.c=m
 * 2: x.c=n
 */