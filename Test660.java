/*������һ�δ��������ѵ�ʱ��
ԭ������ʱ���ȥ��ʼʱ��System.currentTimeMillis()
*/
/*
class Demo{
	public void getTime(){
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.print("ff");
		}
	long stop=System.currentTimeMillis();
	System.out.println("��������"+(stop-start));
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
		System.out.println("��������"+(stop-start));
	}
	public abstract void function();
		//for(int i=0;i<1000;i++){
			//System.out.println("ff");
		//}
		
	
}
class Test extends Demo{
	public void function(){
		for(int i=0;i<1000;i++){
			System.out.println("���Ƿ�");
		}
	}
}
public class Test660{
	public static void main(String[] args){
		Test t=new Test();
		t.getTime();
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	