package Copy������Դ��Ŀ�ĵ�;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*����Դ��a.txt
 * Ŀ�ĵأ� ArrayList<String>
 * 
 * */
public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		ArrayList<String> array=new ArrayList<String>();

		String line=null;
		while ((line=br.readLine())!=null) {
			array.add(line);
		}
		br.close();
		
		//��������
		for (String s : array) {
			System.out.println(s);
		}
	}

}
