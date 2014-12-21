public class IteratorDemo{
	public static void main(String[] args){
		Collection c=new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator iterator() 迭代器 用于获取集合中的元素
		Iterator it=c.iterator();  //接口的子类对象 多态
		
		if(it.hasNext()){
			System.out.println(it.next());
		}
		if(it.hasNext()){
			System.out.println(it.next());
		}
		if(it.hasNext()){
			System.out.println(it.next());
		}
		if(it.hasNext()){
			System.out.println(it.next());
		}
		
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(S);
		}
	}
}