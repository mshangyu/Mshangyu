public class D{
	public static void main(String[] args){
		Student S=new Student("������",12);
		Student B=new Student("gt",32);
	}
}


class Student{
	String name;
	int age;
	Student(){
		
		System.out.println("�޲ι��췽��");
	
	}
	Student(String name){
		this();
		this.name=name;  //��ʼ�� this����s
		System.out.println("jj");
	
	}
	Student(String name,int age){
		this(name);//ʵ�ֹ��췽���ĵ��� this�������name
		this.age=age;//this����b
	
	}
}