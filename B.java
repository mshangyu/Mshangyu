class Cat{
	private String name;
	private int age;
	Cat(){
	
	}
	
	Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	void get(){
		System.out.println(this.name);
	}
}
public class B{
	public static void main(String[] args){
		Cat one=new Cat(); //catΪ���췽�� �˴���Ҫ������ʼ������ 
		one.get();
		Cat two=new Cat("С��",2);
		two.get();
	}

}//�˴�class�����������췽��������ѵ�һ��cat����ɾ�� ����������Ϊ�޷�cat()���������ڣ�������������췽����ɾ�������벻�������Ϊϵͳ��Ĭ������һ���޲εĹ��췽��������