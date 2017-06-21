package com.bl.wkx;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count1,count2,sum;
	int[] a={0,0,0,0,0,0,0,0,0,0,0};
    Random one=new Random();
    Random two=new Random();
    for(int i=1;i<5000;i++){
    	count1=count2=sum=0;
    	count1=one.nextInt(6)+1;
    	count2=two.nextInt(6)+1;
    	sum=count1+count2;
    	switch(sum){
    	case 2:a[0]++;break;
    	case 3:a[1]++;break;
    	case 4:a[2]++;break;
    	case 5:a[3]++;break;
    	case 6:a[4]++;break;
    	case 7:a[5]++;break;
    	case 8:a[6]++;break;
    	case 9:a[7]++;break;
    	case 10:a[8]++;break;
    	case 11:a[9]++;break;
    	case 12:a[10]++;break;
    	}
    }
    System.out.println("出现总和为10的次数为："+a[8]);
	}

}
