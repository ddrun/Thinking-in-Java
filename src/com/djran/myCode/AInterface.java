package com.djran.myCode;

/**
 * �ӿڲ���
 * �ӿڲ����Ա�ʵ���������ӿڿ�����Ϊ����������ʹ�á�
 * �κ�ʵ�ָýӿڵ����ʵ�������Դ洢�ڸýӿ����͵ı����У�ͨ���ñ������Ե��ø���ʵ�ֵĽӿ��еķ�����
 * ���Դ������£�	
 * public void test(AInterface a){
		a.doSth();		
	}
	public static void main(String args[]){
	
		MainTest test=new MainTest();
		AInterface aInterface=new BImplements();
		test.test(aInterface);
	}
 * @author djran 2016��10��20�� ����11:03:59
 *
 */
public interface AInterface {
	//�ӿ��еķ������ǳ��󷽷���Ĭ��Ϊabstract,��ʡ��
	public void doSth();
}
