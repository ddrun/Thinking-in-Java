package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本例描述继承、构造器、参数；
 * （1）Java只会在子类中自动加入默认的父类构造器（即无参构造器），
 *      如果父类无默认构造器时，必须用super进行显式调用；
 * （2）父类有多个构造器时，无super显式调用时，调用默认无参构造器
 */
class Game{
    Game(){
        print("Game constructor:no arg");
    }
    Game(int i){
        print("Game constructor:one int arg");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        //super(321);
        print("BoardGame constructor:one int arg");
    }
}
public class Chess extends BoardGame{
    Chess(){
        super(314);
        print("Chess constructor:no arg");
    }
    public static void main(String[] args){
        Chess chess=new Chess();
    }

}

/**
 * 输出结果如下：
 Game constructor:no arg
 BoardGame constructor:one int arg
 Chess constructor:no arg
 */