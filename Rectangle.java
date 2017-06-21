package com.bl.wkx;

public class Rectangle {
	double width;
	double height;
  public double GetWidth(){
	  return width;
  }
  public void SetWidth(double width){
	  this.width=width;
  }
  public double GetHeight(){
	  return height;
  }
  public void SetHeight(double height){
	  this.height=height;
  }
  public double S(double height,double width){
	  return height*width;
  }
  public double C(double height,double width){
	  return 2*(height+width);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rectangle one=new Rectangle();
    System.out.println("面积为"+one.S(1.9,2.3)+"  周长为："+one.C(1.9,2.3));
	}
}