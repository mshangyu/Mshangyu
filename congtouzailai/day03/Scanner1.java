import java.util.*;
public class Scanner1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据");
		int b=sc.nextInt();
		System.out.println("请输入第三个数据");
		int c=sc.nextInt();
		
		int d=(a>b)?a:b;
		int max=(d>c)?d:c;
		System.out.println(max);
	}
}