package ����¼���Լ�ת����;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*����Դ�� ����¼��----Scanner
 * Ŀ�ĵأ� sc.txt---FileWriter-----BufferedWriter
 * 
 * ע�⣺ ����¼���������Ҫ���� �����Լ������ж�
 * */
public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		Scanner sc=new Scanner(System.in);
		
		//��װĿ�ĵ�
		BufferedWriter bw=new BufferedWriter(new FileWriter("sc.txt"));
		
		//��д����
		String line=null;
		while ((line=sc.nextLine())!=null) {
			bw.write(line);
			if ("over".equals(line)) {
				break;
			}
			
			bw.newLine();
			bw.flush();
		}
		
		
		
		//�ͷ���Դ
		bw.close();
		sc.close();
	}

}
