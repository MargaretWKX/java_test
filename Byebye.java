package com.bl.wkx;

import java.io.*;
import java.util.*;

public class Byebye {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String str=null;
		File f=new File("bye.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		System.out.println("请输入一串英文，直到输入bye' : ");
		do
		{ 
			str=br.readLine();
			bw.write(str);
			bw.newLine();
		}while(!str.equalsIgnoreCase("bye"));
			bw.close();
    
	}

}
