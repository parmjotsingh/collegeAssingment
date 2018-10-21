import java.util.*;
public class QuestionOne{
	public static void getMax(int[] arr){
		int max=arr[0];
		for(int i:arr){
			if(i>max){max=i;}
		}
		System.out.println("Maximum -> " + max);
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n=scan.nextInt(); 
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		QuestionOne.getMax(arr);
	}
}