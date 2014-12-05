import java.util.*;
public class Test313{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("---------猜拳游戏-------");
		System.out.println("请出拳（1、剪刀2、石头3、布）");
		int person=in.nextInt();
		int computer=(int)Math.random()*3+1;
		String Marks="拳头";//这是给人做一个标记
		String Marks2="拳头";//这是给电脑做一个标记
		switch(person){
			case 1:
			Marks="剪刀";
			break;
			case 2:
			Marks="石头";
			break;
			case 3:
			Marks="布";
			break;
		}
		switch(computer){
			case 1:
			Marks2="剪刀";
			break;
			case 2:
			Marks2="石头";
			break;
			case 3:
			Marks2="布";
			break;
		}
		if(person==computer){
			System.out.println("你出的是："+Marks+"电脑出的是："+Marks2+"平局");
		}else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
			System.out.println("你出的是："+Marks+"电脑出的是："+Marks2+"你输了");
		}else{
			System.out.println("你出的是："+Marks+"电脑出的是："+Marks2+"你赢了");
		}
	}
}