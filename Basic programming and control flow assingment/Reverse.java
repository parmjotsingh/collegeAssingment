import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scan.nextInt();
		int s=0,r;
		while(n>0){
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println("Reverse = "+s);
	}
}