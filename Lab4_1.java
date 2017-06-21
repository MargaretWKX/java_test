package com.bl.wkx;

public class Lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		float a[]=new float[5];
		float sum=0;
		for(int i=0;i<a.length;i++){
			a[i]=Float.parseFloat(args[i]);
			System.out.println ("第"+(i+1)+"门课程的成绩是:"+a[i]);
			sum=sum+a[i];
		}
		System.out.println("总成绩是："+sum);
		float avg=sum/a.length;
		System.out.println ("平均成绩是:"+avg);	
		}
		catch(ArrayIndexOutOfBoundsException ex1){
			System.out.println(ex1.getMessage());
		}
		catch(NumberFormatException ex2){
			System.out.println(ex2.getMessage());
		}
		catch(Exception ex3){
			System.out.println(ex3.getMessage());
		}
	}

}
