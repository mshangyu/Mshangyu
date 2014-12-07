
import java.util.*;

class FK{
	void bx(){
		System.out.println("变形");
	}
}

class FK_czx extends FK{//长方形
	void bx(){
		System.out.println("长方形字型在变形");
	}
}
class FK_lzx extends FK{//l字型
	void bx(){
	System.out.println("l字型字型在变形");
	}
}
class FK_zzx extends FK{//z字型
	void bx(){
	System.out.println("z字型字型在变形");
	}

}
class FK_szx extends FK{//山字型
	void bx(){
	System.out.println("山字形在变形");
	}
}
class FK_tzx extends FK{//山字型
	void bx(){
	System.out.println("田字形在变形");
	}
}



class Test653{
	public static void main(String[] args){
		Random r=new Random();
		int a=r.nextInt(3);//3表示会随机产生012三个数
		FK fk=null;
		switch(a){
			case 0:
				fk=new FK_szx();
				break;
			case 1:
				fk=new FK_lzx();
				break;
			case 2:
				fk=new FK_zzx();
				break;
			case 3:
				fk=new FK_czx();//向上转型
				break;
			case 4:
				fk=new FK_tzx();
				break;
		}
		fk.bx();
	}














}