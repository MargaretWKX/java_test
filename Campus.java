package com.bl.wkx;

import java.util.*;
public class Campus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap school=new TreeMap();
		school.put(25000,"北京师范大学珠海学院");
		school.put(21000,"北京理工大学珠海学院");
		school.put(20000,"吉林大学珠海学院");
		school.put(18000,"中山大学珠海分校");
		school.put(7000,"暨南大学珠海分校");
		System.out.println(school);
		System.out.println("人数                            学校名称");
	    Set keys=school.descendingKeySet();
	    Iterator i=keys.iterator();
	    while(i.hasNext()){
	    	int key=(int)i.next();
	    	System.out.println(key+"     "+school.get(key));
	    }

	}
}
