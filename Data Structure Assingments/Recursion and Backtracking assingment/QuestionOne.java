import java.util.*;
public class QuestionOne{

	public boolean find(int[] arr,int m,int k){
		if(arr[k]==m){
			return true;
		}
		else{
			if(k==0){return false;}
			return find(arr,m,--k);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		QuestionOne obj=new QuestionOne();
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int k=arr.length;
		System.out.println(obj.find(arr,m,--k));
	}
}