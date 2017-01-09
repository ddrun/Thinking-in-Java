package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本实例描述继承中父类子类对象的初始化；
 * （1）在创建一个子类对象时，该子对象会自动包含一个父类的对象，此父类对象被包含在子类对象内部；
 * （2）子类初始化时调用对应构造函数，Java会自动将子类构造器中加入对父类的构造器的调用；
 * （3）父类构造器在子类构造器之前调用；
 */
class Art{
    Art(){
        print("Art Constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        print("Drawing Constructor");
    }
}
public class Cartoon extends Drawing{
    public Cartoon(){
        print("Cartoon Constructor");
    }
    public static void main(String[] args){
        Cartoon cartoon=new Cartoon();
    }
}
/**
 * 输出结果如下：
 Art Constructor
 Drawing Constructor
 Cartoon Constructor
 */