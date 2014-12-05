import java.util.*;
public class Test310{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number=in.nextInt();
		if(number==0){
			System.out.println("请不要输出0好吗，我只计算正整数里面的偶数");
		}else if(number%2==0){
			System.out.println(number+"是一个偶数");
		}else{
			System.out.println(number+"是一个奇数");
		}
	}
}