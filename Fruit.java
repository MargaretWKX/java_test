package abc;

interface eatable {
    
}
public class Fruit implements eatable{
   public void howtoEat(){
	   System.out.println("�õ��п���");
   }
   public String printstring(){
	   return "fruit";
   }
}
class Apple extends Fruit{
	public void howtoEat(){
		System.out.println("��Ƥ��");
	}
	public String printstring(){
		return "Apple";
	}
}
class Orange extends Fruit{
	public void howtoEat(){
		System.out.println("�Գ��Ӱ�Ƥ");
	}
	public String printstring(){
		return "Orange";
	}
}