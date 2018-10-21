import java.util.*;
public class QuestionThree{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=scan.nextInt(); 
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Enter the size of second array : ");
		n=scan.nextInt(); 
		int[] ar=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ar[i]=scan.nextInt();
		}
		int length=ar.length>arr.length?ar.length:arr.length;
		int[] inter=new int[length];
		Arrays.sort(ar);
		Arrays.sort(arr);
		int c=0;
		for(int i=0;i<arr.length;i++){
			N:for(int j=c;j<ar.length;j++){
				if(arr[i]==ar[j]){
					inter[c++]=arr[i];
					break N;
				}
			}
		}
		System.out.println("INTERSECTION ARRAY");
		for(int i=0;i<c;i++){
			System.out.print(inter[i]+" ");
		}
	}
}