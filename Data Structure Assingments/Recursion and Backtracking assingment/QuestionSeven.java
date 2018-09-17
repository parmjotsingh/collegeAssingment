import java.util.*;

public class QuestionSeven{
	public boolean brackets(String s,int i,char[] c,int top){
		if((s.charAt(i)==']'||s.charAt(i)==')'||s.charAt(i)=='}') || i==(s.length()-1)){
			if(( s.charAt(i)==')'&&c[top]=='(' ) || ( s.charAt(i)==']'&&c[top]=='[' ) || ( s.charAt(i)=='}'&&c[top]=='{' ) ){
				top--;
				return true;
				
			}
			else{
				return false;
			}
		}
		else{
			if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
				c[++top]=s.charAt(i);
			}
			return brackets(s,++i,c,top);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		QuestionSeven obj=new QuestionSeven();
		int i=0,top=-1;char[] c=new char[s.length()];
		System.out.println("ANSWER -> "+obj.brackets(s,i,c,++top));
	}
}