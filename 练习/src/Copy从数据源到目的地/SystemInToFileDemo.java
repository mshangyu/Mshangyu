package Copy������Դ��Ŀ�ĵ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*����Դ  System.in
 * Ŀ�ĵ�  a.txt
 * */
public class SystemInToFileDemo {
	public static void main(String[] args) throws IOException {
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
	}

	private static BufferedReader BufferedReader(
			InputStreamReader inputStreamReader) {
		// TODO Auto-generated method stub
		return null;
	}

	private static BufferedWriter BufferedWriter(FileWriter fileWriter) {
		// TODO Auto-generated method stub
		return null;
	}

}
