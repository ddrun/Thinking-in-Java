package com.djran.myCode;
/**
 * 饿汉单例模式
 * 在类被装载的时候就创建实例，每次调用时不需要判断，可以减少访问时间，但是增加了内存的消耗
 * @author djran 2016年10月18日 上午10:11:09
 *
 */
public class EagerSingleton {
	
	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
