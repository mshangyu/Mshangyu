import java.util.*;
public class Test59{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String[] arr=new String[7];
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"���ַ�");
			arr[i]=in.next();

		}
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--){  //�˴���int i=arr.length-1��ָ����ĳ��ȼ�һ���������±�ֵ
		System.out.println(arr[i]);//�����������
		}

	}



}
/* ԭ�����������ֵΪa��b��c��d��e��f��g  ��������������ǰ���gfedcba��˳�����*/