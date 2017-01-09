package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本实例描述复用代码类中的组合方法：在新的类中产生现有类的对象
 */
class WaterSource{
    private String s;
    WaterSource(){
        print("WaterSource()");
        s="Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem {
    private String value1,value2;
    private int i;
    private float f;
    private WaterSource waterSource=new WaterSource();
    public String toString(){
        return "value1="+value1+" value2="+value2+" i="+i+" f="+f
                +" waterSource="+waterSource;
    }
    public static void main(String[] args){
        SprinklerSystem sprinklers=new SprinklerSystem();
        print(sprinklers);
    }
}
/**
 * 输出结果如下：
 WaterSource()
 value1=null value2=null i=0 f=0.0 waterSource=Constructed
 */
