package com.bl.wkx;

public class CalculationCount {
   int count=0;
	void Count(){
	   count++;
   }
	int Getcount(int count){
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i;
     for(i=0;i<10;i++){
    	 new Calculation();
     }
     System.out.println("系统中有"+i+"个对象");
	}

}
