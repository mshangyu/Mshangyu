class Person{
	String name="����";
}
class Student extends Person{
	String name="����";
	void show(){
		//System.out.println(this.name);  //��������Ҳ�ж���һ���͸���һ���ĳ�Աʱ this������ʵ��������е�
		System.out.println(super.name);
	}
}
public class Test647{
	public static void main(String[] args){
	Student stu=new Student();
	stu.show();
	}
}