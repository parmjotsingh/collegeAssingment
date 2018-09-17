import java.util.*;

public class QuestionThree{
	public int fib(int n,int a,int b){
		if(n==0){
			return a+b;
		}
		else{
			return fib(--n,b,a+b);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		QuestionThree obj=new QuestionThree();
		int a=0,b=1;
		n-=2;
		System.out.println("n position number -> "+obj.fib(--n,a,b));
	}
}