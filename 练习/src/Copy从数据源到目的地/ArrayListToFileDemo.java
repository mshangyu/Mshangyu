package Copy从数据源到目的地;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 数据源  ArrayList<String>
 * 目的地 a.txt
 * 
 * */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("java");
		array.add("nihao");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
		
		for (String s: array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		
	}

}
