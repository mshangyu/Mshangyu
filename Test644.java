class Person{
	String name;
	private Person(){
	
	}
	static Person p=new Person(); 
	public static  Person getInstance(){
		return p;
	
	}
}

public class Test644{
	public static void main(String[] args){
		Person A=Person.getInstance();
		Person B=Person.getInstance();
		A.name="С��";
		System.out.println(B.name);
	}
}