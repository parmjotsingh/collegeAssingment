import java.util.*;
public class QuestionFour{
	public static void main(String[] args){
		System.out.println("Enter size of array m * n");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j] = scan.nextInt();
		
		int j=0;
		for(int i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(arr[i][j]+",");
			}
			++i;
			if(i<m){
				for(j=n-1;j>=0;j--){
					System.out.print(arr[i][j]+",");
				}
			}
		}
	}
}