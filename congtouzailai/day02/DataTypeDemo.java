public class DataTypeDemo{
	public static void main(String[] args){
		int x=10;
		byte b=20;
		//int y=x+b;
		x=x+b;
		
		System.out.println(x);
		
		byte bb=3;
		//bb=bb+4;
		//bb=bb+4;   ����
		bb=(byte)(bb+4);  //byteһ��Ҫ�Ӹ�����
 		System.out.println(bb);
		
	}
}