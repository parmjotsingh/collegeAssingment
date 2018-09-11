import java.util.Scanner;
public class QuestionThree{
	public static void main(String[] args){
		String s=new String();
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		String n=s.replaceAll("[aeiouAEIOU]","");
		System.out.println(n);		
	}
	
}
/*

StringBuffer n=new StringBuffer();
for(int i=0;i<s.length();i++){
			String c=s.substring(i,i);
			if(c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || 			 			   c.equalsIgnoreCase("u") ){}
			else{   System.out.println("hi");//StringBuffer b=new StringBuffer(c);
				n.append(c); }
		}
		System.out.println(n);

*/