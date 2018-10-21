import java.util.*;
public class QuestionFive{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n=scan.nextInt(); 
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int i=0,j=arr.length-1;
		while(i!=j && i<j){
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}