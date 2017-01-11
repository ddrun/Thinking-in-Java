package com.djran.polymorphism;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例描述组合、多态、继承中在构造顺序上的作用，复杂对象调用构造器的顺序如下：
 * （1）调用基类构造器；
 * （2）按声明顺序调用成员的初始化方法；
 * （3）调用子类构造器的初始化主体；
 */
class Meal{
    Meal(){
        print("Meal constructed");
    }
}
class Bread{
    Bread(){
        print("Bread constructed");
    }
}
class Cheese{
    Cheese(){
        print("Cheese constructed");
    }
}
class Fruit{
    Fruit(){
        print("Fruit constructed");
    }
}
class Lunch extends Meal{
    Lunch(){
        print("Lunch constructed");
    }
}
class Snack extends Lunch{
    Snack(){
        print("Snack constructed");
    }
}
public class Sandwich extends Snack{
    Sandwich(){
        print("Sandwich constructed");
    }
    private Bread bread=new Bread();
    private Cheese cheese=new Cheese();
    private Fruit fruit=new Fruit();
    public static void main(String[] args){
        new Sandwich();
    }
}
/**
 * 输出结果如下：
 Meal constructed
 Lunch constructed
 Snack constructed
 Bread constructed
 Cheese constructed
 Fruit constructed
 Sandwich constructed
 */