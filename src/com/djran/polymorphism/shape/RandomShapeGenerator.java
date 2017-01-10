package com.djran.polymorphism.shape;

import java.util.Random;

/**
 * Created by d.djran@gmail.com on 2017-01-10.
 * 本例描述一个能随机产生对象的factory，产生的对象都是Shape类型
 */
public class RandomShapeGenerator {
    private Random random=new Random();
    public Shape nextShape(){
        switch (random.nextInt(3)){
            default:
            case 1: return new Circle();
            case 2: return new Square();
            case 3: return new Triangle();
        }
    }
}
