import java.util.*;

public class QuestionFour{
	public int pow(int x,int y){
		if(y==1){
			return x;
		}
		else{
			return x*pow(x,--y);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		QuestionFour obj=new QuestionFour();
		System.out.println("ANSWER -> "+obj.pow(x,y));
	}
}