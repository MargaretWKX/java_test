package com.bl.wkx;

public class Animal2 implements eatable{
public void howtoEat(){
	System.out.println("不能吃野生动物");
}
public String printsting(){
	return "Animals";
}
}
class Pig extends Animal2{
	public void howtoEat(){
		System.out.println("你喜欢怎么吃就怎么吃");
	}
	public String printstring(){
		return "Pig";
	}
}
class Chicken extends Animal2{
	public void howtoEat(){
		System.out.println("你喜欢怎么吃就怎么吃!");
	}
	public String printstring(){
		return "Chicken";
	}
}
class Tiger extends Animal2{
	public void howtoEat(){
		System.out.println("不能吃");
	}
	public String printstring(){
		return "Tiger";
	}
}