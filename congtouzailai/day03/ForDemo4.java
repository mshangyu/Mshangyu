public class ForDemo4{
	public static void main(String[] args){
		int sum=0;
		for(int x=1;x<=100;x++){
			if(x%2==0){
				sum=sum+x;
			}
		}
		System.out.println(sum);
		int sum1=0;
		for(int y=0;y<=100;y+=2){
			sum1=sum1+y;
		}
		System.out.println(sum1);
	}
}