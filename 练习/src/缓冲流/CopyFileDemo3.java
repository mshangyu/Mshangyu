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
 * ʹ�����й��� 
 * 
 * */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br=new BufferedReader(new FileReader("BufferedReaderDemo.java"));
		//��װĿ�ĵ�
		BufferedWriter bw=new BufferedWriter(new FileWriter("Copy.java2"));
		//��д����
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);//������û�л���  ��Ҫ�����ֶ��Ļ��� �ֶ���ˢ��
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}

}
