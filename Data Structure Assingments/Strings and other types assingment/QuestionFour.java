import java.util.Scanner;
public class QuestionFour{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(int i=0;i<s.length();i++){
			for(int j=1;j<=s.length()-i;j++){
				System.out.println(s.substring(i,j+i));
			}
		}
	}
}