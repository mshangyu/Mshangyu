class Person{
	String name="张三";
}
class Student extends Person{
	String name="李四";
	void show(){
		//System.out.println(this.name);  //当子类中也有定义一个和父类一样的成员时 this代表访问的是子类中的
		System.out.println(super.name);
	}
}
public class Test647{
	public static void main(String[] args){
	Student stu=new Student();
	stu.show();
	}
}