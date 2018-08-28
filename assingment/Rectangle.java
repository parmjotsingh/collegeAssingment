import java.util.Scanner;

class Rectangle{
	private int length;
	private int breadth;
	int calculateArea(){
		return getLength()*getBreadth();
	}
	void setLength(int x){
		length=x;
	}
	void setBreadth(int x){
		breadth=x;
	}	
	int getLength(){
		return length;
	}
	int getBreadth(){
		return breadth;
	}
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		Rectangle r=new Rectangle();
		System.out.println("ENTER LENGTH");
		r.setLength(scan.nextInt());
		System.out.println("ENTER BREADTH");		
		r.setBreadth(scan.nextInt());
		System.out.println("AREA = "+r.calculateArea());
	}
}