class fu{
	String name;
	fu(){
		System.out.println("父类无参构造方法");
	}
	fu(String n){
		this.name=n;
		System.out.println("父类有参构造方法");
	}
}
class zi extends fu{
	zi(){
		
		super();//其实这是隐式的 写不写出来都是一样的 直接引用的是父类的
		System.out.println("子类构造方法");
	}
	zi(String n){
		super("小明");
		this.name="小红";//将小明改为小红了
		System.out.println("子类有参构造方法");
	}
}

public class Test649{
	public static void main(String[] args){
		zi z=new zi("小李");
	}
}