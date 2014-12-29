package File文件;
/*d:\\aaa\\bbb\\ccc仅仅表示一种路径
 * file类的构造方法：
 */
import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//方式一
		File file=new File("d:\\a.txt");
		//方式二
		File file2=new File("d:\\","a.txt");
		
		//方式三
		File file3=new File("d:\\");
		File file4=new File("a.txt");

	}

}
