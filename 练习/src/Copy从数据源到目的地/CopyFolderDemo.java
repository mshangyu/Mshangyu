
package Copy������Դ��Ŀ�ĵ�;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import IO�ֽ���.FileOutPutDStreamDemo;

/*���� ��һ���ļ�������������ļ� û���������ļ����� ���Ƶ�����һ���ļ�����
 * ������
 * 1����װĿ¼
 * 2�� ��ȡ���Ŀ¼�����е�file��������
 * 3���������file���� ��ȡ�õ�ÿһ��file����
 * 4�����Ƹ�file����
 * 			d:\\demo\\a.txt
 * 			d:\\test\\a.txt
 * 
 * 
 * */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//1����װĿ¼
		File srcFolder=new File("d:\\demo");
		//2�� ��ȡ���Ŀ¼�����е�file��������
		File[] fileArray=srcFolder.listFiles();
		//��װĿ�ĵ��ļ���
		File destFolder=new File("d:\\test");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		//3���������file���� ��ȡ�õ�ÿһ��file����
		for (File file : fileArray) {
			String name=file.getName();
			File destFile=new File(destFolder,name);
			Copy(file,destFile);
		}
	}

	private static void Copy(File file, File destFile) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
	}

}
