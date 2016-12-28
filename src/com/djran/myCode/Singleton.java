package com.djran.myCode;
/**
 * 双重检查加锁单例模式
 * 通过两次检查和同步加锁，可以实现线程安全的创建实例，且只需要在第一次创建实例时进行同步操作，加快运行速度。
 * volatile:被volatile修饰的变量值，将不会被本地线程缓存，所有对该变量的读写操作都是直接操作共享内存，从而保证多线程能正确处理改变量。
 * @author djran 2016年10月18日 上午10:25:23
 *
 */
public class Singleton {
	
	private volatile static Singleton instance=null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		//先检查是否实例是否存在,不存在时在进行同步块进行同步操作
		if(instance==null){
			//同步块的存在可以使创建实例时线程安全的
			synchronized (Singleton.class) {
				//同步之后再次判断，不存在时创建实例
				if (instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}
