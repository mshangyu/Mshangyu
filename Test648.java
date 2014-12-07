class Animal{
	String Type;
	void run(){      //父类中无参的构造方法
		System.out.println("在跑步总");
	}
}
 class Cat extends Animal{
 
 }
 
 class Dog extends Animal{  //子类继承了父类的无参构造方法
	String Type="大黄狗";
	void run(Sting a){  //子类中有参的构造方法  
		Type="大黄狗";
		System.out.println(Type+"哼着歌在跑步总");
	}
 }
 
 public  class Test648{
	public static void main(String[] args){
		Cat c=new Cat();
		c.run();
		Dog d=new Dog();
		d.run();   //由于子类继承了父类的无参构造方法 所以此处引用的是子类从父类中继承的方法
		d.run("ff");  // 此处引用的是子类中有参的构造方法了
	}
 }