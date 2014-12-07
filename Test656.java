class Cat{
	int num;
	public boolean ff(Object ffff){
		//return true;//this 相当于当前对象引用
		Cat ee=(Cat) ffff;
		return this.num==ee.num;
	}
}

class Dog{

}

public class Test656{
	public static void main(String[] aargs){
		Cat c=new Cat();
		Dog c2=new Dog();
		//Cat c2=new Cat();
		//System.out.println(c.equals(c2));
		
		//Cat c2=c;
		//System.out.println(c.equals(c2));
		System.out.println(c.ff(c2));
		/*c.num=23;
		Cat c2=new Cat();
		c2.num=23;
		System.out.println(c==c2);*/
		
	}
}
