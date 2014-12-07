class Animal{//animal默认也继承了object类
	
}
//class Cat {}  //定义一个新类时没有指明它继承某类，默认会继承object类
class Cat extends Animal{  //当继承了一个类时就不会默认继承object类
	public String toString(){   //重写
		return "ff";
	
	}
}

class Test655{
	public static void main(String[] args){
		Cat c=new Cat();
		System.out.println(c);//这里默认调用的是tostring方法
		System.out.println(c.toString());//c等于调用的是父类里继承的object类的tostring方法
	}
}