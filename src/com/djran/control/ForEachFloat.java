package com.djran.control;

import java.util.Random;

/**
 * Created by d.djran@gmail.com on 2017-01-03.
 * 本实例描述foreach语法：不必创建int变量进行序列计数，foreach会自动遍历产生每一项
 */
public class ForEachFloat {
    public static void main(String[] args){
        Random random=new Random(50);
        float f[]=new float[6];
        for (int i=0;i<6;i++){
            f[i]=random.nextFloat();
        }

        for (float x:f) {
           System.out.println(x);
        }
    }
}
/**
 * 输出结果如下：
 * 0.7297136
 * 0.597892
 * 0.6141579
 * 0.82166934
 * 0.6215813
 * 0.48963797
 */