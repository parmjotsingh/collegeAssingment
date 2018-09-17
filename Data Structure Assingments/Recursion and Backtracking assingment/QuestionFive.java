import java.util.*;

public class QuestionFive{
	public int sum(String s,int l){
		if(l==0){
			return Integer.parseInt(""+s.charAt(l));
		}
		else{
			return Integer.parseInt(""+s.charAt(l))+sum(s,--l);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		QuestionFive obj=new QuestionFive();
		int l=s.length();
		System.out.println("ANSWER -> "+obj.sum(s,--l));
	}
}