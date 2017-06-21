package com.bl.wkx;

public class Bonus {
	static class IllegalYearException extends Exception{
	   IllegalYearException(){
			
		}
		IllegalYearException(String s){
			super(s);
		}
	}
	static class IllegalSalaryException extends Exception{
		IllegalSalaryException(){
			
		}
		IllegalSalaryException(String s){
			super(s);
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1; //初始化工龄
		int salary=1500; //初始化月工资
		double bonus=9.7; //初始化奖金
		try{
			if(year<0){
				throw new IllegalYearException("无效年");
			}
			if(salary<500){
				throw new IllegalSalaryException("无效月工资");
			}
			if(year==0)
				bonus=salary;
			else if(year<3)
				bonus=salary*1.3;
			else if(year>=3 && year<5)
				bonus=salary*1.5;
			else if(year>5)
				bonus=salary*2;
			System.out.println ("该员工的奖金为："+bonus);	
    	}catch(IllegalYearException ex1){
			System.out.println (ex1.getMessage());
		}catch(IllegalSalaryException ex2){
    		System.out.println (ex2.getMessage());
    	}
	}

}
