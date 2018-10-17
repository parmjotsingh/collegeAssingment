class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class Stack{
	int top;
	int[] arr;
	Node head;
	Stack(){
		top=-1;
	}
	void push(int data){			//==========push = insert beginning
		Node temp=new Node(data);
		
			temp.next=head;
			head=temp;
			top++;
		
	}
	Node pop(){
		if(top == -1){
			System.out.println("Under flow ");
			return null;
		}
		else{
			Node a=head;
			head=head.next;
			top--;
			return a;
		}
	}

	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

public class SDemo {
	
	public static void main(String[] args){
		Stack obj=new Stack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.display();
		Node n=obj.pop();
		//System.out.println(n.data+"=============");
		obj.display();
	}
}