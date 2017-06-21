package com.bl.wkx;

public class Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="c:\\1\\11\\test.java",path,file;
    int i;
    i=a.lastIndexOf("\\");
    path=a.substring(0,i);
	file=a.substring(i+1);
    System.out.println("路径："+path+"      文件名为："+file);
	}

}
