import java.util.*;
public class Test34{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的java成绩");
		int java=in.nextInt();
		System.out.println("请输入你的SQL成绩");
		int sql=in.nextInt();
		if(!(java>90)&&sql>90){
			System.out.println("奖励你100块");
		}
		System.out.println("测试程序呢");
	}
}