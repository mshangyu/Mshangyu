package ����¼���Լ�ת����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ����¼������д���ı��ļ�
 * ����¼�����ݲ�ʹ��Scanner��װ��Ķ�����Ҫ��ֱ��ʹ��System��in����
 * 
 * ����Դ��
 *  System.in--InputStream--InputStreamReader--BufferedReader
 *  
 * 
 * Ŀ�ĵأ�
 * in.txt------FileWriter-----BufferedWriter
 * 
 * ת������   InputStreamReader
 * 		   OutputStreamWriter ���ַ���ͨ���ֽ���������
 * */
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		
		//��װ����Դ
		InputStream is=System.in;//��̬
		System.out.println(is);
		
		//��װĿ�ĵ�
		BufferedWriter bw=new BufferedWriter(new FileWriter("in.txt"));
		//is������һ���ֽ�������ÿ��ֻ�ܶ�ȡһ���ֽ�����
		//����ڿ���̨д�����Ӣ�Ļ������� �ַ�  û������
		//�������д�����һ�������������ַ� �ͻ᲻����
		//����Ӧ�������ܲ�����һ���ַ����������������������ַ�����ͨ���ֽ�������
		//�뵽���� ���Ǿͳ�����һ��
		//BufferedReader br=new BufferedReader(is);
		//ͨ���鿴API ���Ƿ��� BufferedReaderֻ������ַ������и�Ч�Ĳ���
		//����������һ���ֽ��� ����ֱ������ʹ��
		//��ô���ָ���ô���أ�
		//InputStreamReader ���ֽ���ͨ���ַ���������
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		
		String line=null;
		while ((line=br.readLine())!=null) {
			if ("over".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		/*��׼�ļ���¼��������
		 * BufferedWriter bw=new BufferedWriter(new FileWriter("in.txt"));
		*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		*String line=null;
		while ((line=br.readLine())!=null) {
			if ("over".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		*/
		//�ͷ���Դ
		bw.close();
		br.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
