package com.djran.main;

public class MainTest {
	
	public static void main(String args[]){

		int a=2;
		Object object=new Object();
		System.out.println(a+":"+object);
		changed(a,object);
		System.out.println(a+":"+object);
	}

	private static void changed(int a, Object object) {
		System.out.println(a+":"+object);
	    a=1;
		object=new Object();
		System.out.println(a+":"+object);
	}
}
