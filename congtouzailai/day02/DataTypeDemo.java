public class DataTypeDemo{
	public static void main(String[] args){
		int x=10;
		byte b=20;
		//int y=x+b;
		x=x+b;
		
		System.out.println(x);
		
		byte bb=3;
		//bb=bb+4;
		//bb=bb+4;   报错
		bb=(byte)(bb+4);  //byte一定要加个括号
 		System.out.println(bb);
		
	}
}