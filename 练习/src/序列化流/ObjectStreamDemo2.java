package ���л���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

/*���󣺰Ѷ�������һ���ķ�ʽ�����������������л�����
 * ���л����Ѷ�������һ���ķ�ʽ������д��ȥ��
 * �����л������ļ��е�����������ݻ�ԭ�ɶ���
 * 
 * ���л���ObjectOutputStream
 * 		public final void writeObject(Object obj)
 *�����л�  ObjectInputStream
 *		public final Object readObject()
 * */
public class ObjectStreamDemo2 {
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
	//	Writer();
		read();

	}
	
	//�����л�
	private static void read() throws ClassNotFoundException, IOException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("oos2.txt"));
		Object obj=ois.readObject();
		ois.close();
		System.out.println(obj);
		
	}

	//���л�
	private static void Writer() throws FileNotFoundException, IOException {
		// �������л�������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"oos2.txt"));

		Person p = new Person("����ϼ", 23);
		oos.writeObject(p);
		oos.close();

	}

}
