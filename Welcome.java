public class Welcome{
	public static void main(String args[]){
		String[] greeting=new String[3];
		greeting[0] = "Welcome to Core Java";
		greeting[1] ="by Cay Horstman";
		greeting[2] ="and Cray Corne11";
		for (String g : greeting)
			System.out.println(g);
	}
}