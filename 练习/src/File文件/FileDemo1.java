/*�����ļ�public boolean creatNewFile()��
 * �����ļ��У�public boolean mkdir():����ļ��д��� �Ͳ����� ���򣬴���
 *          public boolean mkdirs����
 *   �̷���·����
 *   		���һ��·�����̷���ʼ������·��
 *   		���һ��·�������̷���ʼ�����·����Ĭ���������Ŀ����
 *   
 * */

package File�ļ�;
import java.io.File;
import java.io.IOException;
public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		//�����ļ�����
		File file=new File("e:\\a.txt");
		System.out.println("creatNewFile:"+file.createNewFile());
		
		//�����ļ�����
		File file2=new File("a.txt");
		System.out.println("creatNewFile:"+file2.createNewFile());
		
		//�����ļ�����
		File file3=new File("aaa");
		System.out.println("mdkir:"+file3.mkdir());
		
		//������Ҫ����Ŀ·���µ�bbb·���ļ����д���һ��b.txt�ļ�
		File file4=new File("bbb");
		File file5=new File("bbb\\b.txt");
		System.out.println("mkdir:"+file4.mkdir());
		System.out.println("creatNewFile:"+file5.createNewFile());
		
		//������Ҫ����Ŀ·���´����ļ���
		/*��ʽһ���ȴ���ccc �ڴ���ddd ����ڴ���һ��eee
		 * ��ʽ����ʹ��public boolean mkdirs����
		 * */
		File file6=new File("ccc\\ddd\\eee");
		System.out.println("mkdirs:"+file6.mkdirs());
		
		
		//��������������
		//һ���ü�ס��Ҫ���������ļ������ļ���
		File file7=new File("hello.txt");
		System.out.println("creatNewFile:"+file7.mkdir());
	}

}
