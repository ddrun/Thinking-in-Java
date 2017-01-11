package com.djran.polymorphism.notpolymorphism;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例描述多态机制中的缺陷（另一种见FieldAccess.java）：静态方法
 *（1）静态方法是与类，而非与单个对象相关联，所以静态方法不具体多态性；
 *（2）静态方法一般情况下按照[类名.方法名]的形式进行访问。
 */
class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Inherited staticGet()";
    }
    public String dynamicGet(){
        return "Inherited dynamicGet()";
    }
}
public class StaticMethodIsNotPolymorphism {
    public static void main(String[] args){
        StaticSuper staticSuper=new StaticSub();
        print(staticSuper.dynamicGet());
        print(staticSuper.staticGet());
    }
}
/**
 * 输出结果如下：
 Inherited dynamicGet()
 Base staticGet()
 */