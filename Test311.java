//ʲô�����ꣿ�����ܹ���4����&&���ܱ�100����||�ܱ�400���������Ϊ����
import java.util.*;
public class Test311{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("���������");
		int year=in.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"��һ������");
		}else{
			System.out.println(year+"��һ��ƽ��");
		}
	}
}