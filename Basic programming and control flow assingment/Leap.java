import java.util.*;

class check{
	protected boolean check(short x){
		if(x%400==0){
			return true;
		}else if(((x%100)!=0)&&((x%4)==0)){
				return true;
			}
	return false;
	}
}

public class Leap{
	public static void main(String[] args){
		check c=new check();
		Scanner scan=new Scanner(System.in);
		if(c.check(scan.nextShort())){
			System.out.println("LEAP year");
		}
		else{
			System.out.println("not a LEAP year");
		}	
	}
}