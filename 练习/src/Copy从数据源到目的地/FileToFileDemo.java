package Copy从数据源到目的地;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*数据源  a.txt
 * 目的地  b.txt
 * */
public class FileToFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		
		String line =null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();

	}

}
