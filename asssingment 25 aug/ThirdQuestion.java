class test
{
	public void print()
	{
		System.out.println("1st function called");
	}
	public void print(int a)
	{
		System.out.println("2nd function called int a= "+a );
	}
	public void print(float a)
	{
		System.out.println("1st function called float a = "+a );
	}
}
public class ThirdQuestion
{
	public static void main(String[] args)
	{
		test obj =new test();
		obj.print();
		obj.print(22);
		obj.print(9.243f);
	}
}