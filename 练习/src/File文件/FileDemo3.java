//重命名：
//public boolean renameTo(File dest);
package File文件;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//创建原始路径对象
		File file=new File("a.txt");
		
		//创建重命名后的路径对象：
		//同一个文件夹下：
		//File file2=new File("b.txt");
		//不同文件夹下：
		File file2=new File("e:\\b.txt");
		
		//public boolean renameTo(File dest)
		System.out.println("renameTo"+file.renameTo(file2));
	}

}
