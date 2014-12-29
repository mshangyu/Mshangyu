package Copy从数据源到目的地;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*需求：给出了names.txt 请写一个程序 每次运行时随机获取一个人的名称
 * 分析：
 * 把文件中的数据存储到集合中
 * 从集合中随机产生数据
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
		
		System.out.println("这个幸运的人是："+array.get(index));

	}

}
