package File�ļ�;
/*d:\\aaa\\bbb\\ccc������ʾһ��·��
 * file��Ĺ��췽����
 */
import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//��ʽһ
		File file=new File("d:\\a.txt");
		//��ʽ��
		File file2=new File("d:\\","a.txt");
		
		//��ʽ��
		File file3=new File("d:\\");
		File file4=new File("a.txt");

	}

}
