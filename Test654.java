class Car{
	String color;
	void start(){
		System.out.println("����������");
	}
}

public class Test654{
	public static void main(String[] args){
		//Car c=new Car();
		//c.start();
		
		//new Car().color="��ɫ";//�˴�����������û����˼�� ��Ϊû��ʹ����
		//new Car().start();//���������ʹ�� ����start�������
		
		//Car c=new Car();
		//print(c);
		
		print(new Car());
	}
	
	static void print(Car c){//Car c=new Car();
		c.start();
	}
}