package ������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.omg.CORBA.PUBLIC_MEMBER;

/*�������ݣ��Ƿ����ı��ļ�
 * 		��   8��
 * 			�ֽ����� 4��
 * 			�ַ�����4��
 * 			����������� �� 4��  ���Ч�� ��ʣ��2��
 * 		��  4��
 * 			���Ч��
 * 				�� �������ĵڶ���
 * �����֪�� �����ֽ���
 * 
 * �ַ������������й��ܣ� 
 * BufferedWriter:
 * 			public void newLine() ����ϵͳ��������ͬ�Ļ��з�
 * BufferedReader:
 * 			public String readLine(): һ�ζ�ȡһ������
 * 
 * */
public class BufferedStreamDemo���й��� {
	public static void main(String[] args) throws IOException {
		//Writer();
		read();
	}

	private static void read() throws IOException {
		//�����ַ����n������
		BufferedReader br =new BufferedReader(new FileReader("bw2.txt"));
		
		//public String readLine();
//		String line=br.readLine();
//		System.out.println(line);
//		
//		line=br.readLine();
//		System.out.println(line);
//		
//		line=br.readLine();
//		System.out.println(line);
//		
//		line=br.readLine();
//		System.out.println(line);
		
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
	}

	private static void Writer() throws IOException {
		//�����ַ��������Ķ���
				BufferedWriter bw=new BufferedWriter(new FileWriter("bw2.txt"));
				
				bw.write("hello");
				bw.newLine();
				bw.flush();
				
				bw.write("world");
				bw.newLine();
				bw.flush();
				
				bw.write("java");
				bw.newLine();
				bw.flush();
				
				bw.close();
		
	}

}
