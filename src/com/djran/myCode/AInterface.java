package com.djran.myCode;

/**
 * 接口测试
 * 接口不可以被实例化，但接口可以作为引用类型来使用。
 * 任何实现该接口的类的实例都可以存储在该接口类型的变量中，通过该变量可以调用该类实现的接口中的方法。
 * 测试代码如下：	
 * public void test(AInterface a){
		a.doSth();		
	}
	public static void main(String args[]){
	
		MainTest test=new MainTest();
		AInterface aInterface=new BImplements();
		test.test(aInterface);
	}
 * @author djran 2016年10月20日 上午11:03:59
 *
 */
public interface AInterface {
	//接口中的方法都是抽象方法，默认为abstract,可省略
	public void doSth();
}
