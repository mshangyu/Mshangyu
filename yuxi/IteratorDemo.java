public class IteratorDemo{
	public static void main(String[] args){
		Collection c=new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator iterator() ������ ���ڻ�ȡ�����е�Ԫ��
		Iterator it=c.iterator();  //�ӿڵ�������� ��̬
		
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