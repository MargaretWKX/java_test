package com.bl.wkx;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="100*2+160/(78+2)",c=s;
		int n=c.length();;
		int num=0,i=0;
		Boolean isNum=false;
		while(i<n){
			while(i<n && !(c.charAt(i)>='0' && c.charAt(i)<='9')) {
				++i;
				isNum=false;
			}
			while(i<n && c.charAt(i)>='0' && c.charAt(i)<='9'){
				++i;
				isNum=true;
			}
			if (isNum==true)
				++num;
			c=c.substring(i);	
			i=0;
			n=c.length();
		}
		System.out.println(s+"里面有"+num+"常整数");

	}

}
