package 序列化流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

/*可以把任意的基本类型的数据写到文件，也有办法读取到任意的基本类型的数据
 * 
 * 
 * */
	public static void main(String[] args) throws IOException {
//		//创建输出流对象
//		DataOutputStream dos=new DataOutputStream(new FileOutputStream("dos.txt"));
//		//写基本类型的数据
//		dos.writeBoolean(true);
//		dos.writeByte(10);
//		dos.writeChar('a');
//		dos.writeDouble(12.23f);
//		dos.writeShort(100);
//		dos.writeLong(10000L);
//		
//		dos.close();
		
		//创建输入流对象   上面按照什么顺序写的 下面就得按照什么顺序读
		DataInputStream dis=new DataInputStream(new FileInputStream("dos.txt"));
		byte b=dis.readByte();
		System.out.println(b);
		int i=dis.readInt();
		System.out.println(i);
		
		dis.close();
	}

}
