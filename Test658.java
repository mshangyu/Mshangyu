abstract class Animal{
	//void sing();//������������Ҫ����abstract����
	abstract void sing();
		//System.out.println("����");����д�� û���� ����������Ϳ���ɾ����
	void show(){
		System.out.println("���");
	}
}

class Cat extends Animal{
	void sing(){
		System.out.println("��������");
	}
}
class Dog extends Animal{
	void sing(){
		System.out.println("��������");
	}
}
public class Test658{
	public static void main(String[] args){
		//Animal a=new Animal();//����animal�ǳ������������û��ʵ���� ��������������
		//a.sing();
		//Animal c=new Cat();//����ʵ�ֶ�̬ ������ת��
		Cat c=new Cat();
		c.sing();
		c.show();
	}
}