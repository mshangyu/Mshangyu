package IO�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*�ֽ��������������裺
 * 				�����ֽ�����������
 * 				����read����������ʾ�ڿ���̨
 * 				�ͷ���Դ
 * 
 * 
 * */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fis.txt");
		//��ȡ����
		//һ�ζ�ȡһ���ֽ�
//		int by=0;
//		while ((by=fis.read())!=-1) {
//			System.out.println((char)by);
//		}
//		System.out.println("------------");
//		
		//һ�ζ�ȡһ���ֽ�����
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		
		//�ͷ���Դ
		fis.close();

	}

}
