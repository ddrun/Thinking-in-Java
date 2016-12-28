package com.djran.myImplements;

import com.djran.myInterface.MyString;

public class StringLearned implements MyString{
	private static int time=50000;//field time in order to test the  efficiency due to the loop 
	@Override
	public void testString() { 

		String s="";
		long begin=System.currentTimeMillis();
		for(int i=0;i<time;i++){
			s+="java";
		}
		long end=System.currentTimeMillis();
		System.out.println(s.getClass().getName()+"����ʹ�õ�ʱ��Ϊ��"+(end-begin)+"����");
		
	}

	@Override
	public void testStringBuilder() {

		StringBuilder s=new StringBuilder();
		long begin=System.currentTimeMillis();
		for(int i=0;i<time;i++){
			s.append("java");
		}
		long end=System.currentTimeMillis();
		System.out.println(s.getClass().getName()+"����ʹ�õ�ʱ��Ϊ��"+(end-begin)+"����");
		
	}

	@Override
	public void testStringBuffer() {
		
		StringBuffer s=new StringBuffer();
		long begin=System.currentTimeMillis();
		for(int i=0;i<time;i++){
			s.append("java");
		}
		long end=System.currentTimeMillis();
		System.out.println(s.getClass().getName()+"����ʹ�õ�ʱ��Ϊ��"+(end-begin)+"����");
		
	}

	@Override
	public void testStringPlusOperator() {
		
//		String s1="";
		long begin=System.currentTimeMillis();
		for(int i=0;i<time;i++){
			String s="I"+"love"+"you";
		}
		long end=System.currentTimeMillis();
		System.out.println("�ַ���ֱ����Ӳ���ʹ�õ�ʱ��Ϊ��"+(end-begin)+"����");
		
	}

	@Override
	public void testStringPlusDirect() {
		
		String s1="I";
		String s2="love";
		String s3="you";
		long begin=System.currentTimeMillis();
		for(int i=0;i<time;i++){
			String s=s1+s2+s3;
		}
		long end=System.currentTimeMillis();
		System.out.println("�ַ��������Ӳ���ʹ�õ�ʱ��Ϊ��"+(end-begin)+"����");
	}

}
