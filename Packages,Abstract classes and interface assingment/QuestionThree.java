import java.util.*;
public class QuestionThree{
	public static void main(String[] args){
		String s1=new String();
		String s2=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		s1=scan.nextLine();
		System.out.println("Enter number");
		s2=scan.nextLine();
		System.out.println("Greatest number = "+((Integer.parseInt(s1))>(Integer.parseInt(s2))?Integer.parseInt(s1):Integer.parseInt(s2)));
	}
}