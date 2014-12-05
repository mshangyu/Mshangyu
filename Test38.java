//嵌套if结构
import java.util.*;
public class Test38{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请问你的性别是？（男/女）");
		String sex=in.next();
		if(sex.equals("男")){
			System.out.println("你的年龄是多少？");
			int age=in.nextInt();
			if(age>=18){
				System.out.println("成年了啊");
			}else{
				System.out.println("还是个未成年的啊");
			}
		}else{
			System.out.println("原来是个女的啊");
		}
	}
}