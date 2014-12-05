public class {
	public static void main（String[] args）{
		Person A=new Person();
		Person B=new Person("小李");
	}
class Person{
	String name;
	String country;
	Person(){
		System.out.println("我是无参构造函数");
		//System.out.println("我在跑步");
		//country ="中国";
	}
	Person(String name){
		System.out.println("我是有参构造函数");
		//System.out.println("我在跑步");
		//country ="中国";
	}
	{
		country ="中国";
		System.out.println("我是构造代码块： 我在跑步 ");
	}
}

}