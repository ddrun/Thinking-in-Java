package com.djran.myCode;
/**
 * ��������ģʽ
 * �������ഴ����ʱ��ʹ���ʵ�����󣬶��ǱȽ����������Ŵ���������Ҫʹ�õ�ʱ��Żᴴ����
 * ������ʹ��ͬ�������̰߳�ȫ���⡣
 * ÿ�λ�ȡʵ��ʱ�������ͬ���жϣ���˻ή�ͷ����ٶȣ���ʵ��δ��ʹ��ʱ���Լ��ٿռ��˷ѡ�
 * @author djran 2016��10��18�� ����10:01:36
 *
 */
public class LazySingleton {
	private static LazySingleton instance=null;
	//���� ����
	private LazySingleton(){
		
	}
	public static synchronized LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
}
