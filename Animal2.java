package com.bl.wkx;

public class Animal2 implements eatable{
public void howtoEat(){
	System.out.println("���ܳ�Ұ������");
}
public String printsting(){
	return "Animals";
}
}
class Pig extends Animal2{
	public void howtoEat(){
		System.out.println("��ϲ����ô�Ծ���ô��");
	}
	public String printstring(){
		return "Pig";
	}
}
class Chicken extends Animal2{
	public void howtoEat(){
		System.out.println("��ϲ����ô�Ծ���ô��!");
	}
	public String printstring(){
		return "Chicken";
	}
}
class Tiger extends Animal2{
	public void howtoEat(){
		System.out.println("���ܳ�");
	}
	public String printstring(){
		return "Tiger";
	}
}