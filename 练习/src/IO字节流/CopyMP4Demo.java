package IO�ֽ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/*����Դ��d:\\��������.mp4
 * Ŀ�ĵأ� gylp.mp4
 * ��ʱ�� �Ƕ��٣�
 * ���ַ�ʽ��
 * 		�����ֽ��� һ�ζ�дһ���ֽ�
 * 		�����ֽ���һ�ζ�дһ���ֽ�����
 * 		��Ч�ֽ��� һ�ζ�дһ���ֽ�
 * 		��Ч�ֽ���һ�ζ�дһ���ֽ����� 
 * */
public class CopyMP4Demo {
	public static void main(String[] args) throws IOException {
		long start=System.currentTimeMillis();
//		Method1("d:\\��������.mp4"," gylp.mp4");
//		Method2("d:\\��������.mp4"," gylp.mp4");
		Method3("d:\\��������.mp4"," gylp.mp4");
//		Method4("d:\\��������.mp4"," gylp.mp4");
		long end=System.currentTimeMillis();
		System.out.println("����ʱ����"+(end-start)+"����");
	}
	
	//�����ֽ��� һ�ζ�дһ���ֽ�
//	private static void Method1(String srcString,String destString) throws IOException {
//		FileInputStream fis=new FileInputStream(srcString);
//		FileOutputStream fos=new FileOutputStream(destString);
//		
//		int ch=0;
//		while ((ch=fis.read())!=-1) {
//			fos.write(ch);
//		}
//		
//		fos.close();
//		fis.close();
		
		//�����ֽ���һ�ζ�дһ���ֽ�����
//		private static void Method2(String srcString,String destString) throws IOException {
//			FileInputStream fis=new FileInputStream(srcString);
//			FileOutputStream fos=new FileOutputStream(destString);
//			
//			byte[] chs=new byte[1024];
//			int len=0;
//			while ((len=fis.read(chs))!=-1) {
//				fos.write(chs,0,len);
//			}
//			
//			fos.close();
//			fis.close();
				//��Ч�ֽ���һ�ζ�дһ���ֽ����� 
//			private static void Method4(String srcString,String destString) throws IOException {
//				BufferedInputStream fis=new BufferedInputStream(new FileInputStream(srcString));
//				BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(destString));
//				
//				byte[] chs=new byte[1024];
//				int len=0;
//				while ((len=fis.read(chs))!=-1) {
//					fos.write(chs,0,len);
//				}
//				
//				fos.close();
//				fis.close();
	
				//��Ч�ֽ��� һ�ζ�дһ���ֽ�
				private static void Method3(String srcString,String destString) throws IOException {
					BufferedInputStream fis=new BufferedInputStream(new FileInputStream(srcString));
					BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(destString));
					
					int ch=0;
					while ((ch=fis.read())!=-1) {
						fos.write(ch);
					}
					
					fos.close();
					fis.close();
					
		
	}
	

}
