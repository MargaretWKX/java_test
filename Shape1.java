package com.bl.wkx;

class Triangle extends Shape1{
	public Triangle(double Height,double Width){
		width=Width;
		height=Height;
	}
	static double S(double height,double width){
		System.out.println("三角形的面积为："+(height*width)/2);
		return (height*width)/2;
	}
}
class Square extends Shape1{
	public  Square(double Height){
		height=Height;
	}
	static double S(double height){
		System.out.println("正方形的面积为："+(height*height));
		return height*height;
	}
}
class Circle extends Shape1{
	public Circle(double R){
	r=R;
	}
	static double S(double r){
		System.out.println("圆的面积为："+(3.14*r*r));
		return 3.14*r*r;
	}
}
public class Shape1 {
	double height,width,S,r;
	double S(){
		return S;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float o=5;
	double p=5.5;
	Object[] one=new Object[5];
	one[0]=Circle.S(2.0);
	one[1]=Square.S(3.5);
	one[2]=Triangle.S(5.5,4.4);
	one[3]=o;
	one[4]=p;
	System.out.println(one[3]);
	System.out.println(one[4]);
	}

}
