class Animal{
	void sing(){
		System.out.println("����");
	}
}
class Dog extends Animal{
	void sing(){
		System.out.println("�����ĳ�");
	}
}
class Cat extends Animal{
	void sing(){
		System.out.println("�����ĳ���");
	}
	void catchMouse(){
		System.out.println("����");	
	}
}
class Pig extends Animal{
	void sing(){
		System.out.println("��֮��");
	}
}


public class Test651{
	public  static void main(String[] args){
		Cat c=new Cat();
		function(c);
		//Cat d=new Cat();
		/*c.sing();
		Cat d=new Cat();
		d.sing();
		Cat e=new Cat();
		e.sing();*/
		//function(c);
		//function(d);
		Dog f=new Dog();
		function(f);
		//Pig g=new Pig();
		//function(g);
	}
	public static void function(Animal c){//Animal c=new Animal();
		c.sing();
	}
	/*public static void function(Cat c){  //Cat c=new Cat();
		c.sing();
	}
	public static void function(Dog f){  //Dog f=new Dog();
		f.sing();
	}
	public static void function(Pig g){  //Pig g=new Pig();
		g.sing();
	}*/
	
	
	
	
	
	
	
	
}