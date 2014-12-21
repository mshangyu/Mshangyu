
import java.util.ArrayList;
import java.util.Collection;

public class CollationDemo{
	public static void main(String[] args){
		//默认向上转型了
		CollationDemo c=new CollationDemo();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//object[] toArray() 把集合转为数组
		Object[] objs=c.toArray();
		
		for(int x=0;x<objs.length;x++){
			//循环遍历
			System.out.println(objs[x]);
			//我要输出每个字符串的长度
			//这里需要向下转型
			String s=(String)objs[x];
			//这里只有向下转型了 才能输出字符串类型的长度
			System.out.println(s+"---"+s.length());
		}
	}
}