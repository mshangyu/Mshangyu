public class Test06.67{
	private String prop="�ⲿ�ڵ�ʵ������";
	private class InClass{
		private String prop="�ڲ����ʵ������";
		public void info(){
			String prop="�ֲ�����";
			//ͨ�� �ⲿ������.this.varName �����ⲿʵ��������Ա����
			System.out.println("�ⲿ��ĳ�Ա����ֵ��"+Test06.67.this.prop);
			//ͨ�� this.varName �����ڲ���ʵ���ĳ�Ա����ֵ
			System.out.println("�ڲ���ĳ�Ա����ֵ��"+this.prop);
			//ֱ�ӷ��ʾֲ�����
			System.out.println("�ֲ�������ֵ��"+prop);
		}
	}
	public void test{
		InClass in=new InClass();
		in.info();
	}
	public static void main(String[] args){
		new Test06.67().test();
	}
}