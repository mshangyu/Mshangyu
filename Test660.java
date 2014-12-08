/*需求：求一段代码所花费的时间
原理：结束时间减去开始时间System.currentTimeMillis()
*/
/*
class Demo{
	public void getTime(){
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.print("ff");
		}
	long stop=System.currentTimeMillis();
	System.out.println("共花费了"+(stop-start));
	}
}
public class Test660{
	public static void main(String[] args){
	Demo d=new Demo();
	d.getTime();
	}
}*/
abstract class Demo{
	public void getTime(){
		long start=System.currentTimeMillis();
		this.function();
		long stop=System.currentTimeMillis();
		System.out.println("共花费了"+(stop-start));
	}
	public abstract void function();
		//for(int i=0;i<1000;i++){
			//System.out.println("ff");
		//}
		
	
}
class Test extends Demo{
	public void function(){
		for(int i=0;i<1000;i++){
			System.out.println("犯非法");
		}
	}
}
public class Test660{
	public static void main(String[] args){
		Test t=new Test();
		t.getTime();
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	