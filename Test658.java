abstract class Animal{
	//void sing();//看不懂所以需要如下abstract修饰
	abstract void sing();
		//System.out.println("唱歌");被重写了 没意义 所以在这里就可以删除了
	void show(){
		System.out.println("你好");
	}
}

class Cat extends Animal{
	void sing(){
		System.out.println("喵喵唱歌");
	}
}
class Dog extends Animal{
	void sing(){
		System.out.println("汪汪唱歌");
	}
}
public class Test658{
	public static void main(String[] args){
		//Animal a=new Animal();//由于animal是抽象的所以这里没法实例化 可以像下面这样
		//a.sing();
		//Animal c=new Cat();//可以实现多态 讲向上转型
		Cat c=new Cat();
		c.sing();
		c.show();
	}
}