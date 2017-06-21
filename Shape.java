package com.bl.wkx;

class Triangle extends Shape{
	public Triangle(double Height,double Width){
		width=Width;
		height=Height;
	}
	double S(double height,double width){
		System.out.println("三角形的面积为："+(height*width)/2);
		return (height*width)/2;
	}
}
class Square extends Shape{
	public  Square(double Height){
		height=Height;
	}
	double S(double height){
		System.out.println("正方形的面积为："+(height*height));
		return height*height;
	}
}
class Circle extends Shape{
	public Circle(double R){
	r=R;
	}
	double S(double r){
		System.out.println("圆的面积为："+(3.14*r*r));
		return 3.14*r*r;
	}
}
public class Shape {
	double height,width,S,r;
	double S(){
		return S;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle one=new Circle(2.0);
	one.S(2.0);
	Square two=new Square(3.5);
	two.S(3.5);
	Triangle three=new Triangle(5.5,3.4);
	three.S(5.5,4.4);
	}

}
