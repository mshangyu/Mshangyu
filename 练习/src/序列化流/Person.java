package ���л���;
/*��ͨ��ʵ��java.io.Serializable �ӿ������������л�����
 * δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л�
 * 
 * ע�⣺�Ժ�����ܻῴ����Щ�ӿڻ��߳�������ô���κγ��󷽷���
 * ���úܼ򵥣���ʵ����������һ��������á�
 * 
 * ObjectStreamDemo2��ObjectStreamDemo��ʵ��һ���� ����Ϊʲô������أ�����
 * ���濴����serialversionuidֵ��һ�µ��µ�
 * ����ΪPerson.java ��ʵ�����л��ӿڣ�Ȼ��ʵ�����л��ӿھͻ��Զ�����һ��idֵ
 * ��һ�Σ�Person.java id=100
 * 		Person.class id=100
 * ��ô��д���ļ��е�ֵ����id=100
 * 
 * �ڶ��Σ�Person.java id=200
 * 		Person.class id=200
 * ���ǣ����ʱ��д���ļ��е�ֵ����id=100
 *  ��ô���������ʲô��
 *  	ÿһ�θĶ��󣬶���д���ȡ���ݣ������϶�û�����⡣
 *  ���ǣ�������������ע�Ṧ�ܣ�һ��ʼ�Ѿ�ע��������û��ˣ������ҸĶ��ļ�����ע�����ݣ����ʱ��
 *  ����������ǵ���д������������ܰ����ǵ����ݾ͸���ʧ��
 *  ���ԣ��ҵ�Ҫ�󣺺ܼ򵥣����ܶ�����ǰ������
 *  ��ô����û�������Ľ�������أ�
 *  �У�Ҫ���ܹ���֤id��Զһ�¾Ϳ����ˣ�
 *  Ҳ����˵��һ���̶���idֵ
 *  ����������java�ļ���ô�� ���ֵ������
 *  ���ڵĹؼ�������ζ������ֵ�����ܱ����л�ʶ��
 *  
 *  ��ס�Ľ��ۣ� �������һ��ʵ����Serializable�ӿڣ���Ҫ֪��������Ķ�����ܱ����л���������Ҳ���ܱ������л�������
 *  ���ң�������ͨ���������������ɫ�����ߵ����⣬�����͸������ļ�������һ���̶���idֵ
 *  �������ĺô�����java�ļ�����һЩ�򵥵��޸ģ�Ҳ���������ǰ�����ݲ���Ӱ��
 * 
 * 
 * 
 * */
import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3219548864305585661L;
	private String name;
	int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
