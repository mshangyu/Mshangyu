package ����¼���Լ�ת����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * ���󣺰�һ���ı��ļ�������ͨ����׼���ֽ��������ʾ������̨
 * ����Դ�� so.txt--FileReader--BufferedReader
 * Ŀ�ĵأ�System.out---PrintStream---OutputStream
 * 
 * */
public class SystemOutDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br=new BufferedReader(new FileReader("so.txt"));
		
		//��װĿ�ĵ�
		OutputStream os=System.out;
		//��ȡ����һ���ַ��� д���ݵ���һ����׼���ֽ���
		//��ô Ҳ����˵�������е����ַ������� ������Ҫд���ֽ������ݵĵط�  ������
		//����ַ���������ͨ���ַ���д���ֽ����ĵط� ���ܻ᷽��һЩ
		//�ַ���---�ֽ���
		//OutputStreamWriter ���ַ���ͨ���ֽ���������
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		/*
		 * BufferedReader br=new BufferedReader(new FileReader("so.txt"));
		 * BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		 * String line=null;
			while ((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
		 * }
		 * 
		 * 
		 * */
		
		bw.close();
		br.close();

	}

}
