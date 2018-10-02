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

public class QuestionFour{
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
	void palindrome(QuestionFour obj){
		Node ptr=head;
		Node ptr2=obj.head;
		int f=0;
		while(ptr!=null){
			if(ptr.data!=ptr2.data){
				f=1;
				break;
			}
			ptr=ptr.next;
			ptr2=ptr2.next;
		}
		if(f==0){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
	QuestionFour reverse(){
		Node ptr=head;
		QuestionFour obj=new QuestionFour();
		while(ptr!=null){
			obj.insert_beg(ptr.data);
			ptr=ptr.next;
		}
		return obj;
	}

	
	public static void main(String[] args){
		QuestionFour ob=new QuestionFour();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		try{
		ob.print();
		QuestionFour obj=ob.reverse();
		ob.palindrome(obj);
		}
		catch(Exception e){
			System.out.println("List is Empty");
		}
	}
}