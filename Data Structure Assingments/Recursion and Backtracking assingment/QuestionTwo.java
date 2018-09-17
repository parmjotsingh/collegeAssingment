import java.util.*;

public class QuestionTwo{
	public int[] reverse(int[] arr,int[] rev,int n,int k){
		if(n==0){
			rev[k++]=arr[n];
			return rev;
		}
		else{	
			rev[k++]=arr[n];
			return reverse(arr,rev,--n,k);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		QuestionTwo obj=new QuestionTwo();
		int[] rev=new int[n];
		int k=0;
		rev=obj.reverse(arr,rev,--n,k);

		System.out.println("Reverse");
		for(int i=0;i<rev.length;i++){
			System.out.println(rev[i]);
		}
	}
}