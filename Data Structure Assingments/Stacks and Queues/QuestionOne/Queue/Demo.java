class Queue{
	int arr[];
	int front,rear;
	Queue(){
		front=rear=-1;
		arr=new int[100];
	}
	void insert(int data){
		if(rear==arr.length-1){
			System.out.println("Overflow");			
		}
		else{
			arr[++rear]=data;
				if(front==-1){
					front=0;
				}
		}
	}

	int delete(){
		int x=0;
		if(front==-1){
			System.out.println("Underflow");			
		}
		else{
			x= arr[front];
				if(front==rear){
					front=rear=-1;
				}
				else{
					++front;
				}
			
		}
		return x;
	}

	void print(){
		for(int i=front;i<=rear;i++){
			System.out.print(arr[i]+"	");
		}
	}
}
public class Demo{
	

	public static void main(String[] args){
		Queue q=new Queue();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.delete();
		q.print();
	}
}