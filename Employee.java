package com.bl.wkx;

class MyDate{
	 int year;
	 int month;
	 int day;
	 public MyDate(){
	 }
	 public MyDate(int year,int month,int day){
		 this.year=year;
		 this.month=month;
		 this.day=day;
		 System.out.println("�ܹ�Ӷ�����ڣ�"+year+"��"+month+"��"+day+"��");
	 }
}


public class Employee {
     String name;
     int wage;
     Employee(String name,int wage){
    	 this.name=name;
    	 this.wage=wage;
    	 System.out.println("������"+name+"     ��н��"+wage);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee one=new Employee("Mary",4000);
    MyDate two=new MyDate(2001,9,8);
    
}

}