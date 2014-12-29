package Copy从数据源到目的地;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*数据源：a.txt
 * 目的地： ArrayList<String>
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
		
		//遍历集合
		for (String s : array) {
			System.out.println(s);
		}
	}

}
