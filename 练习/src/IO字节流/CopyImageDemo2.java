package IO�ֽ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*�������ֽڻ������� ����ͼƬ
 *  ����Դ��mn.jpg
 *  Ŀ�ĵأ�copy.jpg
 * 
 * BufferedInputStream
 * BufferedOutputStream
 * 
 * */
public class CopyImageDemo2 {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("mn.jpg"));
		//��װĿ�ĵ�
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		
		//��д����
		//һ�ζ�дһ���ֽ�
		int ch=0;
		while ((ch=bis.read())!=-1) {
			bos.write(ch);
		}
		//һ�ζ�дһ���ֽ�����
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		
		
		//�ͷ���Դ
		bos.close();
		bis.close();
		
	}

}
