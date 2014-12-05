public class Test54{
	public static void main(String args[]){
		String[] arr=new String[5];
		System.out.println(arr[0]);//此处的arr【0】并没有赋值，java会默认输出为空null
		if(arr[0]==null){
			System.out.println("这个数组0小标里没有数值");

		}
		
	}




}