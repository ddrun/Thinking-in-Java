package com.djran.polymorphism.music;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义打击乐器类，继承自乐器类，重载基类方法
 */
public class Percussion extends Instrument{
    void play(Note note){
        print("Percussion.play() "+note);
    }
    String whatInstrument(){
        return "Percussion";
    }
    void adjust(){
        print("Adjusting Percussion");
    }
}
