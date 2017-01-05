package com.djran.initialization;

/**
 * Created by d.djran@gmail.com on 2017-01-05.
 * 本实例描述初始化的顺序：
 * （1）变量定义的先后顺序决定初始化的顺序；
 * （2）变量会在任何方法（包括构造器）调用之前初始化；
 *
 */
class Window{
    Window(int marker){
        System.out.println("window("+marker+")");
    }
}
class House{
    Window w1=new Window(1);
    //House类的构造器，其会在w1\w2\w3初始化之后被调用
    House(){
        System.out.println("House()");
        w3=new Window(4);
    }
    Window w2=new Window(2);
    void test(){
        System.out.println("test()");
    }
    Window w3=new Window(3);
}
public class OrderOfInitialization {
    public static void main(String[] args){
        House house=new House();
        house.test();
    }
}

/**
 * 输出结果如下：
 window(1)
 window(2)
 window(3)
 House()
 window(4)
 test()
 *
 */
