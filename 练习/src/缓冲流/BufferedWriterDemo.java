package 缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*IO:
 * 	低级流(基本流)：FileReader,FileWriter,FileInputStream,FileOutputStream
 * 高级流（处理流）：针对基本的流进行进一步的操作
 * 
 * BufferedWriter的构造方法：
 * 		BufferedWriter（Writer out）
 * 为什么，参数传递的是一个writer？
 * 		因为buffered仅仅是提供高效的操作，真正的读写还得需要基本的流来完成
 * */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		Writer w=new FileWriter("bw.txt");
		BufferedWriter bw=new BufferedWriter(w);
		
		bw.write("hello\r\n");
		bw.write("world\r\n");
		bw.write("java\r\n");
		
		bw.flush();
		
		bw.close();

	}

}
