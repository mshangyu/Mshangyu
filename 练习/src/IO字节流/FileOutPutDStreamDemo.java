package IO�ֽ���;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/*�ֽ����������裺
 * 			�����ֽ����������
 * 			���ö����write����
 * 			�ͷ���Դ
 * 
 * 
 * */
public class FileOutPutDStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.txt");
		fos.write(97);
		fos.write("helloworld".getBytes());
		fos.write("java".getBytes(),0,3);
		
		fos.close();

	}

}
