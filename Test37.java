import java.util.*;
public class Test37{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������ĳɼ�");
		int score=in.nextInt();
		if(score>=90){
			System.out.println("����");
		}else if(score>=80){
			System.out.println("����");
		}else if(score>=60){
			System.out.println("�е�");
		}else {
			System.out.println("������");
		}
	}
}