public class Test06.67{
	private String prop="外部内的实例变量";
	private class InClass{
		private String prop="内部类的实例变量";
		public void info(){
			String prop="局部变量";
			//通过 外部类类名.this.varName 访问外部实例变量成员变量
			System.out.println("外部类的成员变量值："+Test06.67.this.prop);
			//通过 this.varName 访问内部类实例的成员变量值
			System.out.println("内部类的成员变量值："+this.prop);
			//直接访问局部变量
			System.out.println("局部变量的值："+prop);
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