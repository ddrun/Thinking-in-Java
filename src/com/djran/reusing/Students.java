package com.djran.reusing;

import static com.djran.commonUtils.Print.print;

/**
 * Created by d.djran@gmail.com on 2017-01-09.
 * 本例描述继承中的protected关键字；
 * （1）成员变量设置为private；
 * （2）通过protected方法来控制类的继承者的访问权限。
 *
 */
class People{
    private String name;
    protected void setName(String name){
        this.name=name;
    }
    public People(String name){
        this.name=name;
    }
    public String toString(){
        return "I am a student and my name is "+name;
    }
}
public class Students extends People{
    private int studentID;
    public Students(String name,int studentID){
        super(name);//子类构造函数中显式调用父类的构造函数
        this.studentID=studentID;
    }
    public void change(String name,int studentID){
        setName(name);
//        super(name);//此处不能使用构造函数赋值，其必须在子类构造函数的第一行使用；
        this.studentID=studentID;
    }
    public String toString(){//基于父类定义
        return "studentID "+studentID+": "+super.toString();
    }
    public static void main(String[] args){
        Students students=new Students("djran",8);
        print(students);
        students.change("d.djran",9);
        print(students);
    }
}
/**
 * 输出结果如下：
 studentID 8: I am a student and my name is djran
 studentID 9: I am a student and my name is d.djran
 */
