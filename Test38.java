//Ƕ��if�ṹ
import java.util.*;
public class Test38{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ա��ǣ�����/Ů��");
		String sex=in.next();
		if(sex.equals("��")){
			System.out.println("��������Ƕ��٣�");
			int age=in.nextInt();
			if(age>=18){
				System.out.println("�����˰�");
			}else{
				System.out.println("���Ǹ�δ����İ�");
			}
		}else{
			System.out.println("ԭ���Ǹ�Ů�İ�");
		}
	}
}