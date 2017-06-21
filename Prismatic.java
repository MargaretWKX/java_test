package com.bl.wkx;

public class Prismatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,k;
    for(i=1;i<=9;i++){
    	for(j=0;j<9-i;j++){
    		System.out.print(" ");
    	}
    	for(k=1;k<=(2*i-1);k++){
    		System.out.print(i);
    	}
    	System.out.println();
    }
    for(i=8;i>0;i--){
		for(k=0;k<9-i;k++){
			System.out.print(" ");
		}
		for(j=0;j<(i*2-1);j++){
			System.out.print(Character.toChars(65+i-1));
		}
		System.out.println();
	}
	}

}
