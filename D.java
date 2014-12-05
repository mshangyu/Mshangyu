public class D{
	public static void main(String[] args){
		Student S=new Student("王晓东",12);
		Student B=new Student("gt",32);
	}
}


class Student{
	String name;
	int age;
	Student(){
		
		System.out.println("无参构造方法");
	
	}
	Student(String name){
		this();
		this.name=name;  //初始化 this代表s
		System.out.println("jj");
	
	}
	Student(String name,int age){
		this(name);//实现构造方法的调用 this括号里的name
		this.age=age;//this就是b
	
	}
}