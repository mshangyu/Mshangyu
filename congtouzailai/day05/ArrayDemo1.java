
//��Ҫ��ȷ ����ֵ���� �����б�
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
		}//�����forѭ�����涼�Ҳ�����Ҫ�ҵ�ֵ ��ô��ִ��indexҲ����-1
		return index;
	}
}