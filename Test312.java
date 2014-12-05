/*
import java.util.Random;
public class Test312{
	public static void main(String[] args){
		Random xx=new Random();
		int number=xx.nextInt(10);
		System.out.println("随机数为"+number);
	}
}
*/
public class Test312{
	public static void main(String[] args){
		int number=(int)(Math.random()*10);
		System.out.println(number);
	}
}
//第二种是支持多线程的