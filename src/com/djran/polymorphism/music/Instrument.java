package com.djran.polymorphism.music;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义乐器的基类
 */
public class Instrument {
    void play(Note note){
        print("Instrument.play() "+note);
    }
    String whatInstrument(){
        return "Instrument";
    }
    void adjust(){
        print("Adjusting Instrument");
    }
}
