package com.djran.polymorphism.music;

/**
 * Created by d.djran@gmail.com on 2017-01-11.
 * 本例描述Java中的多态机制
 * （1）所有的类方法访问权限为protected；
 * （2）通过向上转型将子类转换为父类类型；
 * （3）运行时，Java多态机制自动识别调用的方法主体；
 */
public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] instruments){
        for (Instrument instrument:instruments) {
            tune(instrument);
        }
    }
    public static void main(String[] args){
        Instrument[] band={
            new Wind(),new Percussion(),new Stringed(),new Woodwind(),new Brass()
        };
        tuneAll(band);
    }
}
