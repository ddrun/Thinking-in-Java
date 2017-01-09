package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本例描述将成员变量声明为public的特例，用于理解组合；
 * 一般情况下应该设定域访问权限为private。
 */
class Engine{
    public void start(){
        print("The car is starting");
    }
    public void reverse(){
        print("The car is reversing");
    }
    public void stop(){
        print("The car is stopping");
    }
}
class Wheel{
    public void inflate(int speed){
        print("The car's speed is "+speed+" km/h");
    }
}
class Window{
    public void rollup(){
        print("The window is rolling up");
    }
    public void rolldown(){
        print("The window is rolling down");
    }
}
class Door{
    public Window window=new Window();
    public void open(String door){
        print("The "+door+" door is opening");
    }
    public void close(String door){
        print("The "+door+" door is closing");
    }
}
public class Car {
    public Engine engine=new Engine();
    public Wheel[] wheel=new Wheel[4];
    public Door leftDoor=new Door(),rightDoor=new Door();
    public Car(){
        for (int i=0;i<4;i++){
            wheel[i]=new Wheel();
        }
    }
    public static void main(String[] args){
        Car car=new Car();
        car.engine.start();
        car.wheel[0].inflate(0);
        car.rightDoor.close("right");
        car.rightDoor.window.rollup();
        car.leftDoor.window.rollup();
        car.wheel[0].inflate(314);
        car.engine.stop();
        car.wheel[0].inflate(0);
    }
}
/**
 * 输出结果如下：
 The car is starting
 The car's speed is 0 km/h
 The right door is closing
 The window is rolling up
 The window is rolling up
 The car's speed is 314 km/h
 The car is stopping
 The car's speed is 0 km/h
 */
