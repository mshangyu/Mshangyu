public class Array2{
	public static void main(String[] args){
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		// for(int x=0;x<arr.length;x++){
			// System.out.println(arr[x]);
			// int[] z=arr[x];//���յ�һά�����ֵ����һ��һά����������
			// for(int y=0;y<z.length;z++){
				// System.out.println(z[y]);
			// }
			// System.out.println();
		// }
		
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.println(arr[x][y]);
			}
			System.out.println();
		}
		
		
	}
}