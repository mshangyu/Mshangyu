
import java.util.*;

class FK{
	void bx(){
		System.out.println("����");
	}
}

class FK_czx extends FK{//������
	void bx(){
		System.out.println("�����������ڱ���");
	}
}
class FK_lzx extends FK{//l����
	void bx(){
	System.out.println("l���������ڱ���");
	}
}
class FK_zzx extends FK{//z����
	void bx(){
	System.out.println("z���������ڱ���");
	}

}
class FK_szx extends FK{//ɽ����
	void bx(){
	System.out.println("ɽ�����ڱ���");
	}
}
class FK_tzx extends FK{//ɽ����
	void bx(){
	System.out.println("�������ڱ���");
	}
}



class Test653{
	public static void main(String[] args){
		Random r=new Random();
		int a=r.nextInt(3);//3��ʾ���������012������
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
				fk=new FK_czx();//����ת��
				break;
			case 4:
				fk=new FK_tzx();
				break;
		}
		fk.bx();
	}














}