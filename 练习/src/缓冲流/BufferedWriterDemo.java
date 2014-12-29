package ������;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*IO:
 * 	�ͼ���(������)��FileReader,FileWriter,FileInputStream,FileOutputStream
 * �߼�����������������Ի����������н�һ���Ĳ���
 * 
 * BufferedWriter�Ĺ��췽����
 * 		BufferedWriter��Writer out��
 * Ϊʲô���������ݵ���һ��writer��
 * 		��Ϊbuffered�������ṩ��Ч�Ĳ����������Ķ�д������Ҫ�������������
 * */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������
		Writer w=new FileWriter("bw.txt");
		BufferedWriter bw=new BufferedWriter(w);
		
		bw.write("hello\r\n");
		bw.write("world\r\n");
		bw.write("java\r\n");
		
		bw.flush();
		
		bw.close();

	}

}
