class Dog1{
	String name;
	public String print(String n){  //�в��з���
		System.out.println(n);
		return n;//�˴�Ҳ����дreturn n ������ôд��������һ��ֵ
	}
	public void str(int a){
		if(a==0){
			System.out.println("���");
		}else if(a==1){
			return;
		}
		System.out.println(name);
	}
}
public class Dog{
	public static void main(String[] args){
		Dog1 A=new Dog1();
		// String name=A.print("С��");//��Ϊ�������в����� ���Դ˴�����дһ���ַ������͵Ĳ���
		// System.out.println(name);
		A.str(1);
	}


}