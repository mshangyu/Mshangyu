/*ɾ������
 * 
 * */

package File�ļ�;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//��Ҫɾ��a.txt�ļ�
		File file =new File("a.txt");
		System.out.println("delete:"+file.delete());
		
		//������Ҫɾ��aaa
		File file2=new File("aaa");
		System.out.println("delete:"+file2.delete());
		
		//������Ҫɾ��b.txt
		File file3=new File("bbb\\b.txt");
		System.out.println("delete:"+file3.delete());
		
		//������Ҫɾ��ddd
		File file4=new File("ccc\\ddd");
		System.out.println("delete:"+file4.delete());
		
		

	}

}
