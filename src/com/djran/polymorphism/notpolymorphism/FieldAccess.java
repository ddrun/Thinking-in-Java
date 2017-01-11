package com.djran.polymorphism.notpolymorphism;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例描述多态机制中的缺陷（另一种见StaticMethodIsNotPolymorphism.java）：域
 *（1）任何域访问操作都由编译器解析，因此不是多态的；
 *（2）通常情况下，所有的域都将设置为private，不能直接对他们访问而只能调用方法来访问；
 *     且基类域和子类域不会赋相同的名字；
 *
 */
 class Super {
    public int field=0;
    public int getField(){
        return field;
    }
}
 class Sub extends Super {
    public int field=1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
public class FieldAccess{
    public static void main(String[] args){
        Super sup=new Sub();//upcast
        print("sup.field="+sup.field+" sup.getField()="+sup.getField());

        Sub sub=new Sub();
        print("sub.field="+sub.field+" sub.getField()="+sub.getField()+
                " sub.getSuperField()="+sub.getSuperField());
    }
}
/**
 * 输出结果如下：
 sup.field=0 sup.getField()=1
 sub.field=1 sub.getField()=1 sub.getSuperField()=0
 */
