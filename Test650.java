class Animal{
	void sleep(){
		System.out.println("˯����");
	}
}
class Cat extends Animal{
	void catchMouse(){
		System.out.println("����");
	}
}
class Dog extends Animal{
	
}

public class Test650{
	public  static void main(String[] args){
		Animal a=new Cat();//����ת��
		System.out.println(a instanceof Animal);//�ж���ߵĶ����ǲ����ұߵ���new������
		//Cat c=(Cat)a;//����ת��
		a.sleep();
		Cat c=(Cat)a;//����ת�� ��ʱ��a��ʵ��animal�е� ����ǿ��ת��ת������cat�е� ���Կ��Խ��н������Ĳ���
		c.catchMouse();
		c.sleep();
		
		//Dog d=(Dog)a;//a��һֻèǿ��ת����һֻ��  ��������Ͳ�ƥ��Ĵ���
		
	}
}