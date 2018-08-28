
abstract class vehicle
{
  abstract public void start();
  public void stop()
  {
	  System.out.println("vehicle stopped");
  }
	
}
class twoWheeler extends vehicle
{
	public void start()
	{
		System.out.println("2 wheeler started");
	}
	public void stop()
	{
		System.out.println("2 wheeler stopped");
	}
}
class fourWheeler extends vehicle
{
	public void start()
	{
		System.out.println("4 wheeler started");
	}
	public void stop()
	{
		System.out.println("4 wheeler stopped");
	}
}
public class FourthQuestion
{
	public static void main(String[] args)
	{
		vehicle obj1 = new twoWheeler();
		vehicle obj2 = new fourWheeler();
		obj1.start();
		obj1.stop();
		obj2.start();
		obj2.stop();
	}
}