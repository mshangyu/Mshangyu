class Animal{
	void sing(){
		System.out.println("³ª¸è");
	}
}
class Dog extends Animal{
	void sing(){
		System.out.println("ÍôÍôµÄ³ª");
	}
}
class Cat extends Animal{
	void sing(){
		System.out.println("ß÷ß÷µÄ³ª¸è");
	}
	void catchMouse(){
		System.out.println("²¶Êó");	
	}
}
class Pig extends Animal{
	void sing(){
		System.out.println("ÖíÖ®¸è");
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