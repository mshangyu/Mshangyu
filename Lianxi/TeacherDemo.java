class Teacher{
	private String name;
	private int age;

	public Teacher(){
		super();
	}
	public Teacher(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	//���󣺱Ƚ�������Ա����ֵ�Ƿ���ͬ
	/*public boolean compare(Teacher t1,Teacher t2 ){  ���ǵ�һ�ַ���
		//t1.getName()==t2.getName()
		//�ַ�������������������          //��������������==
		if(t1.getName().equals(t2.getName())&&t1.getAge()==t2.getAge()){        
			return true;
		}else{
			return false;
		}
	}
	*/
	/*public boolean compare(Teacher t1,Teacher t2 ){
			if(t1.name.equals(t2.name)&&t1.age==t2.age){
				return true;
			}else{
				return false;
			}
	} ���ǵڶ��ַ���
	*/
	
	/*//��this������õĶ���
	public boolean compare(Teacher t ){
		//t1-->this��ǰ����   t2-->t���Ĳ���
		if(this.name.equals(t.name)&&this.age==t.age){
			return true;
		}else{
			return false;
		}�����ַ���
	}*/
	
	//�����ַ���
	//���һ��������������ͬ���ܵķ�����һ��ῼ����һ����
	//��equals�������벻��������ڵģ�����������equals
	//������д��equals����
	/*public boolean equals(Object obj){//t1-->this��ǰ����   t2-->t���Ĳ���
		//Object obj=t2;���ｫt2����obj Ĭ�ϵ�������ת��
		//������������ʱteacherʱ��Ҫ����ת��
		Teacher t=(Teacher)obj;
		if(this.name.equals(t.name)&&this.age==t.age){
			return true;
		}else{
			return false;
		}
	}*/
	
	//���հ�
	public boolean equals(Object obj){
	
		//���Ч��
		if(this==obj){  //����㴫�Ĳ����ĵ�ֵַ�͵�ǰ����ĵ�ֵַ��ͬ
			return true;
		}
		//���Ͳ�ƥ�䣿��ô�����Ҫ�ж�����
		if(obj instanceof Teacher){
			
		
			System.out.println("aaaaaaaa");
			Teacher t=(Teacher)obj;
			System.out.println("bbbbbbb");
			if(this.name.equals(t.name)&&this.age==t.age){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	
}
public class TeacherDemo{
	public static void main(String[] args){
		Teacher t=new Teacher();
		t.setName("����ϼ");
		t.setAge(27);
		System.out.println(t);
	

		//��Ҫ�Ƚ����������ֵ�Ƿ����
		Teacher t1=new Teacher("����ϼ",27);
		Teacher t2=new Teacher("����ϼ",27);
		System.out.println(t1==t2);  //false  ��Ϊ������������ ��ַ��ͬ

		//����������������������䶼��ͬ Ӧ����һ������ ����˵�Ƚ�һ�³�Ա������ֵ��
		//����д���� ��ô�����أ�
		//System.out.println(t1.compare(t1,t2));//true

		//��Ȼʵ����Ч������t1���÷��� ��Ҫ����һ��t1 ����е�����
		//ĳ��������÷������ڲ���ʵ��һ�������Ϳ��Ա�ʾ�ö��� ����this����
		//System.out.println(t1.compare(t2));  //true
		
		
		System.out.println(t1.equals(t2));  //false
		System.out.println(t1.equals(t1));
		
		
		//==�����ã�
		//�Ƚϻ������ͣ��Ƚϵ��ǻ������͵�ֵ�Ƿ����
		//�Ƚ��������ͣ��Ƚϵ����������͵ĵ�ֵַ�Ƿ����
		
		Demo d=new Demo();
		System.out.println(t1.equals(d)); //false ��Ϊ���Ͳ�ƥ�� ����
	}
}
class Demo{
} 








