
package Copy从数据源到目的地;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import IO字节流.FileOutPutDStreamDemo;

/*需求： 把一个文件夹下面的所有文件 没有其他的文件夹了 复制到另外一个文件夹中
 * 分析：
 * 1、封装目录
 * 2、 获取这个目录下所有的file【】数组
 * 3、遍历这个file数组 获取得到每一个file对象
 * 4、复制该file即可
 * 			d:\\demo\\a.txt
 * 			d:\\test\\a.txt
 * 
 * 
 * */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//1、封装目录
		File srcFolder=new File("d:\\demo");
		//2、 获取这个目录下所有的file【】数组
		File[] fileArray=srcFolder.listFiles();
		//封装目的地文件夹
		File destFolder=new File("d:\\test");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		//3、遍历这个file数组 获取得到每一个file对象
		for (File file : fileArray) {
			String name=file.getName();
			File destFile=new File(destFolder,name);
			Copy(file,destFile);
		}
	}

	private static void Copy(File file, File destFile) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
	}

}
