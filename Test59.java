import java.util.*;
public class Test59{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String[] arr=new String[7];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个字符");
			arr[i]=in.next();

		}
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--){  //此处的int i=arr.length-1是指数组的长度减一就是最大的下标值
		System.out.println(arr[i]);//逆序的输出结果
		}

	}



}
/* 原来的数组里的值为a、b、c、d、e、f、g  现在逆序输出就是按照gfedcba的顺序输出*/