import java.util.*;
public class Test45{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("������ѧ��������");
		int person=in.nextInt();
		int i=1;
		int sum=0;
		while(i<=person){
			System.out.println("�������"+i+"ѧ���ĳɼ�");
			int chengji=in.nextInt();
			 sum=sum+chengji;
			i++;


		}
		int avg=sum/person;
		System.out.println(person+"���˵�ƽ���ɼ�Ϊ��"+avg);

	}




}