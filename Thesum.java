package com.bl.wkx;

import java.util.Scanner;

public class Thesum {
	static class maxmin{//�����ֵ����Сֵ
	maxmin(int[] c){
		int tep=0,min,max,a;//��Ϊ�м�ֵ
		for(int j=1;j<10;j++){//ʹ��ð�����򷨽�������
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
		System.out.println("��СֵΪ:"+min);
		System.out.println("���ֵΪ:"+max);
	}
}
	static class ave{//��ƽ�������ܺ�
		ave(int[] b){
			int sum=0;
			for(int i=0;i<10;i++){
				sum=sum+b[i];
			}
			System.out.println("�ܺ�Ϊ��"+sum);
			System.out.println("ƽ�����ǣ�"+(sum/10));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner num=new Scanner(System.in);
    int[] a=new int[10];
    for(int i=0;i<10;i++){
    	System.out.println("�������"+(i+1)+"������");
    	a[i]=num.nextInt();
    }
    new maxmin(a);
    new ave(a);
	}

}
