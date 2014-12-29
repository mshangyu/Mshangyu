package 缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.omg.CORBA.PUBLIC_MEMBER;

/*复制数据：是否是文本文件
 * 		是   8种
 * 			字节流： 4种
 * 			字符流：4种
 * 			想操作方便吗？ 想 4种  想高效吗？ 还剩下2种
 * 		否  4种
 * 			想高效吗？
 * 				想 缓冲流的第二种
 * 如果不知道 就用字节流
 * 
 * 字符缓冲流的特有功能： 
 * BufferedWriter:
 * 			public void newLine() 根据系统来决定不同的换行符
 * BufferedReader:
 * 			public String readLine(): 一次读取一行数据
 * 
 * */
public class BufferedStreamDemo特有功能 {
	public static void main(String[] args) throws IOException {
		//Writer();
		read();
	}

	private static void read() throws IOException {
		//創建字符緩衝流對象
		BufferedReader br =new BufferedReader(new FileReader("bw2.txt"));
		
		//public String readLine();
//		String line=br.readLine();
//		System.out.println(line);
//		
//		line=br.readLine();
//		System.out.println(line);
//		
//		line=br.readLine();
//		System.out.println(line);
//		
//		line=br.readLine();
//		System.out.println(line);
		
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
	}

	private static void Writer() throws IOException {
		//创建字符缓冲流的对象
				BufferedWriter bw=new BufferedWriter(new FileWriter("bw2.txt"));
				
				bw.write("hello");
				bw.newLine();
				bw.flush();
				
				bw.write("world");
				bw.newLine();
				bw.flush();
				
				bw.write("java");
				bw.newLine();
				bw.flush();
				
				bw.close();
		
	}

}
