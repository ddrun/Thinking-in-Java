package com.djran.polymorphism.frog;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义一个青蛙类，主程序创建一个Frog类对象，然后做相关清理；
 *（1）一般情况下，通过组合、继承来创建新类时，因为GC的存在，永远不必担心对象的处理问题；
 *（2）继承中，在某些特殊情况必须自行清理的时候，如果某子对象要依赖于其他对象，销毁的顺序必须和初始化顺序相反；
 *    当子类覆盖父类的清理方法时，必须调用父类的清理方法，否则基类的清理不会发生。
 */
public class Frog extends Amphibian {
    private Characteristic characteristic=new Characteristic("croaks");//呱呱地叫
    private Description description=new Description("Frog is beneficial animal!");
    Frog(){
        print("Frog()");
    }
    protected void dispose(){
        print("Frog dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
    public static void main(String[] args){
        Frog frog=new Frog();
        print("Over,then dispose");
        frog.dispose();
    }
}
/**
 *输出结果如下：
 Creating Characteristic is alive!
 Creating Description Basic living creature
 LivingCreature
 Creating Characteristic has heart!
 Creating Description Animal is not plant!
 Animal()
 Creating Characteristic can live in the water！
 Creating Description Both live in the water and on the land!
 Amphibian()
 Creating Characteristic croaks
 Creating Description Frog is beneficial animal!
 Frog()
 Over,then dispose
 Frog dispose
 Disposing Description Frog is beneficial animal!
 Disposing Characteristic croaks
 Amphibian dispose!
 Disposing Description Both live in the water and on the land!
 Disposing Characteristic can live in the water！
 Animal dispose!
 Disposing Description Animal is not plant!
 Disposing Characteristic has heart!
 LivingCreature dispose!
 Disposing Description Basic living creature
 Disposing Characteristic is alive!
 */
