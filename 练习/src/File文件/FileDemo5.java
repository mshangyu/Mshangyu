//高级获取功能：
//public String[] list()
//public File[] listFiles()
package File文件;

import java.io.File;

public class FileDemo5 {
	public static void main(String[] args) {
		//指定目标：
		File file=new File("e:\\");
		
		//字符串对象
		String[] str=file.list();
		for (String s : str) {
			System.out.println(s);
		}
		
		//文件对象
		File[] files=file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
			System.out.println(file2.getName());
		}
		
	}

}
