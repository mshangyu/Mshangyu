
//需要明确 返回值类型 参数列表
class ArrayDemo1{
	public static void main(String[] args){
		int[] arr={12,122,233,34,44,55};
		int index=getIndex(arr,23);
		System.out.println(index);
	}
	public static int getIndex(int[] arr,int value){
		int index=-1;
		for(int x=0;x<arr.length;x++){
			if(arr[x]==value){
				return x;
				break;
			}
		}//如果在for循环里面都找不到你要找的值 那么就执行index也就是-1
		return index;
	}
}