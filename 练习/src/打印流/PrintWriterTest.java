package ��ӡ��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br=new BufferedReader(new FileReader("IOEncodeDemo.java"));
		PrintWriter pw=new PrintWriter(new FileWriter("Copy.java"));
		String line=null;
		while ((line=br.readLine())!=null) {
			pw.println(line);
		}
		pw.close();
	}

}
