abstract class Animals{
	String color,breed,name;
	abstract void eat();
	void speak(){
		System.out.println("Hello");
	}
}
class Dog extends Animals{
	public void speak(){
		System.out.println("BOW-BOW");
	}
	public void eat(){
		System.out.println("Pedigree");
	}
}
class Cat extends Animals{
	/*	
	public void speak(){
		System.out.println("MEOOWWW");
	}
	*/
	public void eat(){
		System.out.println("Chapl");
	}
}

public class QuestionTwo{
	public static void main(String[] args){
		Animals a=new Dog();
		a.speak();
		a.eat();
		a=new Cat();
		a.speak();
		a.eat();
	}
}