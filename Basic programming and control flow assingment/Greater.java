public class Greater{
	public static void main(String[] args){
		int a=10;
		int b=8;
		int c=9;
		if(a>b){
			if(a>c){System.out.println("a greatest");}
			else{System.out.println("c greatest");}
		}	
		else{
			if(b>c){System.out.println("b greatest");}
			else{System.out.println("c greatest");}
		}
	}
}