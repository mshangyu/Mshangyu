class Animal{
	String Type;
	void run(){      //�������޲εĹ��췽��
		System.out.println("���ܲ���");
	}
}
 class Cat extends Animal{
 
 }
 
 class Dog extends Animal{  //����̳��˸�����޲ι��췽��
	String Type="��ƹ�";
	void run(Sting a){  //�������вεĹ��췽��  
		Type="��ƹ�";
		System.out.println(Type+"���Ÿ����ܲ���");
	}
 }
 
 public  class Test648{
	public static void main(String[] args){
		Cat c=new Cat();
		c.run();
		Dog d=new Dog();
		d.run();   //��������̳��˸�����޲ι��췽�� ���Դ˴����õ�������Ӹ����м̳еķ���
		d.run("ff");  // �˴����õ����������вεĹ��췽����
	}
 }