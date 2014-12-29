
/*获取d盘目录下所有以。jpg结尾的文件的名称
 * 1、先获取所有的 然后遍历的时候判断
 * 2、先判断：满足条件的放到数组中 然后直接遍历即可
 * 
 * 分析：1、 封装d盘这个目录
 * 		2、获取到该目录下的所有文件或者文件夹的String数组 在这个时候要进行判断
 * 		3、遍历string 数组 获取到每一个string对象
 * 		4、输出名称就可以了
 * 		
 * */
package File文件;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo6 {
	public static void main(String[] args) {
		File srcfile =new File("d:\\");
		
		String[] strarray=srcfile.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir+name);
//				File file =new File(dir,name);
//				boolean flag=file.isHidden();
//				boolean flag2 =name.endsWith(".dat");
//				return flag&&flag2;
				return new File(dir,name).isFile()&&name.endsWith(".jpg");
			}
		});
		
		
		for (String str : strarray) {
			System.out.println(str);
		}
	}

}
