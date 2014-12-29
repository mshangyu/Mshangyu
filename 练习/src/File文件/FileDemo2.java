/*删除功能
 * 
 * */

package File文件;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//我要删除a.txt文件
		File file =new File("a.txt");
		System.out.println("delete:"+file.delete());
		
		//需求：我要删除aaa
		File file2=new File("aaa");
		System.out.println("delete:"+file2.delete());
		
		//需求：我要删除b.txt
		File file3=new File("bbb\\b.txt");
		System.out.println("delete:"+file3.delete());
		
		//需求：我要删除ddd
		File file4=new File("ccc\\ddd");
		System.out.println("delete:"+file4.delete());
		
		

	}

}
