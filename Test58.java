import java.util.*;//其实这里包括Scanner 和Arrays两种包
import java.util.Arrays;public class Test58{
	public static void main(String args[]){
		
		Scanner in =new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"学生的成绩");
			arr[i]=in.nextInt();


		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}



}