package test;

import java.util.Scanner;

public class Monthdays {

	public static void main(String[] args) {
		try{
		//String[] ary =null;
		// TODO Auto-generated method stub
        //int month=Integer.parseInt(ary[0]);
		Scanner tem=new Scanner(System.in);
		int month=tem.nextInt();
        switch(month){
        case 1:System.out.println("31 days");break;
        case 2:System.out.println("29 days");break;
        case 3:System.out.println("31 days");break;
        case 4:System.out.println("30 days");break;
        case 5:System.out.println("31 days");break;
        case 6:System.out.println("30 days");break;
        case 7:System.out.println("31 days");break;
        case 8:System.out.println("31 days");break;
        case 9:System.out.println("30 days");break;
        case 10:System.out.println("31 days");break;
        case 11:System.out.println("30 days");break;
        case 12:System.out.println("31 days");break;
        }
		}
		catch(Exception ex){
			System.out.println("≥ˆœ÷“Ï≥£");
		}
	}

}
