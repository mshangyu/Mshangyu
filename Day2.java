import java.util.*;
public class Day2{
	public static void main(String[] args){
		
		loopNumber();//������������ ���Ե�����
	}
	static void loopNumber(){
		int number=0,d4,d3,d2,d1;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��1��9999֮�����");
		number=sc.nextInt();
		if(number>=1&&number<10000){
			d4=number%1000;
			d3=(number-d4*1000)%100;
			d2=(number-d4*1000-d3*100)%10;
			d1=number-d4*1000-d3*100-d2*10;
			if(d4!=0){
			System.out.println(number+"��4λ��");
				if(d4==d1&&d2==d3){
						System.out.println(number+"�ǻ�����");
				}else{
						System.out.println(number+"���ǻ�����");
				}
			}
			if(d3!=0){
			System.out.println(number+"��3λ��");
				if(d1==d3){
						System.out.println(number+"�ǻ�����");
				}else{
						System.out.println(number+"���ǻ�����");
				}
			}
			if(d2!=0){
			System.out.println(number+"��2λ��");
				if(d1==d2){
						System.out.println(number+"�ǻ�����");
				}else{
						System.out.println(number+"���ǻ�����");
				}
			}
			else if(d1!=0){
				System.out.println(number+"��1λ��");
				System.out.println(number+"�ǻ�����");
			}
			else{
				System.out.println(number+"����1��9999֮��");
			}
		}
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	