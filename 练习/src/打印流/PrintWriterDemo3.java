package ��ӡ��;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo3 {

	/*println()
	 * Ҫ�������Զ�ˢ�ºͻ��У�������ù��������fileWriter����FileOutputStream����ʽ��
	 */
	public static void main(String[] args) throws IOException {
		//��������
		PrintWriter pw=new PrintWriter(new FileWriter("pw3.txt"),true);
		 
		pw.println(100);
		pw.println(true);
		pw.println("hello");
		
		pw.close();
	}

}
