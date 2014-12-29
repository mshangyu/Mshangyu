//获取d盘目录下所有.jpg结尾的文件的名称。
/*1、封装d盘目录
 * 2、获取该目录下所有文件或者文件夹的file数组
 * 3、遍历file数组，获取到每一个file对象
 * 4、判断是否是文件
 * 				是 继续判断是否是以.jpg结尾的
 * 					是 输出名称
 * 					否 不搭理它
 * 
 * 
 * */
package File文件;

import java.io.File;

public class FileDemo6zuoye {
	public static void main(String[] args) {
		File srcfile=new File("c:\\");
		
		File[] filearray=srcfile.listFiles();
		
		for (File file : filearray) {
			if (file.isFile()) {
				if (file.getName().endsWith(".txt")) {
					System.out.println(file.getName());
				}
			}
		}

	}

}
