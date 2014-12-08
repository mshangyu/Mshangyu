interface Smoket{
	public abstract void smoket();
}
interface Game{
	//void computerGame();
	public abstract void smoket();
}
class Student implements Smoket,Game{
	 public void smoket(){
		System.out.println("ÔÚÎüÑÌ");
	}
	//public void computerGame(){
		//System.out.println("ÓÎÏ·");
	//}
}

public class Test661{
	public static void main(String[] args){
		Student s=new Student();
		s.smoket();
		s.computerGame();
	}
}
