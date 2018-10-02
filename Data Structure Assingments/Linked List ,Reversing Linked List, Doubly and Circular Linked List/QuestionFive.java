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

public class QuestionFive{
	Node head;
	Node tail;
	void insert(int t){
		Node temp=new Node(t);
		if(head==null){
			head=temp;
			tail=head;
		}
		else{
			tail.next=temp;
			tail=temp;
			
		}
	}
	void insert_beg(int t){
		Node temp=new Node(t);
		temp.next=head;	
		head=temp;
	}
	void print(){
		Node temp=head;
		while(temp!=tail.next){
			System.out.println(temp);
			temp=temp.next;
		}
	}
	void reverse(){
		Node prev=null;
		Node curr=head;
		Node next=null;
		//System.out.println("Reverse");
		tail=head;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}

	
	public static void main(String[] args){
		QuestionFive ob=new QuestionFive();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		ob.print();
		ob.reverse();
		System.out.println("==============After Reverse===============");
		ob.print();
	}
}