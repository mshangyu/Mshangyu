class fu{
	String name;
	fu(){
		System.out.println("�����޲ι��췽��");
	}
	fu(String n){
		this.name=n;
		System.out.println("�����вι��췽��");
	}
}
class zi extends fu{
	zi(){
		
		super();//��ʵ������ʽ�� д��д��������һ���� ֱ�����õ��Ǹ����
		System.out.println("���๹�췽��");
	}
	zi(String n){
		super("С��");
		this.name="С��";//��С����ΪС����
		System.out.println("�����вι��췽��");
	}
}

public class Test649{
	public static void main(String[] args){
		zi z=new zi("С��");
	}
}