package com.djran.initialization;

/**
 * Created by d.djran@gmail.com on 2017-01-04.
 * 本实例描述构造器中的this
 */
public class Flower {
    //定义两个成员变量:花瓣数量和种类
    int petalCount=0;
    String type="This is a flower!";
    //定义四个具有不同参数列表的构造函数，以对对象进行初始化
    Flower(int petals){
        petalCount=petals;
        System.out.println("Constructor: int arg only,petalCount="+petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor: String arg only,type="+ss);
        type=ss;
    }
    Flower(String type,int petals){
        this(petals);//调用 Flower(int petals)
        this.type=type;//成员变量和参数列表名称相同时，可用this调用成员变量，以避免歧义
        System.out.println("Constructor: String & int args");
    }
    Flower(){
        this("New flower",8);//调用 Flower(String type,int petals)
        System.out.println("default constructor: no args");
    }
    void printPetalCount(){
        System.out.println("petalCount="+petalCount+" type="+type);
    }
    public static void main(String[] args){
        Flower flower=new Flower();
        flower.printPetalCount();
    }
}
/**
 * 输出结果如下：
 * Constructor: int arg only,petalCount=8
 * Constructor: String & int args
 * default constructor: no args
 * petalCount=8 type=New flower
 */