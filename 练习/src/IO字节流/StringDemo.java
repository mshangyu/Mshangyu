package IO字节流;
//中文存储的时候 最高位为1
//不是中文的存储 最高位时0
public class StringDemo {
	public static void main(String[] args) {
		//String s="abcde";
		String s="中国你好我爱你";
		
		byte[] bys=s.getBytes();
		for (byte b : bys) {
			System.out.println(b);
		}
	}

}
