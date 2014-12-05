import java.util.*;
public class Test37{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的成绩");
		int score=in.nextInt();
		if(score>=90){
			System.out.println("优秀");
		}else if(score>=80){
			System.out.println("良好");
		}else if(score>=60){
			System.out.println("中等");
		}else {
			System.out.println("不及格");
		}
	}
}