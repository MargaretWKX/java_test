package com.bl.wkx;

public class Myclass extends Object{
    public static String clone(String i){
    	System.out.println(i);
    	System.out.println("���ƣ�"+i);
    	return i;
    }
    public static int equals(String a,String b){
    	if(a.equals(b)==true){
    		System.out.println("������Ķ���һ��");
    		return 1;
    	}
    	else{
    		System.out.println("������Ķ�����һ��");
    		return 0;
    	}
    }
    public static String toString(String c){
    	System.out.println(c);
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Myclass.clone("abc");
    Myclass.equals("ab","abc");
    Myclass.toString("wkx");
	}

}
