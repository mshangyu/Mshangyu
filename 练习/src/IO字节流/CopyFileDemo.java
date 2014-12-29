package IO字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

/*需求：把项目路径下的FileOutPutStreamDemo.java复制到项目路径下的Copy.java中
 * 左边：一次一个字节
 * 右边：一次一个字节数组
 * 
 * 数据源：FileOutPutStreamDemo.java -----FileInputStream
 * 
 * 目的地：Copy.java   -------------------FileOutputStream
 * 
 * */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源：
		FileInputStream fis=new FileInputStream("FileOutPutDStreamDemo.java");
		//封装目的地：
		FileOutputStream fos=new FileOutputStream("Copy.java");
		
		//一次读写一个字节
//		int by=0;
//		while ((by=fis.read())!=-1) {
//			fos.write(by);
//		}
		
		//一次读写一个字节数组
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}

}
