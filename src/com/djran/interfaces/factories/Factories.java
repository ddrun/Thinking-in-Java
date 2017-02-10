package com.djran.interfaces.factories;

/**
 * Created by d.djran@gmail.com on 2017-02-10.
 * 本示例描述接口中工厂方法设计模式：利用工厂方法创建接口的某个实现的对象
 */
public class Factories {
    public static  void serviceConsumer(ServiceFactory serviceFactory){
        Service service=serviceFactory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args){
        serviceConsumer(new ImplementationOneFactory());
        serviceConsumer(new ImplementationTwoFactory());
    }
}
/**
 * 输出结果如下：
 The ImplementationOnw Constructor
 The ImplementationOne method1
 The ImplementationOne method2
 The ImplementationTwo Constructor
 The ImplementationTwo method1
 The ImplementationTwo method1
 */
