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

public class QuestionTwo{
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
			System.out.print(temp+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	void removeDup(){
		Node ptr=head;
		Node pre=head;
		while(ptr.next!=null){
			
			if((ptr).data==(ptr.next).data){
				ptr.next=(ptr.next).next;
				ptr=pre;
				if(ptr!=head){
					pre=ptr;
					ptr=ptr.next;
				}
			}
			else{
			pre=ptr;
			ptr=ptr.next;
			}
		}
	}
	public static void main(String[] args){
		QuestionTwo ob=new QuestionTwo();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		ob.print();
		ob.removeDup();
		System.out.println("====================REMOVING DUPLICATES======================");
		ob.print();
	}
}