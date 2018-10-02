import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){	
		this.data=data;
	}
	public String toString(){
		return ""+data;
	}
}
public class QuestionOne{
	Node head;
	Node tail;
	public void insert(int data){
		Node temp=new Node(data);
		temp.next=null;
		if(head == null){
			head=temp;
			tail=head;
		}else{
			tail.next=temp;
			tail=temp;
		}
	}
	public void print(){
		Node ptr=head;
		while(ptr!=null){
			System.out.print(ptr+"	");
			ptr=ptr.next;
		}
	}
	public void swap(int a,int b){
		int i=0;
		Node ptr=head;
		Node ptr1=null;
		Node ptr2=null;
		while(ptr.next!=null){
			if(i==a){
				ptr1=ptr;
			}
			if(i==b){
				ptr2=ptr;
			}
			++i;
			ptr=ptr.next;
		}
		int temp=ptr1.data;
		ptr1.data=ptr2.data;
		ptr2.data=temp;
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		QuestionOne obj=new QuestionOne();
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			obj.insert(scan.nextInt());
		}
		System.out.println("Enter position to swap ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		obj.swap(a,b);
		obj.print();
	}
}