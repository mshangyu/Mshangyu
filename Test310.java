import java.util.*;
public class Test310{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ������");
		int number=in.nextInt();
		if(number==0){
			System.out.println("�벻Ҫ���0������ֻ���������������ż��");
		}else if(number%2==0){
			System.out.println(number+"��һ��ż��");
		}else{
			System.out.println(number+"��һ������");
		}
	}
}