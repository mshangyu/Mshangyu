//什么是闰年？此年能够被4整除&&不能被100整除||能被400整除的年份为闰年
import java.util.*;
public class Test311{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入年份");
		int year=in.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"是一个闰年");
		}else{
			System.out.println(year+"是一个平年");
		}
	}
}