package IO字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fis2.txt");
		//调用方法 
		//一次性读取一个
//		int by=0;
//		while ((by=fis.read())!=-1) {
//			System.out.println((char)by);
//		}
		//一次性读取一组
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=fis.read())!=-1) {
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
	}

}
