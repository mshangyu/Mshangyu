package 键盘录入以及转换流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 需求：把一个文本文件的数据通过标准的字节输出流显示到控制台
 * 数据源： so.txt--FileReader--BufferedReader
 * 目的地：System.out---PrintStream---OutputStream
 * 
 * */
public class SystemOutDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br=new BufferedReader(new FileReader("so.txt"));
		
		//封装目的地
		OutputStream os=System.out;
		//读取的是一个字符流 写数据的是一个标准的字节流
		//那么 也就是说我现在有的是字符流数据 而最终要写到字节流数据的地方  不方便
		//如果字符流的数据通过字符流写到字节流的地方 可能会方便一些
		//字符流---字节流
		//OutputStreamWriter 是字符流通向字节流的桥梁
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		/*
		 * BufferedReader br=new BufferedReader(new FileReader("so.txt"));
		 * BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		 * String line=null;
			while ((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
		 * }
		 * 
		 * 
		 * */
		
		bw.close();
		br.close();

	}

}
