import java.util.*;
public class Test313{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("---------��ȭ��Ϸ-------");
		System.out.println("���ȭ��1������2��ʯͷ3������");
		int person=in.nextInt();
		int computer=(int)Math.random()*3+1;
		String Marks="ȭͷ";//���Ǹ�����һ�����
		String Marks2="ȭͷ";//���Ǹ�������һ�����
		switch(person){
			case 1:
			Marks="����";
			break;
			case 2:
			Marks="ʯͷ";
			break;
			case 3:
			Marks="��";
			break;
		}
		switch(computer){
			case 1:
			Marks2="����";
			break;
			case 2:
			Marks2="ʯͷ";
			break;
			case 3:
			Marks2="��";
			break;
		}
		if(person==computer){
			System.out.println("������ǣ�"+Marks+"���Գ����ǣ�"+Marks2+"ƽ��");
		}else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
			System.out.println("������ǣ�"+Marks+"���Գ����ǣ�"+Marks2+"������");
		}else{
			System.out.println("������ǣ�"+Marks+"���Գ����ǣ�"+Marks2+"��Ӯ��");
		}
	}
}