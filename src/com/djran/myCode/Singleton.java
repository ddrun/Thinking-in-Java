package com.djran.myCode;
/**
 * ˫�ؼ���������ģʽ
 * ͨ�����μ���ͬ������������ʵ���̰߳�ȫ�Ĵ���ʵ������ֻ��Ҫ�ڵ�һ�δ���ʵ��ʱ����ͬ���������ӿ������ٶȡ�
 * volatile:��volatile���εı���ֵ�������ᱻ�����̻߳��棬���жԸñ����Ķ�д��������ֱ�Ӳ��������ڴ棬�Ӷ���֤���߳�����ȷ����ı�����
 * @author djran 2016��10��18�� ����10:25:23
 *
 */
public class Singleton {
	
	private volatile static Singleton instance=null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		//�ȼ���Ƿ�ʵ���Ƿ����,������ʱ�ڽ���ͬ�������ͬ������
		if(instance==null){
			//ͬ����Ĵ��ڿ���ʹ����ʵ��ʱ�̰߳�ȫ��
			synchronized (Singleton.class) {
				//ͬ��֮���ٴ��жϣ�������ʱ����ʵ��
				if (instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}
