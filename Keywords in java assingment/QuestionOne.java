class parent{
	protected static void fun(){
		System.out.println("Parent class");
	}
}

public class QuestionOne extends parent{
	public static void main(String[] args){
		parent.fun();
		System.out.println("MAIN METHOD");
	}
}