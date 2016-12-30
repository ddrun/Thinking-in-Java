package com.djran.operators;

/**
 * Created by d.djran@gmail.com on 2016-12-30.
 * 本实例描述三元操作符 if-else:两种代码逻辑完全一样，只是不同的形式；
 * ternaryIfElse形式使代码简洁紧凑，standardIfElse形式使代码更易阅读和理解；
 * 本实例方法调用可以和TossCoin类中的方法调用对比学习。
 */
public class TernaryIfElse {
    static int ternaryIfElse(int i){
        return i<10 ? i*100 : i*10;
    }
    static int standardIfElse(int i){
        if (i<10){
            return i*100;
        }else {
            return i*10;
        }
    }
    public static void main(String[] args){
        System.out.println(ternaryIfElse(9));
        System.out.println(ternaryIfElse(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
/**
 * 输出结果如下：
 * 900
 * 100
 * 900
 * 100
 */