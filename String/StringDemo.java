public class StringDemo{
	public static void main(String[] args){
		String s=new String();
		System.out.println("s"+s);
		System.out.println("s.length():"+s.length);
		System.out.println("---------------------");
	
		//String(byte[] bytes)把字节数组转换成字符串
		byte[] bys={97,98,99,100,101};
		String s2=new String(bys);
		System.out.println("s2"+s2);
		System.out.println("s2.length():"+s2.length());
	
		//String(byte[] bytes,int index,int length)把字节数组的一部分转换成字符串
		String s3=new String(bys,2,3);//2表示下标从2开始 3表示开始之后的三个长度
		System.out.println("s3"+s3);
		System.out.println("s3.length():"+s3.length());
	
		//String(char[] value)
		char[] chs={'a','b','c'};
		String s4=new String(chs);
		System.out.println("s2"+s4);
		System.out.println("s4.length():"+s4.length());
	
		//String(char[] value,int index,int count)//把字符数组的一部分转换成字符串
		String s5=new String(chs,0,3);//从0下标开始 三个
		System.out.println("s2"+s5);
		System.out.println("s5.length():"+s5.length());
		
		//String(String original) 把字符串转换成字符串
		String s6=new String("abc");
		System.out.println("s6"+s6);
		System.out.println("s6.length():"+s6.length());
		
		//直接赋值的方式
		String s7="abc";
		System.out.println("s7"+s7);
		System.out.println("s7.length():"+s7.length());
	
	}

}