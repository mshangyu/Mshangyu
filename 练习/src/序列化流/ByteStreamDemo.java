package ���л���;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ByteStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write("helloworld".getBytes());
		baos.close();
		
		byte[] bys=baos.toByteArray();
//		for (byte b : bys) {
//			System.out.println(b);
//		}
		//�����ֽ����������
		ByteArrayInputStream bais=new ByteArrayInputStream(bys);
		int by=0;
		while ((by=bais.read())!=-1) {
			System.out.println(by);
		}
		bais.close();
		
	}

}
