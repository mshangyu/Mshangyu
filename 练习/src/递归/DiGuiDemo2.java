package 递归;

public class DiGuiDemo2 {
	public static void main(String[] args) {
		System.out.println(f(24));

	}
	public static int f(int n){
		if (n==1||n==2) {//前两个月都是1的
			return 1;
		}else {
			return f(n-1)+f(n-2);
		}
		
	}

}
