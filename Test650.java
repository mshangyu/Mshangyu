class Animal{
	void sleep(){
		System.out.println("睡觉中");
	}
}
class Cat extends Animal{
	void catchMouse(){
		System.out.println("捕鼠");
	}
}
class Dog extends Animal{
	
}

public class Test650{
	public  static void main(String[] args){
		Animal a=new Cat();//向上转型
		System.out.println(a instanceof Animal);//判断左边的对象是不是右边的类new出来的
		//Cat c=(Cat)a;//向下转型
		a.sleep();
		Cat c=(Cat)a;//向下转型 此时的a其实是animal中的 用了强制转换转换成了cat中的 所以可以进行接下来的操作
		c.catchMouse();
		c.sleep();
		
		//Dog d=(Dog)a;//a是一只猫强制转换成一只狗  会出现类型不匹配的错误
		
	}
}