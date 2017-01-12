package com.djran.polymorphism.frog;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义动物类
 */
public class Animal extends LivingCreature{
    private Characteristic characteristic=new Characteristic("has heart!");
    private Description description=new Description("Animal is not plant!");
    Animal(){
        print("Animal()");
    }
    protected void dispose(){
        print("Animal dispose!");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
