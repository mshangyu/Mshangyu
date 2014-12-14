public class ForDemo9{
	public static void main(String[] args){
		for(int x=1;x<=1000;x++){
			if((x%3==2)&&(x%5==3)&&(x%7==2)){
				System.out.println(x);
			}
		}
	}
}