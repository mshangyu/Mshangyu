package Copy������Դ��Ŀ�ĵ�;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*���󣺸�����names.txt ��дһ������ ÿ������ʱ�����ȡһ���˵�����
 * ������
 * ���ļ��е����ݴ洢��������
 * �Ӽ����������������
 * */
public class GetRandomNameDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("names.txt"));
		ArrayList<String> array=new ArrayList<String>();
		
		String line=null;
		while ((line=br.readLine())!=null) {
			array.add(line);
		}
		
		Random r=new Random();
		int index=r.nextInt(array.size());
		
		System.out.println("������˵����ǣ�"+array.get(index));

	}

}
