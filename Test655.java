class Animal{//animalĬ��Ҳ�̳���object��
	
}
//class Cat {}  //����һ������ʱû��ָ�����̳�ĳ�࣬Ĭ�ϻ�̳�object��
class Cat extends Animal{  //���̳���һ����ʱ�Ͳ���Ĭ�ϼ̳�object��
	public String toString(){   //��д
		return "ff";
	
	}
}

class Test655{
	public static void main(String[] args){
		Cat c=new Cat();
		System.out.println(c);//����Ĭ�ϵ��õ���tostring����
		System.out.println(c.toString());//c���ڵ��õ��Ǹ�����̳е�object���tostring����
	}
}