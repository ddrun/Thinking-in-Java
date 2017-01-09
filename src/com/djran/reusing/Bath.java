package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本实例描述对象引用的初始化方式：
 * （1）在定义对象的位置初始化；
 * （2）在类的构造器中；
 * （3）惰性初始化；
 * （4）实例初始化；
 */
class Soap{
    private String s;
    Soap(){
        print("new Soap()");
        s="Soap Constructed";//（2）在类的构造器中
    }
    public String toString(){
        return s;
    }
}
public class Bath {
    private String s1="Water",s2="Time",//（1）在定义对象的位置初始化
            s3,s4;
    private Soap soap;
    private int i;
    private float f;
    //构造方法可以有任何访问权限的修饰符，但不可有任何非访问权限的修饰符(final\static)
    public Bath(){
        print("Inside Bath()");
        s3="Temperature";//（2）在类的构造器中
        f=3.14f;
        soap=new Soap();
    }
    {
        i=314;//（4）实例初始化
    }
    public String toString(){
        if (s4==null){
            s4="People";//（3）
        }
        return "s1="+s1+"\n"+
                "s2="+s2+"\n"+
                "s3="+s3+"\n"+
                "s4="+s4+"\n"+
                "i="+i+"\n"+
                "f="+f+"\n"+
                "soap="+soap;
    }
    public static void main(String[] args){
        Bath bath=new Bath();
        print(bath);
    }
}
/**
 * 输出结果如下：
 Inside Bath()
 new Soap()
 s1=Water
 s2=Time
 s3=Temperature
 s4=People
 i=314
 f=3.14
 soap=Soap Constructed
 */
