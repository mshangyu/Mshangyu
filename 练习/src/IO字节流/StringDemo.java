package IO�ֽ���;
//���Ĵ洢��ʱ�� ���λΪ1
//�������ĵĴ洢 ���λʱ0
public class StringDemo {
	public static void main(String[] args) {
		//String s="abcde";
		String s="�й�����Ұ���";
		
		byte[] bys=s.getBytes();
		for (byte b : bys) {
			System.out.println(b);
		}
	}

}
