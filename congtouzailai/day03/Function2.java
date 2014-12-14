class Function2{
	public static void main(String[] args){
		System.out.println(compare(10,20));
	}
	public static boolean compare(byte a,byte b){
		System.out.println("byte");
		return a==b;
	public static boolean compare(short a,short b){
		System.out.println("short");
		return a==b;
	}
	public static boolean compare(long a,long b){
		System.out.println("long");
		return a==b;
	}
	public static boolean compare(int a,int b){
		System.out.println("int");
		return a==b;
	}
	
}//会自动向上找那种类型 但是绝对不会自动向下去找类型