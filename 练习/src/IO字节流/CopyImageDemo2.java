package IO字节流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*需求：用字节缓冲区流 复制图片
 *  数据源：mn.jpg
 *  目的地：copy.jpg
 * 
 * BufferedInputStream
 * BufferedOutputStream
 * 
 * */
public class CopyImageDemo2 {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("mn.jpg"));
		//封装目的地
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		
		//读写数据
		//一次读写一个字节
		int ch=0;
		while ((ch=bis.read())!=-1) {
			bos.write(ch);
		}
		//一次读写一个字节数组
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		
		
		//释放资源
		bos.close();
		bis.close();
		
	}

}
