import java.util.Scanner;
public class QuestionThree{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char[] c=s.toCharArray();
		int[] a=new int[126];
		int count=0;
		char f=' ';
		for(int i=0;i<s.length();i++){
			a[s.charAt(i)]++;
			if(count<a[s.charAt(i)]){
				count=a[s.charAt(i)];
				//f=s.charAt(i);
			}
		}
		System.out.println("Character with highest frequencies -> ");
		for(int i=0 ;i<126;i++){
			if(a[i]>=count){System.out.println((char)i+" occured "+a[i]+" times");}
		}
		//System.out.println(f);
	}
}