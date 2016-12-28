package com.djran.myCode;
/**
 * 懒汉单例模式
 * 不是在类创建的时候就创建实例对象，而是比较懒，不急着创建，在需要使用的时候才会创建。
 * 方法中使用同步处理线程安全问题。
 * 每次获取实例时都会进行同步判断，如此会降低访问速度，但实例未被使用时可以减少空间浪费。
 * @author djran 2016年10月18日 上午10:01:36
 *
 */
public class LazySingleton {
	private static LazySingleton instance=null;
	//构造 函数
	private LazySingleton(){
		
	}
	public static synchronized LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
}
