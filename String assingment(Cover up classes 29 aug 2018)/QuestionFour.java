import java.util.*;
public class QuestionFour{
	public static void main(String[] args){
		String s=new String();
		String s2=new String();
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		s2=scan.nextLine();
		int l=s.length();
		for(int i=0;i<=s2.length()-l;i++){

			if(s2.substring(i,i+l).equalsIgnoreCase(s)){System.out.println(" YES ");}
		}
		
	}
}