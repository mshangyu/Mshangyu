package 缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*需求：用缓冲区流复制文本文件
 *  数据源：BufferedReaderDemo.java
 *  目的地：Copy.java2
 * 左边：一次一个字符数组
 * 右边：一次一个字符
 * 
 * */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br=new BufferedReader(new FileReader("BufferedReaderDemo.java"));
		//封装目的地
		BufferedWriter bw=new BufferedWriter(new FileWriter("Copy.java2"));

		//读写操作
		//一次一个字符
//		int ch=0;
//		while ((ch=br.read())!=-1) {
//			bw.write(ch);
//		}
		//一次一个字符数组
		char[] chs=new char[1024];
		int len=0;
		while ((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		
		
		//释放资源
		bw.close();
		br.close();
		
	}

}
