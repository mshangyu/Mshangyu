
/*��ȡd��Ŀ¼�������ԡ�jpg��β���ļ�������
 * 1���Ȼ�ȡ���е� Ȼ�������ʱ���ж�
 * 2�����жϣ����������ķŵ������� Ȼ��ֱ�ӱ�������
 * 
 * ������1�� ��װd�����Ŀ¼
 * 		2����ȡ����Ŀ¼�µ������ļ������ļ��е�String���� �����ʱ��Ҫ�����ж�
 * 		3������string ���� ��ȡ��ÿһ��string����
 * 		4��������ƾͿ�����
 * 		
 * */
package File�ļ�;

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
