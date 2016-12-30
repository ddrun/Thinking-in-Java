package com.djran.operators;

/**
 * Created by d.djran@gmail.com on 2016-12-30.
 * 本实例描述对象中的equals()：每个对象都从父类Object中继承了equals()，
 * Object中的equals()的默认行为是引用的比较，只有在重写的情况下才能实现对内容的比较
 * 如String\Integer等都对equals()进行了复写，本例中的Value类未重写equals()方法。
 */
class Value{
    int i;
}
public class EqualsMethod {
    public static void main(String[] args){
        Integer integer1=new Integer(20);
        Integer integer2=new Integer(20);
        System.out.println(integer1.equals(integer2));

        Value value1=new Value();
        Value value2=new Value();
        value1.i=value2.i=20;
        System.out.println(value1.equals(value2));
    }
}
/**
 * 输出结果如下：
 * true
 * false
 */