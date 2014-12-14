public class Operator{
	public static void main(String[] args){
		int a=9;
		int b=9;
		int c=9;
		
		b=a++;
		c=--b;
		--a;
		c++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int x=10;
		x++;
		x=x+20;
		System.out.println(x);
		
	}
}