package abc;

interface eatable {
    
}
public class Fruit implements eatable{
   public void howtoEat(){
	   System.out.println("ÓÃµ¶ÇÐ¿ª³Ô");
   }
   public String printstring(){
	   return "fruit";
   }
}
class Apple extends Fruit{
	public void howtoEat(){
		System.out.println("°þÆ¤³Ô");
	}
	public String printstring(){
		return "Apple";
	}
}
class Orange extends Fruit{
	public void howtoEat(){
		System.out.println("³Ô³È×Ó°þÆ¤");
	}
	public String printstring(){
		return "Orange";
	}
}