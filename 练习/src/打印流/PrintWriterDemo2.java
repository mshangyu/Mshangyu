package ��ӡ��;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//print()���� ˢ�� ��ӡ �����Զ�����
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		//��������
		PrintWriter pw =new PrintWriter("pw2.txt");
		pw.print(10);
		pw.print(true);
		pw.print(12.5);
	}
}
