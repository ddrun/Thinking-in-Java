package com.djran.myCode;
/**
 * ��̬������Ǿ�̬��������̬��Ա��Ǿ�̬��Ա
 * @author djran 2016��7��8�� ����7:54:17
 *
 */
public class StaticTest {
	private  static String str1="staticParameter";
	private String str2="nonStaticParameter";
	
	public StaticTest(){
		
	}
	//��̬�������ܷ��ʷǾ�̬��Ա������Ҳ���ܷ��ʷǾ�̬����
	public static void print1(){
		System.out.println(str1);
		//Cannot make a static reference to the non-static field str2
//		System.out.println(str2);
		//Cannot make a static reference to the non-static method print2() from the type StaticTest
//		print2();
	}
	//�Ǿ�̬�������Է��ʷǾ�̬Ҳ���Է��ʾ�̬��
	public void print2() {
		System.out.println(str1);
		System.out.println(str2);
		print1();
	}
}
