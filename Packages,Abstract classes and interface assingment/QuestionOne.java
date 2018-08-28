interface Animals{
	void speak();
	void eat();
}
class Dog implements Animals{
	public void speak(){
		System.out.println("BOW-BOW");
	}
	public void eat(){
		System.out.println("Pedigree");
	}
}
class Cat implements Animals{
	public void speak(){
		System.out.println("MEOOWWW");
	}
	public void eat(){
		System.out.println("Chapl");
	}
}

public class QuestionOne{
	public static void main(String[] args){
		Animals a=new Dog();
		a.speak();
		a.eat();
		a=new Cat();
		a.speak();
		a.eat();
	}
}