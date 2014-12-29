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
 * 使用特有功能 
 * 
 * */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br=new BufferedReader(new FileReader("BufferedReaderDemo.java"));
		//封装目的地
		BufferedWriter bw=new BufferedWriter(new FileWriter("Copy.java2"));
		//读写功能
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);//这样做没有换行  需要我们手动的换行 手动的刷新
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}

}
