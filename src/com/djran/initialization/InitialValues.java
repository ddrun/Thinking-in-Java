package com.djran.initialization;

/**
 * Created by d.djran@gmail.com on 2017-01-05.
 * 本实例描述变量的初始化及初始值：
 * （1）Java编译器要求必须对局部变量进行初始化；
 * （2）对于类成员变量，未初始化时编译器会赋一个默认值值
 */
public class InitialValues {
    boolean t;
    int i;
    char c;
    short s;
    byte b;
    long l;
    float f;
    double d;
    String string;
    InitialValues reference;
    void printInitialValues(){
        //int a;
        //a++;错误，不能使用未进行初始化的局部变量
        System.out.println("Date type    initial value");
        System.out.println("boolean       "+t);
        System.out.println("int           "+i);
        System.out.println("char          ["+c+"]");
        System.out.println("short         "+s);
        System.out.println("byte          "+b);
        System.out.println("long          "+l);
        System.out.println("float         "+f);
        System.out.println("double        "+d);
        System.out.println("string        "+string);
        System.out.println("reference     "+reference);
    }
    public static void main(String[] args){
        InitialValues initialValues=new InitialValues();//利用构造函数初始化对象
        initialValues.printInitialValues();
    }
}

/**
 * 输出结果如下：
 Date type    initial value
 boolean       false
 int           0
 char          [ ]
 short         0
 byte          0
 long          0
 float         0.0
 double        0.0
 string        null
 reference     null
 *
 */
