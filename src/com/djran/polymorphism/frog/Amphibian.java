package com.djran.polymorphism.frog;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义两栖动物类，继承自动物类，
 */
public class Amphibian extends Animal {
    private Characteristic characteristic=new Characteristic("can live in the water！");
    private Description description=new Description("Both live in the water and on the land!");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("Amphibian dispose!");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

}
