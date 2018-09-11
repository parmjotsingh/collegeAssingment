import java.util.Scanner;
public class QuestionTwo{
	public static void main(String[] args){
		String s=new String();
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		int k=1;
		for (int i = 0; i < s.length(); i++)
      		{
        		for(int j = 1;  j<= s.length() - i; j++)
         		{
            			String sub = s.substring(i, j+i);
            			System.out.println(sub);
         		}
      		}
	}
	
}