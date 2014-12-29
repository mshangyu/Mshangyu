package Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * ���󣺸���һ��user.txt�ļ������ǲ�֪��������ʲô��������֪���Ǽ�ֵ����ʽ�����ݡ�
 * ��дһ�������ж��Ƿ��м���ֵΪ��lisi��������У����޸�ֵΪ100
 * ������1����user.txt�е����ݼ��ص�properties�У�
 * 2������properties ����
 * 3���õ�ÿһ���������жϣ��Ƿ���lisi ����ǣ����޸�ֵΪ100
 * 4����properties�����е����ݱ��浽user.txt��
 * 
 * */
public class PropertiesTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//1����user.txt�е����ݼ��ص�properties�У�
		Properties prop=new Properties();
		prop.load(new FileReader("user.txt"));
		
		//2������properties ����
		Set<String> set=prop.stringPropertyNames();
		for (String key : set) {
			if("lisi".equals(key)){
				prop.setProperty("lisi", String.valueOf(100));
				break;
			}
		}
		//4����properties�����е����ݱ��浽user.txt��
		prop.store(new FileWriter("user.txt"), null);
		
	}

}
