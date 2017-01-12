package com.djran.polymorphism.frog;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义生物类；
 */
public class LivingCreature {
    private Characteristic characteristic=new Characteristic("is alive!");
    private Description description=new Description("Basic living creature");
    LivingCreature(){
        print("LivingCreature");
    }
    protected void dispose(){
        print("LivingCreature dispose!");
        description.dispose();
        characteristic.dispose();
    }
}
