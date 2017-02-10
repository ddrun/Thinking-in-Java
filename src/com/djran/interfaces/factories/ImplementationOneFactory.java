package com.djran.interfaces.factories;

/**
 * Created by d.djran@gmail.com on 2017-02-10.
 */
public class ImplementationOneFactory implements ServiceFactory {
    @Override
    public Service getService() {
        return new ImplementationOne();
    }
}
