package IO字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/*字节流操作步骤：
 * 			创建字节输出流对象
 * 			调用对象的write方法
 * 			释放资源
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
