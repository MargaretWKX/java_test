package com.bl.wkx;

public class Calculation {
	static double Rectangle(double height,double width){
		System.out.println("矩形的面积为："+(height*width));
		return height*width;
	}
	static double CubeV(double l){
		System.out.println("立方体的体积为："+(l*l*l));
		return (l*l*l);
	}
	static double BallV(double r){
		System.out.println("球的体积为："+(4/3)*3.14*r*r*r);
		return (4/3)*3.14*r*r*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculation.Rectangle(3.2,8.7);
      Calculation.CubeV(8.6);
      Calculation.BallV(5.3);
	}

}
