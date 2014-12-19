public class Student{
	public static void main(String[] args){
		
		List list=new List();
		
		Student s1=new Student("Áõ±¸",40);
		Student s2=new Student("²Ü²Ù",45);
		Student s3=new Student("ËïÈ¨",34);
		Student s4=new Student("¹ØÓğ",23);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.getName()+s.getAge());
		}
		
		for(int x=0;x<list.size();x++){
			Student s=(Student)it.next();
			System.out.println(s.getName()+s.getAge());
		}
	}
}