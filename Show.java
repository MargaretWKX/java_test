package com.bl.wkx;

public class Show {
	public static void showObject(Object object) {
		System.out.println(object);
		if (object instanceof eatable) {
			((eatable) object).howtoEat();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	showObject(new Apple());
	showObject(new Orange());
	showObject(new Tiger());
	showObject(new Chicken());
}
}
