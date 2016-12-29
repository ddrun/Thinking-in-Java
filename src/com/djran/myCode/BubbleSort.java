package com.djran.myCode;
/**
 * 测试字符编码,IDEA测试，这是一个测试，用于多人开发
 * @author djran 2016年12月29日 下午2:02:20
 *
 */
public class BubbleSort {
		
	public void printNum(int[] num) {
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]+" ");
		}
		
	}

	public void sort(int[] num) {
		int temp=0;
		int j=0;
		boolean swaped=true;
		while (swaped) {
			swaped=false;
			j++;
			for(int i=0;i<num.length-j;i++){
				if(num[i]>num[i+1]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					swaped=true;
				}
					
			}
		}
		
	}
	
	
}
