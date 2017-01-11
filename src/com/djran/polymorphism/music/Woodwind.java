package com.djran.polymorphism.music;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义木管乐器类，继承自管乐器类
 */
public class Woodwind extends Wind{
    void play(Note note){
        print("Woodwind play() "+note);
    }
    String whatInstrument(){
        return "Woodwind";
    }
}
