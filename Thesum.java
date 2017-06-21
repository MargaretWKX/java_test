package com.bl.wkx;

import java.util.Scanner;

public class Thesum {
	static class maxmin{//求最大值和最小值
	maxmin(int[] c){
		int tep=0,min,max,a;//作为中间值
		for(int j=1;j<10;j++){//使用冒泡排序法进行排序
		for(a=0;a<10-j;a++){
			if(c[a]<c[a+1]){
			tep=c[a];
			c[a]=c[a+1];
			c[a+1]=tep;
			}
		}
	}
		min=c[0];
		max=c[9];
		System.out.println("最小值为:"+min);
		System.out.println("最大值为:"+max);
	}
}
	static class ave{//求平均数和总和
		ave(int[] b){
			int sum=0;
			for(int i=0;i<10;i++){
				sum=sum+b[i];
			}
			System.out.println("总和为："+sum);
			System.out.println("平均数是："+(sum/10));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner num=new Scanner(System.in);
    int[] a=new int[10];
    for(int i=0;i<10;i++){
    	System.out.println("请输入第"+(i+1)+"个数：");
    	a[i]=num.nextInt();
    }
    new maxmin(a);
    new ave(a);
	}

}
