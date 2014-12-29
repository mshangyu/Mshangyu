//判断功能
/*public boolean canRead() canWrite() isHidden() isDirectory() isfile() existe()
 * 
 * 将来做这些判断的是文件 而不是文件夹
 * */
package File文件;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo4 {
	public static void main(String[] args) {
		File file=new File("a.txt");
		
		System.out.println("canRead:"+file.canRead());
		System.out.println("canWrite:"+file.canWrite());
		System.out.println("isHidden:"+file.isHidden());
		System.out.println("isDirectory:"+file.isDirectory());
		System.out.println("isFile:"+file.isFile());
		System.out.println("exists:"+file.exists());
		System.out.println("lastModified:"+file.lastModified());
		
		Date d =new Date(1408692291364L);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s=sdf.format(d);
		System.out.println(s);
	}

}
