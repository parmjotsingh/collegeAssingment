import java.util.*;
public class QuestionFive{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){count++;}
		}
		System.out.println("Number of words -> "+count);
	}
}