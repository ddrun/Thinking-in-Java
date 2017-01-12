package com.djran.polymorphism.frog;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义特征、性质类
 */
public class Characteristic {
    private String s;
    Characteristic(String s){
        this.s=s;
        print("Creating Characteristic "+s);
    }
    protected void dispose(){
        print("Disposing Characteristic "+s);
    }
}
