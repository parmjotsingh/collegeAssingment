import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	public String toString(){
		return ""+data;
	}
}

public class QuestionSix{
	Node headO;
	Node headE;
	Node tailO;
	Node tailE;
	void insert(int t){
		if(t%2==0){
			insertE(t);
		}
		else{
			insertO(t);
			}
	}
	void insertE(int t){
		Node temp=new Node(t);
		if(headE==null){
			headE=temp;
			tailE=headE;
		}
		else{
			tailE.next=temp;
			tailE=temp;
			
		}
	}
	void insertO(int t){
		Node temp=new Node(t);
		if(headO==null){
			headO=temp;
			tailO=headO;
		}
		else{
			tailO.next=temp;
			tailO=temp;
			
		}
	}
	void print(){
		
		Node temp=null;
		if(headO==null){
			temp=headE;
		}
		else{
			temp=headO;
			tailO.next=headE;
		}
		while(temp!=null){
			System.out.println(temp);
			temp=temp.next;
		}
	}
	public static void main(String[] args){
		QuestionSix ob=new QuestionSix();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		ob.print();
	}
}