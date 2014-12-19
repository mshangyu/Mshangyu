public class ListIterator{
	public static void main(String[] args){
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("nihao");
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if("list".equals(s)){
				list.add("zhaowu");
			}
		}
		System.out.println("list:"+list);
	}
}