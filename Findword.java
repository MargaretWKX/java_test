package com.bl.wkx;

import java.io.*;

public class Findword {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String s=null;
	    String sfind=null;
	    File a=new File("Findword.txt");
	    File f=new File("F:\\bye.txt");
	    BufferedReader br=new BufferedReader(new FileReader(f));
	    BufferedReader brSearch=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("请写出你要寻找的单词：");
	    sfind=brSearch.readLine();
	    System.out.println();
	    s=br.readLine();
	    while(s!=null)
	      {
		if(s.indexOf(sfind)!=-1)
		{
			System.out.println(s);
		}
		s=br.readLine();
	      }
	}
}
