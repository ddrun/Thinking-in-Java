package com.djran.polymorphism.music;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义弦乐器类，继承自乐器类，并重载基类方法
 */
public class Stringed extends Instrument{
    void play(Note note){
        print("Stringed.play() "+note);
    }
    String whatInstrument(){
        return "Stringed";
    }
    void adjust(){
        print("Adjusting Stringed");
    }
}
