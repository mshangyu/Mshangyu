
import java.util.ArrayList;
import java.util.Collection;

public class CollationDemo{
	public static void main(String[] args){
		//Ĭ������ת����
		CollationDemo c=new CollationDemo();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//object[] toArray() �Ѽ���תΪ����
		Object[] objs=c.toArray();
		
		for(int x=0;x<objs.length;x++){
			//ѭ������
			System.out.println(objs[x]);
			//��Ҫ���ÿ���ַ����ĳ���
			//������Ҫ����ת��
			String s=(String)objs[x];
			//����ֻ������ת���� ��������ַ������͵ĳ���
			System.out.println(s+"---"+s.length());
		}
	}
}