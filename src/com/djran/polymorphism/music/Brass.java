package com.djran.polymorphism.music;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例定义铜管乐器类，继承自管乐器类
 */
public class Brass extends Wind {
    void play(Note note){
        print("Brass play() "+note);
    }
    void adjust(){
        print("Adjusting Brass");
    }
}
