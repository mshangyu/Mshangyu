package �ݹ�;

public class RabbbitDemo {
	public static void main(String[] args) {
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		
		for (int x = 2; x < 20; x++) {
			arr[x]=arr[x-1]+arr[x-2];
			System.out.println("��"+(x+1)+"���µ�����������"+arr[x]);
		}

	}

}
