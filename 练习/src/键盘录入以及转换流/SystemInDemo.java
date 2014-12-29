package 键盘录入以及转换流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 键盘录入数据写入文本文件
 * 键盘录入数据不使用Scanner包装后的东西，要求直接使用System。in来做
 * 
 * 数据源：
 *  System.in--InputStream--InputStreamReader--BufferedReader
 *  
 * 
 * 目的地：
 * in.txt------FileWriter-----BufferedWriter
 * 
 * 转换流：   InputStreamReader
 * 		   OutputStreamWriter 是字符流通向字节流的桥梁
 * */
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		
		//封装数据源
		InputStream is=System.in;//多态
		System.out.println(is);
		
		//封装目的地
		BufferedWriter bw=new BufferedWriter(new FileWriter("in.txt"));
		//is对象是一个字节流对象，每次只能读取一个字节数据
		//如果在控制台写入的是英文或者数字 字符  没有问题
		//但是如果写入的是一个中文这样的字符 就会不方便
		//我们应该想想能不能用一个字符流来做这个动作，而这个字符流是通过字节流来的
		//想到这里 我们就尝试了一下
		//BufferedReader br=new BufferedReader(is);
		//通过查看API 我们发现 BufferedReader只能针对字符流进行高效的操作
		//而你现在是一个字节流 不能直接这样使用
		//那么，又该怎么办呢？
		//InputStreamReader 是字节流通向字符流的桥梁
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		
		String line=null;
		while ((line=br.readLine())!=null) {
			if ("over".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		/*标准的键盘录入输入流
		 * BufferedWriter bw=new BufferedWriter(new FileWriter("in.txt"));
		*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		*String line=null;
		while ((line=br.readLine())!=null) {
			if ("over".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		*/
		//释放资源
		bw.close();
		br.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
