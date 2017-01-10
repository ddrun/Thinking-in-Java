package com.djran.polymorphism.shape;

/**
 * Created by d.djran@gmail.com on 2017-01-10.
 * 本例描述Java中的多态
 */
public class Shapes {
    private static RandomShapeGenerator generator=new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] shapes=new Shape[9];
        for (int i=0;i<9;i++){
            shapes[i]=generator.nextShape();//产生9个Shape对象的引用
        }
        for (Shape s:shapes) {
            s.draw();//Java内部根据动态绑定特性自动确定调用方法的主体
        }
    }
}
