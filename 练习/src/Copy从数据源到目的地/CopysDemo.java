package Copy从数据源到目的地;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *用键盘录入数据写到文本文件中a.txt 然后把a.txt的数据写到b.txt中 ，最后把b.txt数据显示到控制台
 * 第一个复制：数据源System.in 目的地 a.txt
 * 第二个复制：数据源a.txt 目的地 b.txt
 * 第三个复制 :数据源 b.txt  目的地 System.out
 * */
public class CopysDemo {
	public static void main(String[] args) throws IOException {
	//第一步：
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
		
		//第二步
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
		
		//第三步
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
