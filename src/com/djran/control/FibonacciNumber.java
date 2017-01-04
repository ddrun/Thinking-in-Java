package com.djran.control;

/**
 * Created by d.djran@gmail.com on 2017-01-04.
 * 本实例描述Fibonacci数列，输出对应个数的Fibonacci数列。
 */
public class FibonacciNumber {
    public static long  getFibonacciNumber(int n){
        if (n<=1){
            return n;
        }else{
            return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
        }
    }
    public static void main(String[] args){
        int n=10;
        for (int i=1;i<=n;i++){
            System.out.println("第"+i+"个数:"+getFibonacciNumber(i));
        }
    }
}
/**
 * 输出结果如下：
 *
 * 第1个数:1
 * 第2个数:1
 * 第3个数:2
 * 第4个数:3
 * 第5个数:5
 * 第6个数:8
 * 第7个数:13
 * 第8个数:21
 * 第9个数:34
 * 第10个数:55
 *
 */