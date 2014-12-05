public class Person{
	//成员变量
	String name;
	String gender;
	int age=23;
	
	//无参无返回类型void无返回 
	//成员方法
	public void eat(){
		System.out.println("我在吃饭");
	}
	
	
	//有参数无返回类型
	public void sleep(String A){  //A为字符串类型的参数
		System.out.println("我在"+A+"睡觉");//A在主程序中定义如床上
	
	}
	//有参有返回 
	public int getAge(int a){
		return a;//返回
	
	}
	
	
}