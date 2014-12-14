

public class ForDemo5{
	public static void main(String[] args){
		//Scanner sc=new Scanner(System.in);
		//System.out.println("请输入一个100到999之间的数");
		//int number=sc.nextInt();

		for(int x=100;x<10000;x++){
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
		
			if(x==(ge*ge*ge+shi*shi*shi*+bai*bai*bai)){
				System.out.println(x);
			}
		}
	}
}