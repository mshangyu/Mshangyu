package Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 需求：给你一个user.txt文件，我们不知道里面有什么，但是我知道是键值对形式的数据。
 * 请写一个程序，判断是否有键的值为“lisi”，如果有，则修改值为100
 * 分析：1、把user.txt中的数据加载到properties中，
 * 2、遍历properties 集合
 * 3、得到每一个键进行判断，是否有lisi 如果是，就修改值为100
 * 4、把properties集合中的数据保存到user.txt中
 * 
 * */
public class PropertiesTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//1、把user.txt中的数据加载到properties中，
		Properties prop=new Properties();
		prop.load(new FileReader("user.txt"));
		
		//2、遍历properties 集合
		Set<String> set=prop.stringPropertyNames();
		for (String key : set) {
			if("lisi".equals(key)){
				prop.setProperty("lisi", String.valueOf(100));
				break;
			}
		}
		//4、把properties集合中的数据保存到user.txt中
		prop.store(new FileWriter("user.txt"), null);
		
	}

}
