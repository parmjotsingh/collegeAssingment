import java.util.*;

public class QuestionSix{
	public String removeDuplicate(String s,String ss,int i){
		if(i==(s.length()-1)){
			return ss+s.charAt(i);
		}
		else{
			if(s.charAt(i)!=s.charAt(i+1)){
				ss+=s.charAt(i);
			}
			return removeDuplicate(s,ss,++i);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		QuestionSix obj=new QuestionSix();
		String newString=new String();
		int l=(s.length());
		int i=0;
		System.out.println("ANSWER -> "+obj.removeDuplicate(s,newString,i));
	}
}