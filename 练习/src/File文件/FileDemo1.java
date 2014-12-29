/*创建文件public boolean creatNewFile()：
 * 创建文件夹：public boolean mkdir():如果文件夹存在 就不创建 否则，创建
 *          public boolean mkdirs（）
 *   盘符的路径：
 *   		如果一个路径以盘符开始，绝对路径
 *   		如果一个路径不以盘符开始，相对路径，默认相对于项目而言
 *   
 * */

package File文件;
import java.io.File;
import java.io.IOException;
public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		//创建文件对象
		File file=new File("e:\\a.txt");
		System.out.println("creatNewFile:"+file.createNewFile());
		
		//创建文件对象
		File file2=new File("a.txt");
		System.out.println("creatNewFile:"+file2.createNewFile());
		
		//创建文件对象
		File file3=new File("aaa");
		System.out.println("mdkir:"+file3.mkdir());
		
		//需求：我要在项目路径下的bbb路径文件夹中创建一个b.txt文件
		File file4=new File("bbb");
		File file5=new File("bbb\\b.txt");
		System.out.println("mkdir:"+file4.mkdir());
		System.out.println("creatNewFile:"+file5.createNewFile());
		
		//需求我要在项目路径下创建文件夹
		/*方式一：先创建ccc 在创建ddd 最后在创建一个eee
		 * 方式二：使用public boolean mkdirs（）
		 * */
		File file6=new File("ccc\\ddd\\eee");
		System.out.println("mkdirs:"+file6.mkdirs());
		
		
		//看下面的这个例子
		//一定得记住你要创建的是文件还是文件夹
		File file7=new File("hello.txt");
		System.out.println("creatNewFile:"+file7.mkdir());
	}

}
