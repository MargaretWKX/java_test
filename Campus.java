package com.bl.wkx;

import java.util.*;
public class Campus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap school=new TreeMap();
		school.put(25000,"����ʦ����ѧ�麣ѧԺ");
		school.put(21000,"��������ѧ�麣ѧԺ");
		school.put(20000,"���ִ�ѧ�麣ѧԺ");
		school.put(18000,"��ɽ��ѧ�麣��У");
		school.put(7000,"���ϴ�ѧ�麣��У");
		System.out.println(school);
		System.out.println("����                            ѧУ����");
	    Set keys=school.descendingKeySet();
	    Iterator i=keys.iterator();
	    while(i.hasNext()){
	    	int key=(int)i.next();
	    	System.out.println(key+"     "+school.get(key));
	    }

	}
}
