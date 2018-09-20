import java.util.*;
public class QuestionTwo{
	public static void main(String[] args){
		Map<Integer,String> m=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many values u want to enter");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter id");
			int key=scan.nextInt();
			System.out.println("Enter name");
			scan.nextLine();
			String value=scan.nextLine();
			m.put(key,value);
		}

		System.out.println("======================================");
		Set<Integer> key=m.keySet();
		for(int i:key){
			System.out.println(i+"	"+m.get(i));
		}
	}
}