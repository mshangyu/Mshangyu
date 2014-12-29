package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//print()方法 刷新 打印 并且自动换行
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		//创建对象
		PrintWriter pw =new PrintWriter("pw2.txt");
		pw.print(10);
		pw.print(true);
		pw.print(12.5);
	}
}
