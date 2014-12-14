class OperatorDemo{
	public static void main(String[] args){
		int a=10;
		//a++  ¾ÍÊÇa=a+1
		int b=a++;
		System.out.println(a);//11
		System.out.println(b);//10
		int c=++a;
		System.out.println(a);//12
		System.out.println(c);//12
	}
}