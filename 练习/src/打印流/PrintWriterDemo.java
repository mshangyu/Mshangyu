package ��ӡ��;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*��ӡ����ֻ��д���ݵ�û�ж�ȡ���ݵģ�ֻ�в���Ŀ�ĵصģ�û�в�������Դ��
 * PrintStream:��ӡ�ֽ���
 * PrintWriter:��ӡ�ַ���
 * 
 * �ص㣺1���������ļ���д�������͵����ݡ�
 * 2������ʵ���Զ�ˢ�£�����Ҫ�������������ң�ֻ���ڵ���println����������Ч
 * 3����ӡ��Ҳ�ǿ���ֱ�Ӳ����ļ���
 * 			���⣺��Щ������ֱ�Ӳ����ļ���
 * 			�����췽�����������ͬʱ����File��String���͵Ĺ����������ô�������Ϳ��Բ����ļ���
 * 
 * 
 * */
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
	// 3����ӡ��Ҳ�ǿ���ֱ�Ӳ����ļ���
		PrintWriter pw=new PrintWriter("pw.txt");
		
		//����Writer�����ʹ��
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		pw.flush();
		
		pw.close();
	}
}
