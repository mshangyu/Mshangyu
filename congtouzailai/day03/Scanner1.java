import java.util.*;
public class Scanner1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int b=sc.nextInt();
		System.out.println("���������������");
		int c=sc.nextInt();
		
		int d=(a>b)?a:b;
		int max=(d>c)?d:c;
		System.out.println(max);
	}
}