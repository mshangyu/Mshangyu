package IO�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*����ͼƬ��
 * 
 * ����Դ��  E:\\����.jpg----FileInputStream
 * Ŀ�ĵأ� mn.jpg---------FileOutputStream
 * */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("e:\\����.jpg");
		FileOutputStream fos=new FileOutputStream("mn.jpg");
		
		int by=0;
		while ((by=fis.read())!=-1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}

}
