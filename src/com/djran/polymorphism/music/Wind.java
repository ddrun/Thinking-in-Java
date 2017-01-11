package com.djran.polymorphism.music;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义一个管乐器类，继承自乐器类，并重载基类的方法
 */
public class Wind extends Instrument {
    void play(Note note){
        print("Wind.play() "+note);
    }
    String whatInstrument(){
        return "Wind";
    }
    void adjust(){
        print("Adjusting Wind");
    }
}
