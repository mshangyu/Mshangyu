package 键盘录入以及转换流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*数据源： 键盘录入----Scanner
 * 目的地： sc.txt---FileWriter-----BufferedWriter
 * 
 * 注意： 键盘录入的数据想要结束 必须自己给出判断
 * */
public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		Scanner sc=new Scanner(System.in);
		
		//封装目的地
		BufferedWriter bw=new BufferedWriter(new FileWriter("sc.txt"));
		
		//读写操作
		String line=null;
		while ((line=sc.nextLine())!=null) {
			bw.write(line);
			if ("over".equals(line)) {
				break;
			}
			
			bw.newLine();
			bw.flush();
		}
		
		
		
		//释放资源
		bw.close();
		sc.close();
	}

}
