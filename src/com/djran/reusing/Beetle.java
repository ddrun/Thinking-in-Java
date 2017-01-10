package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-10.
 * 本例描述包括继承的初始化全过程；
 * （1）加载父类（执行静态域）；
 * （2）加载子类（执行静态域）；
 * （3）创建对象（依照代码顺序初始化基本数据类型和对象引用）；
 * 虽然构造器也是static域方法，但其在对象创建时被调用
 */
class Insect{//昆虫类
    private int i=33;//不可继承
    protected int j;//可继承
    Insect(){
        print("i="+i+" j="+j);
        j=44;
    }
    private static int m=printInit("static Insect.m initialized",55);
    static int printInit(String s,int i){
        print(s);
        return i;
    }
}
public class Beetle extends Insect{
    private int k=printInit("Beetle.k initialized",66);
    Beetle(){
        print("k="+k);
        print("j="+j);
    }
    private static int n=printInit("static Insect.n initialized",77);
    public static void main(String[] args){
        print("Beetle constructor");
        Beetle beetle=new Beetle();
    }
}
/**
 * 输出结果如下：
 static Insect.m initialized
 static Insect.n initialized
 Beetle constructor
 i=33 j=0
 Beetle.k initialized
 k=66
 j=44
 */
