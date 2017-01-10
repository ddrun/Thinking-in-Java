package com.djran.polymorphism.shape;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-10.
 */
public class Circle extends Shape {
    public void draw(){
        print("Circle.draw()");
    }
    public void erase(){
        print("Circle.erase()");
    }
}
