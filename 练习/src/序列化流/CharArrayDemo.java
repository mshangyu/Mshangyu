package ���л���;
//����һ��ָ���ļ���Ҳ����ֱ�������ڴ������������  �����û����
import java.awt.CardLayout;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
	public static void main(String[] args) throws IOException {
		CharArrayWriter caw=new CharArrayWriter();
		caw.write("helloworld");
		caw.close();
		
		char[] chs=caw.toCharArray();
		
		CharArrayReader car=new CharArrayReader(chs);
		int ch=0;
		while ((ch=car.read())!=-1) {
			System.out.println((char)ch);
		}
		car.close();
	}

}
