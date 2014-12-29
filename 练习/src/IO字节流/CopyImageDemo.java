package IO字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*复制图片：
 * 
 * 数据源：  E:\\考拉.jpg----FileInputStream
 * 目的地： mn.jpg---------FileOutputStream
 * */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("e:\\考拉.jpg");
		FileOutputStream fos=new FileOutputStream("mn.jpg");
		
		int by=0;
		while ((by=fis.read())!=-1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}

}
