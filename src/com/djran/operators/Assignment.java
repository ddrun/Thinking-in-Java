package com.djran.operators;

/**
 * Created by d.djran@gmail.com on 2016-12-29.
 * 本实例描述对象赋值：将一个对象赋值给另一个对象，实际是将对象的引用从某处复制到了另一处。
 * 对象赋值之后，两个对象指向同一个引用，即指向同一个对象。
 */
class Tank{
    int levle;
}
public class Assignment {
    public static void main(String []args){
        Tank tank1=new Tank();
        Tank tank2=new Tank();
        tank1.levle=1;
        tank2.levle=2;
        System.out.println("1:"+"tank1.levle="+tank1.levle+" tank2.levle="+tank2.levle);
        tank1=tank2;
        System.out.println("2:"+"tank1.levle="+tank1.levle+" tank2.levle="+tank2.levle);
        tank1.levle=3;
        System.out.println("3:"+"tank1.levle="+tank1.levle+" tank2.levle="+tank2.levle);
    }
}
/**
 *输出结果如下：
 * 1:tank1.levle=1 tank2.levle=2
 * 2:tank1.levle=2 tank2.levle=2
 * 3:tank1.levle=3 tank2.levle=3
 */