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
		int year=1; //��ʼ������
		int salary=1500; //��ʼ���¹���
		double bonus=9.7; //��ʼ������
		try{
			if(year<0){
				throw new IllegalYearException("��Ч��");
			}
			if(salary<500){
				throw new IllegalSalaryException("��Ч�¹���");
			}
			if(year==0)
				bonus=salary;
			else if(year<3)
				bonus=salary*1.3;
			else if(year>=3 && year<5)
				bonus=salary*1.5;
			else if(year>5)
				bonus=salary*2;
			System.out.println ("��Ա���Ľ���Ϊ��"+bonus);	
    	}catch(IllegalYearException ex1){
			System.out.println (ex1.getMessage());
		}catch(IllegalSalaryException ex2){
    		System.out.println (ex2.getMessage());
    	}
	}

}
