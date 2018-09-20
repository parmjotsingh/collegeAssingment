import java.util.*;
public class QuestionOne{
	public static void main(String[] args){
		Set<Integer> s1=new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		Set<Integer> s2=new HashSet<>();
		s2.add(5);
		s2.add(2);
		s2.add(6);
		s2.add(4);
		s2.add(7);
		Set<Integer> s3=new HashSet<>();
		for(int i:s1){
			for(int j:s2){
				if(i==j){
					s3.add(i);
				}
			}
		}
		for(int i:s3){
			System.out.println(i);
		}
	}
}