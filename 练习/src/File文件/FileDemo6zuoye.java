//��ȡd��Ŀ¼������.jpg��β���ļ������ơ�
/*1����װd��Ŀ¼
 * 2����ȡ��Ŀ¼�������ļ������ļ��е�file����
 * 3������file���飬��ȡ��ÿһ��file����
 * 4���ж��Ƿ����ļ�
 * 				�� �����ж��Ƿ�����.jpg��β��
 * 					�� �������
 * 					�� ��������
 * 
 * 
 * */
package File�ļ�;

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
