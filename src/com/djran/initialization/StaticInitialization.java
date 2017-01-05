package com.djran.initialization;

/**
 * Created by d.djran@gmail.com on 2017-01-05.
 * 本实例描述static变量的初始化情况：
 * （1）static关键词修饰的变量为静态变量；
 * （2）static不能应用于局部变量，只能作用于域；
 * （3）静态变量初始化级别高于非静态变量
 * （4）静态初始化只有在必要时刻才进行，只在第一次访问静态数据时初始化，且只初始化一次；
 *
 */
class Bowl{
    Bowl(int marker){
        System.out.println("Bowl("+marker+")");
    }
    void test1(int marker){
        System.out.println("test("+marker+")");
    }
}
class Table{
    static Bowl bowl1=new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.test1(1);
    }
    void test2(int marker){
        System.out.println("test2("+marker+")");
    }
    static Bowl bowl2=new Bowl(2);
}
class Cupboard{
    Bowl bowl3=new Bowl(3);
    static Bowl bowl4=new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.test1(2);
    }
    void test3(int marker){
        System.out.println("test3("+marker+")");
    }
    static Bowl bowl5=new Bowl(5);
}
public class StaticInitialization {
    public static void main(String[] args){
        System.out.println("create new Cupboard object:");
        new Cupboard();
        System.out.println("create new Cupboard object:");
        new Cupboard();
        table.test2(1);
        cupboard.test3(1);
    }
    static Table table=new Table();
    static Cupboard cupboard=new Cupboard();
}
/**
 * 输出结果如下：
 Bowl(1)
 Bowl(2)
 Table()
 test(1)
 Bowl(4)
 Bowl(5)
 Bowl(3)
 Cupboard()
 test(2)
 create new Cupboard object:
 Bowl(3)
 Cupboard()
 test(2)
 create new Cupboard object:
 Bowl(3)
 Cupboard()
 test(2)
 test2(1)
 test3(1)
 */
