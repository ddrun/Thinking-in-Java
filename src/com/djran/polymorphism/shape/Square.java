package com.djran.polymorphism.shape;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-10.
 */
public class Square extends Shape {
    public void draw(){
        print("Square.draw()");
    }
    public void erase(){
        print("Square.erase()");
    }
}
