package com.djran.myCode;
/**
 * 静态方法与非静态方法，静态成员与非静态成员
 * @author djran 2016年7月8日 下午7:54:17
 *
 */
public class StaticTest {
	private  static String str1="staticParameter";
	private String str2="nonStaticParameter";
	
	public StaticTest(){
		
	}
	//静态方法不能访问非静态成员变量，也不能访问非静态方法
	public static void print1(){
		System.out.println(str1);
		//Cannot make a static reference to the non-static field str2
//		System.out.println(str2);
		//Cannot make a static reference to the non-static method print2() from the type StaticTest
//		print2();
	}
	//非静态方法可以访问非静态也可以访问静态的
	public void print2() {
		System.out.println(str1);
		System.out.println(str2);
		print1();
	}
}
