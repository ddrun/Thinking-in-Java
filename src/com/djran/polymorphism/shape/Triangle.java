package com.djran.polymorphism.shape;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-10.
 */
public class Triangle extends Shape {
    public void draw(){
        print("Triangle.draw()");
    }
    public void erase(){
        print("Triangle.erase()");
    }
}
