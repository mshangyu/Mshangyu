package 序列化流;
/*类通过实现java.io.Serializable 接口以启用其序列化功能
 * 未实现此接口的类将无法使其任何状态序列化或反序列化
 * 
 * 注意：以后：你可能会看到有些接口或者抽象类中么有任何抽象方法。
 * 作用很简单：其实仅仅是起到了一个标记作用。
 * 
 * ObjectStreamDemo2和ObjectStreamDemo其实是一样的 但是为什么会出错呢，就是
 * 上面看到的serialversionuid值不一致导致的
 * 是因为Person.java 类实现序列化接口，然而实现序列化接口就会自动产生一个id值
 * 第一次：Person.java id=100
 * 		Person.class id=100
 * 那么，写到文件中的值就是id=100
 * 
 * 第二次：Person.java id=200
 * 		Person.class id=200
 * 但是，这个时候写到文件中的值就是id=100
 *  那么解决方案是什么？
 *  	每一次改动后，都先写后读取数据，这样肯定没有问题。
 *  但是，假设我坐的是注册功能，一开始已经注册过部分用户了，后来我改动文件后，又注册数据，这个时候
 *  如果按照我们的先写后读操作，可能把我们的数据就给丢失了
 *  所以，我的要求：很简单，不能动我以前的数据
 *  那么还有没有其他的解决方案呢？
 *  有，要是能够保证id永远一致就可以了，
 *  也就是说找一个固定的id值
 *  这样无论你java文件怎么变 这个值都不变
 *  现在的关键是你如何定义这个值，不能被序列化识别。
 *  
 *  记住的结论： 如果看到一个实现了Serializable接口，就要知道，该类的对象可能被序列化流操作，也可能被反序列化流操作
 *  而且，还可以通过点击鼠标来解决黄色警告线的问题，这样就给该类文件产生了一个固定的id值
 *  这样做的好处：对java文件做了一些简单的修改，也不会对我以前的数据产生影响
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
