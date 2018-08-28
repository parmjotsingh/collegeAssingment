public class QuestionTwo{

	QuestionTwo(){System.out.println("default constructor");}	
	QuestionTwo(int x){
		this();
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args){
		QuestionTwo n=new QuestionTwo(10);
	}
}