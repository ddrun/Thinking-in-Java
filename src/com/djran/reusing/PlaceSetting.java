package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本例描述组合、继承两种混合的形式复用代码；代码展示了初始化的过程
 */
class Plate{//盘子类
    Plate(int i){
        print("Plate constructor");
    }
}
class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        print("DinnerPlate constructor");
    }
}
class Utensil{//器具类
    Utensil(int i){
        print("Utensil constructor");
    }
}
class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        print("Spoon constructor");
    }
}
class Fork extends Utensil{
    Fork(int i){
        super(i);
        print("Fork constructor");
    }
}
class Knife extends Utensil{
    Knife(int i){
        super(i);
        print("Knife constructor");
    }
}
class Custom{//习俗类
    Custom(int i){
        print("Custom constructor");
    }
}
public class PlaceSetting extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;
    public PlaceSetting(int i){
        super(i);
        spoon=new Spoon(i);
        fork=new Fork(i);
        knife=new Knife(i);
        dinnerPlate=new DinnerPlate(i);
        print("PlaceSetting constructor");
    }
    public static void main(String[] args){
        PlaceSetting placeSetting=new PlaceSetting(321);
    }
}
/**
 * 输出结果如下：
 Custom constructor
 Utensil constructor
 Spoon constructor
 Utensil constructor
 Fork constructor
 Utensil constructor
 Knife constructor
 Plate constructor
 DinnerPlate constructor
 PlaceSetting constructor
 */
