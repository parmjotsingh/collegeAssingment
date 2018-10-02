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

public class QuestionThree{
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
		try{
			while(temp!=tail.next){
				System.out.print(temp+" ");
				temp=temp.next;
			}
		}
		catch(Exception e){
			System.out.println("Linked List is Empty!!!!");
		}
		System.out.println();
	}

	public void merge(QuestionThree obj2){
		
		
		(this.tail).next=obj2.head;
		(this.tail)=obj2.tail;	
	
	}
	public QuestionThree scanning(){
		QuestionThree ob=new QuestionThree();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		return ob;			
	}

	public static void main(String[] args){
		QuestionThree ob=new QuestionThree();
		QuestionThree obj1=ob.scanning();
		QuestionThree obj2=ob.scanning();
		obj1.print();
		obj2.print();
		obj1.merge(obj2);
		System.out.println("====================AFTER MERGING======================");
		obj1.print();
	}
}