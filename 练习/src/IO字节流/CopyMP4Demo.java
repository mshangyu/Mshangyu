package IO字节流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/*数据源：d:\\哥有老婆.mp4
 * 目的地： gylp.mp4
 * 耗时间 是多少？
 * 四种方式：
 * 		基本字节流 一次读写一个字节
 * 		基本字节流一次读写一个字节数组
 * 		高效字节流 一次读写一个字节
 * 		高效字节流一次读写一个字节数组 
 * */
public class CopyMP4Demo {
	public static void main(String[] args) throws IOException {
		long start=System.currentTimeMillis();
//		Method1("d:\\哥有老婆.mp4"," gylp.mp4");
//		Method2("d:\\哥有老婆.mp4"," gylp.mp4");
		Method3("d:\\哥有老婆.mp4"," gylp.mp4");
//		Method4("d:\\哥有老婆.mp4"," gylp.mp4");
		long end=System.currentTimeMillis();
		System.out.println("共耗时间是"+(end-start)+"毫秒");
	}
	
	//基本字节流 一次读写一个字节
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
		
		//基本字节流一次读写一个字节数组
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
				//高效字节流一次读写一个字节数组 
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
	
				//高效字节流 一次读写一个字节
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
