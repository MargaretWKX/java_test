package com.bl.wkx;

import java.util.*;

public class Aggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet one=new HashSet();
    HashSet two=new HashSet();
    HashSet and=new HashSet();
    one.add(1);
    one.add(2);
    one.add(3);
    one.add(4);
    two.add(1);
    two.add(3);
    two.add(7);
    two.add(9);
    two.add(11);
    and.addAll(one);
    and.addAll(two);
    System.out.println("²¢¼¯£º"+and);
}
}
