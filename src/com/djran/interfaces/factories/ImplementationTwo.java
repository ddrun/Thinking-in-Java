package com.djran.interfaces.factories;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-02-10.
 */
public class ImplementationTwo implements Service {
    ImplementationTwo(){
        print("The ImplementationTwo Constructor");
    };

    @Override
    public void method1() {
        print("The ImplementationTwo method1");
    }

    @Override
    public void method2() {
        print("The ImplementationTwo method1");
    }
}
