package 序列化流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

/*需求：把对象按照流一样的方式操作，对象流，序列化流。
 * 序列化：把对象按照流一样的方式操作（写进去）
 * 反序列化：把文件中的流对象的数据还原成对象。
 * 
 * 序列化：ObjectOutputStream
 * 		public final void writeObject(Object obj)
 *反序列化  ObjectInputStream
 *		public final Object readObject()
 * */
public class ObjectStreamDemo2 {
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
	//	Writer();
		read();

	}
	
	//反序列化
	private static void read() throws ClassNotFoundException, IOException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("oos2.txt"));
		Object obj=ois.readObject();
		ois.close();
		System.out.println(obj);
		
	}

	//序列化
	private static void Writer() throws FileNotFoundException, IOException {
		// 创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"oos2.txt"));

		Person p = new Person("林青霞", 23);
		oos.writeObject(p);
		oos.close();

	}

}
