//�߼���ȡ���ܣ�
//public String[] list()
//public File[] listFiles()
package File�ļ�;

import java.io.File;

public class FileDemo5 {
	public static void main(String[] args) {
		//ָ��Ŀ�꣺
		File file=new File("e:\\");
		
		//�ַ�������
		String[] str=file.list();
		for (String s : str) {
			System.out.println(s);
		}
		
		//�ļ�����
		File[] files=file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
			System.out.println(file2.getName());
		}
		
	}

}
