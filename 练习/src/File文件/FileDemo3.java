//��������
//public boolean renameTo(File dest);
package File�ļ�;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//����ԭʼ·������
		File file=new File("a.txt");
		
		//�������������·������
		//ͬһ���ļ����£�
		//File file2=new File("b.txt");
		//��ͬ�ļ����£�
		File file2=new File("e:\\b.txt");
		
		//public boolean renameTo(File dest)
		System.out.println("renameTo"+file.renameTo(file2));
	}

}
