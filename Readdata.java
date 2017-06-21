package com.bl.wkx;

import java.io.*;

public class Readdata {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File a=new File("Readdata.txt");
		a.createNewFile();
		DataInputStream in=new DataInputStream(new FileInputStream(a));
		DataOutputStream out=new DataOutputStream(new FileOutputStream(a));
		out.writeDouble(9.0);
		out.writeInt(1);
		out.writeUTF("yes");
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		in.close();
	}

}
