package ���л���;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

/*���԰�����Ļ������͵�����д���ļ���Ҳ�а취��ȡ������Ļ������͵�����
 * 
 * 
 * */
	public static void main(String[] args) throws IOException {
//		//�������������
//		DataOutputStream dos=new DataOutputStream(new FileOutputStream("dos.txt"));
//		//д�������͵�����
//		dos.writeBoolean(true);
//		dos.writeByte(10);
//		dos.writeChar('a');
//		dos.writeDouble(12.23f);
//		dos.writeShort(100);
//		dos.writeLong(10000L);
//		
//		dos.close();
		
		//��������������   ���水��ʲô˳��д�� ����͵ð���ʲô˳���
		DataInputStream dis=new DataInputStream(new FileInputStream("dos.txt"));
		byte b=dis.readByte();
		System.out.println(b);
		int i=dis.readInt();
		System.out.println(i);
		
		dis.close();
	}

}
