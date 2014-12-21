public class Iterator{
	public static void main(String[] args){
		Collection c=new ArrayList();
		
		Students s1=new Student();
		Students s2=new Student();
		Students s3=new Student();
		Students s4=new Student();
		Students s5=new Student();
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Iterator it=c.iterator();
		while(it.hasNext()){
			Student c1=(Student)it.next();
			System.out.println(c1.getName+c1.getAge);
		}
		
		for(Iterator it2=c.iterator();it2.hasNext()){
			Student c1=(Student)it2.next();
			System.out.println(c1.getName+c1.getAge);
		}
	}
}