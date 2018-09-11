import java.util.*;
public class QuestionOne{
	public static void main(String[] args){
		String s=new String();
		String r=new String();
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		for(int i=s.length()-1;i>=0;i--){
			r=r+s.charAt(i);
			//r=r+s.substring(i,i+1); //one more method
			}
		System.out.println("REVERSE -> "+r);
	}
}