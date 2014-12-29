package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*打印流：只有写数据的没有读取数据的，只有操作目的地的，没有操作数据源的
 * PrintStream:打印字节流
 * PrintWriter:打印字符流
 * 
 * 特点：1、可以往文件中写任意类型的数据。
 * 2、可以实现自动刷新，但是要先启动它，而且，只有在调用println（）方法有效
 * 3、打印流也是可以直接操作文件的
 * 			问题：哪些流可以直接操作文件？
 * 			看构造方法，如果可以同时接受File和String类型的构造参数，那么这种流就可以操作文件。
 * 
 * 
 * */
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
	// 3、打印流也是可以直接操作文件的
		PrintWriter pw=new PrintWriter("pw.txt");
		
		//作為Writer子类的使用
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		pw.flush();
		
		pw.close();
	}
}
