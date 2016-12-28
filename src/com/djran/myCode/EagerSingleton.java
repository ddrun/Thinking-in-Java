package com.djran.myCode;
/**
 * ��������ģʽ
 * ���౻װ�ص�ʱ��ʹ���ʵ����ÿ�ε���ʱ����Ҫ�жϣ����Լ��ٷ���ʱ�䣬�����������ڴ������
 * @author djran 2016��10��18�� ����10:11:09
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
