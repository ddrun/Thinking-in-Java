package com.djran.interfaces.factories;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-02-10.
 */
public class ImplementationOne implements Service {
    ImplementationOne(){
        print("The ImplementationOnw Constructor");
    };

    @Override
    public void method1() {
        print("The ImplementationOne method1");
    }

    @Override
    public void method2() {
        print("The ImplementationOne method2");
    }
}
