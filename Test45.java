import java.util.*;
public class Test45{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学生的人数");
		int person=in.nextInt();
		int i=1;
		int sum=0;
		while(i<=person){
			System.out.println("请输入第"+i+"学生的成绩");
			int chengji=in.nextInt();
			 sum=sum+chengji;
			i++;


		}
		int avg=sum/person;
		System.out.println(person+"个人的平均成绩为："+avg);

	}




}