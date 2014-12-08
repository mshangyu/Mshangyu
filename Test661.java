interface smoket{
	public static final String NAME="Ğ¡Àî";
	
	public abstract void show();
	
}
class Student implements smoket{
	public void show(){
		System.out.println("ÔÚÎüÑÌ");
	}
}

public class Test661{
	public static void main(String[] args){
		Student s=new Student();
		s.show();
	}
}