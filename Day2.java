import java.util.*;
public class Day2{
	public static void main(String[] args){
		
		loopNumber();//构造这个代码块 共性的描述
	}
	static void loopNumber(){
		int number=0,d4,d3,d2,d1;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个1到9999之间的数");
		number=sc.nextInt();
		if(number>=1&&number<10000){
			d4=number%1000;
			d3=(number-d4*1000)%100;
			d2=(number-d4*1000-d3*100)%10;
			d1=number-d4*1000-d3*100-d2*10;
			if(d4!=0){
			System.out.println(number+"是4位数");
				if(d4==d1&&d2==d3){
						System.out.println(number+"是回文数");
				}else{
						System.out.println(number+"不是回文数");
				}
			}
			if(d3!=0){
			System.out.println(number+"是3位数");
				if(d1==d3){
						System.out.println(number+"是回文数");
				}else{
						System.out.println(number+"不是回文数");
				}
			}
			if(d2!=0){
			System.out.println(number+"是2位数");
				if(d1==d2){
						System.out.println(number+"是回文数");
				}else{
						System.out.println(number+"不是回文数");
				}
			}
			else if(d1!=0){
				System.out.println(number+"是1位数");
				System.out.println(number+"是回文数");
			}
			else{
				System.out.println(number+"不在1到9999之间");
			}
		}
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	