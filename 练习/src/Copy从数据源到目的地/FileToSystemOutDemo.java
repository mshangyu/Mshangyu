package Copy从数据源到目的地;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*数据源：a.txt
 * 目的地：System.out
 * 
 * */
public class FileToSystemOutDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
	}

}
