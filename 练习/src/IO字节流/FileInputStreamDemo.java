package IO字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*字节输入流操作步骤：
 * 				创建字节输入流对象
 * 				调用read方法，并显示在控制台
 * 				释放资源
 * 
 * 
 * */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fis.txt");
		//读取操作
		//一次读取一个字节
//		int by=0;
//		while ((by=fis.read())!=-1) {
//			System.out.println((char)by);
//		}
//		System.out.println("------------");
//		
		//一次读取一个字节数组
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		
		//释放资源
		fis.close();

	}

}
