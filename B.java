class Cat{
	private String name;
	private int age;
	Cat(){
	
	}
	
	Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	void get(){
		System.out.println(this.name);
	}
}
public class B{
	public static void main(String[] args){
		Cat one=new Cat(); //cat为构造方法 此处主要用来初始化对象 
		one.get();
		Cat two=new Cat("小花",2);
		two.get();
	}

}//此处class中有两个构造方法，如果把第一个cat方法删除 则编译出错因为无法cat()方法不存在；如果把两个构造方法都删除，编译不会出错因为系统会默认生成一个无参的构造方法供访问