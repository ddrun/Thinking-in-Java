package com.djran.operators;

import java.util.Random;

/**
 * Created by d.djran@gmail.com on 2016-12-30.
 * 本实例描述投掷硬币的正反面情况：使用一个【0-100）的随机数，偶数为正面，奇数为反面
 */
public class TossCoin {
    private int getRandom(){
        Random random=new Random();
        int randomValue=random.nextInt(100);
        return randomValue;
    }
    private Boolean isEvenNumber(int i){
        if ((i%2)!=0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args){
        TossCoin tossCoin=new TossCoin();
        int i=tossCoin.getRandom();
        System.out.println("i="+i);
        if(tossCoin.isEvenNumber(i)){
            System.out.println("硬币为正面！");
        }else{
            System.out.println("硬币为反面！");
        }
    }
}
