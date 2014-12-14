import java.util.*;
class Function{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据在1都n之间的");
		int n=sc.nextInt();
		
		printnn(n);
	}
	
	public static void printnn(int n){
		for(int x=1;x<=n;x++){
			for(int y=1;y<=x;y++){
				System.out.print(x+"*"+y+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}
}