import java.util.*;
public class If{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëxµÄÖµ");
		int x=sc.nextInt();
		int y;
		if(x>=3){
			 y=2*x+1;
			
		}else if(x>=-1&&x<3){
			 y=2*x;
		}else{
			 y=2*x-1;
		}
		System.out.println(y);
	}
}