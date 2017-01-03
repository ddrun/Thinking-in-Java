package com.djran.control;

/**
 * Created by d.djran@gmail.com on 2017-01-03.
 * 本实例描述带标签的for及continue、break关键词；
 * continue：使程序执行点转移到当前循环（本例中为inner）的起始处；
 * break:跳出当前循环（本例中为inner）
 */
public class LabeledFor {
    public static void main(String[] args){
        int i=0;//此处定义i，扩大i的作用域
        outer:
        for (;true;){
            inner:
            for (;i<10;i++){
                System.out.println("i="+i);
                if (i==2){
                    System.out.println("continue:回到inner执行开始位置");
                    continue ;
                }
                if (i==3){
                    System.out.println("break:跳出inner");
                    i++;//因break直接跳出inner，不会执行inner循环中的i++,必须在此处自增i
                        //否则i将不会增加（i===3），程序进入死循环；
                    break ;
                }
                if (i==6){
                    System.out.println("continue outer:回到outer执行开始位置");
                    i++;//同上
                    continue outer;
                }
                if (i==8){
                    System.out.println("break outer:跳出outer,本程序结束");
                    break outer;
                }

                for (int k=0;k<5;k++){//inner循环具体逻辑
                    System.out.println("We are in inner");
                    continue inner;
                }
            }
        }
    }
}
/**
 * 输出结果如下：
 * i=0
 * We are in inner
 * i=1
 * We are in inner
 * i=2
 * continue:回到inner执行开始位置
 * i=3
 * break:跳出inner
 * i=4
 * We are in inner
 * i=5
 * We are in inner
 * i=6
 * continue outer:回到outer执行开始位置
 * i=7
 * We are in inner
 * i=8
 * break outer:跳出outer,本程序结束
 *
 */