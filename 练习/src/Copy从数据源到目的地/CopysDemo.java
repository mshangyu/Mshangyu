package Copy������Դ��Ŀ�ĵ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *�ü���¼������д���ı��ļ���a.txt Ȼ���a.txt������д��b.txt�� ������b.txt������ʾ������̨
 * ��һ�����ƣ�����ԴSystem.in Ŀ�ĵ� a.txt
 * �ڶ������ƣ�����Դa.txt Ŀ�ĵ� b.txt
 * ���������� :����Դ b.txt  Ŀ�ĵ� System.out
 * */
public class CopysDemo {
	public static void main(String[] args) throws IOException {
	//��һ����
		BufferedReader br =BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=BufferedWriter(new FileWriter("a.txt"));
		
		String line=null;
		while ((line=br.readLine())!=null) {
			if ("over".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
		
		//�ڶ���
		BufferedReader br2 =new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw2=new BufferedWriter(new FileWriter("b.txt"));
		
		String line2 =null;
		while ((line=br2.readLine())!=null) {
			bw2.write(line);
			bw2.newLine();
			bw2.flush();
		}
		
		bw2.close();
		br2.close();
		
		//������
		BufferedReader br3=new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw3=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line3=null;
		while ((line3=br3.readLine())!=null) {
			bw3.write(line);
			bw3.newLine();
			bw3.flush();
		}
		
		bw3.close();
		br3.close();
		
	}

	private static java.io.BufferedReader BufferedReader(
			InputStreamReader inputStreamReader) {
		// TODO Auto-generated method stub
		return null;
	}

	private static BufferedWriter BufferedWriter(FileWriter fileWriter) {
		// TODO Auto-generated method stub
		return null;
	}

	private static BufferedWriter BufferedReader(
			FileWriter fileWriter) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
