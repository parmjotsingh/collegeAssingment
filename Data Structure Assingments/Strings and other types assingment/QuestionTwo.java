import java.util.Scanner;
public class QuestionTwo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String ss=new String();
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				ss+=Character.toLowerCase(s.charAt(i));
			}else{ss+=Character.toUpperCase(s.charAt(i));}
		}
		System.out.println(ss);
	}
}