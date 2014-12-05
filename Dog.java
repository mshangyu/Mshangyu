class Dog1{
	String name;
	public String print(String n){  //有参有返回
		System.out.println(n);
		return n;//此处也可以写return n 不过怎么写都返回了一个值
	}
	public void str(int a){
		if(a==0){
			System.out.println("你好");
		}else if(a==1){
			return;
		}
		System.out.println(name);
	}
}
public class Dog{
	public static void main(String[] args){
		Dog1 A=new Dog1();
		// String name=A.print("小明");//因为上面是有参数的 所以此处必须写一个字符串类型的参数
		// System.out.println(name);
		A.str(1);
	}


}