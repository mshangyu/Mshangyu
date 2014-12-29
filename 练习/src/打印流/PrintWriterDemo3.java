package 打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo3 {

	/*println()
	 * 要想启动自动刷新和换行，必须采用构造参数：fileWriter或者FileOutputStream的形式。
	 */
	public static void main(String[] args) throws IOException {
		//创建对象
		PrintWriter pw=new PrintWriter(new FileWriter("pw3.txt"),true);
		 
		pw.println(100);
		pw.println(true);
		pw.println("hello");
		
		pw.close();
	}

}
