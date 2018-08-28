import java.util.Scanner;
public class Waveform{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] a=new int[10];
		for(int i:a){
			a[i]=scan.nextInt();
		}
		int[] b=new int[10];
		Arrays.sort(a);
		int o=1,e=0;
		for(int i:a){
			if((a[i]%2)==0){
				b[e]=a[i];
				e+=2;
			}
			else{
				b[o+1]=a[i];
				o+=2;
			}
		}
		for(int i:a){
			System.out.println(a[i]+" ");
		}	
	}
}