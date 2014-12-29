package IO�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

/*���󣺰���Ŀ·���µ�FileOutPutStreamDemo.java���Ƶ���Ŀ·���µ�Copy.java��
 * ��ߣ�һ��һ���ֽ�
 * �ұߣ�һ��һ���ֽ�����
 * 
 * ����Դ��FileOutPutStreamDemo.java -----FileInputStream
 * 
 * Ŀ�ĵأ�Copy.java   -------------------FileOutputStream
 * 
 * */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ��
		FileInputStream fis=new FileInputStream("FileOutPutDStreamDemo.java");
		//��װĿ�ĵأ�
		FileOutputStream fos=new FileOutputStream("Copy.java");
		
		//һ�ζ�дһ���ֽ�
//		int by=0;
//		while ((by=fis.read())!=-1) {
//			fos.write(by);
//		}
		
		//һ�ζ�дһ���ֽ�����
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}

}
