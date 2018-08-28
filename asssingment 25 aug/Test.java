class Demo{

	static{
		//static runs only by making object
		System.out.println("Static");
	}

}

public class Test{
	public static void main(String[] args){
		Demo d=new Demo();
	}
}