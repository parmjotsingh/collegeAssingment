import java.util.Scanner;
public class QuestionOne{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char[] c=s.toCharArray();
		String ss=new String();
		for(int i=s.length()-1;i>=0;i--){
			ss+=c[i];
		}
		if(s.equalsIgnoreCase(ss)){
			System.out.println("Palnindrome");
			}
		else{
			System.out.println("Not a Palnindrome");
			}
	}
}