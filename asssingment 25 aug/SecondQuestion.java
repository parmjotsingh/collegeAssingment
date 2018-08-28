class Animal
{
	public void breed()
	{
		System.out.println("german");
	}
	public void colour()
	{
		System.out.println("black");
	}
	public void speak()
	{
		System.out.println("----------");
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("meoooooooowwwwww");
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("bow-bow");
	}
}
public class SecondQuestion
{
	public static void main(String[] args)
	{
		Cat a=new Cat();
		Dog b=new Dog();
		a.breed();
		a.colour();
		a.speak();
		b.breed();
		b.colour();
		b.speak();
	}
}
