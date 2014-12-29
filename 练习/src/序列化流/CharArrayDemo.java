package 序列化流;
//不必一定指向文件，也可以直接来自内存中虚拟的数组  用完就没有了
import java.awt.CardLayout;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
	public static void main(String[] args) throws IOException {
		CharArrayWriter caw=new CharArrayWriter();
		caw.write("helloworld");
		caw.close();
		
		char[] chs=caw.toCharArray();
		
		CharArrayReader car=new CharArrayReader(chs);
		int ch=0;
		while ((ch=car.read())!=-1) {
			System.out.println((char)ch);
		}
		car.close();
	}

}
