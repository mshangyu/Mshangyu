package ������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*�����û������������ı��ļ�
 *  ����Դ��BufferedReaderDemo.java
 *  Ŀ�ĵأ�Copy.java2
 * ��ߣ�һ��һ���ַ�����
 * �ұߣ�һ��һ���ַ�
 * 
 * */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br=new BufferedReader(new FileReader("BufferedReaderDemo.java"));
		//��װĿ�ĵ�
		BufferedWriter bw=new BufferedWriter(new FileWriter("Copy.java2"));

		//��д����
		//һ��һ���ַ�
//		int ch=0;
//		while ((ch=br.read())!=-1) {
//			bw.write(ch);
//		}
		//һ��һ���ַ�����
		char[] chs=new char[1024];
		int len=0;
		while ((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		
		
		//�ͷ���Դ
		bw.close();
		br.close();
		
	}

}
