package com.djran.polymorphism.frog;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义描述类
 */
public class Description {
    private String s;
    Description(String s){
        this.s=s;
        print("Creating Description "+s);
    }
    protected void dispose(){
        print("Disposing Description "+s);
    }
}
