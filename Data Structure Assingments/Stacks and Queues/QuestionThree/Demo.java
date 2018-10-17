class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
	
}

public class Demo{

	Node front;
	Node rear;
	void enqueue(int data){
		Node temp=new Node(data);
		if(front==null){
			front=rear=temp;
		}
		else{	
			rear.next=temp;
			rear=temp;
		}
	}	
	void dequeue(){
		if(front==rear){
			front=rear=null;
		}
		else{
			reverse();
			front=front.next;
			reverse();
		}
	}
	void reverse(){
		Node pre=rear=null;
		Node ptr=front;
		Node curr=ptr;
		while(ptr!=null){
			curr=ptr.next;
			ptr.next=pre;
			pre=ptr;
			ptr=curr;
		}
		front=pre;
	}
	void print(){
		while(front!=null){
			System.out.println(front.data+"	");
			front=front.next;
		}
	}
	public static void main(String[] args){
		Demo q=new Demo();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.print();
	}
}