 class Cow{
	private double weight;
	//�ⲿ����������صĹ��췽��
	public Cow(){}
	public Cow(double weight){
		this.weight=weight;
	}
	//����һ���Ǿ�̬�ڲ���
	private class Cowleg{
		//�Ǿ�̬�ڲ����������Ա����
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������ع�����
		public Cowleg(){}
		public Cowleg(double length,String color){
			this.length=length;
			this.color=color;
		}
		
		public double setLength(double length){
			this.length=length;
		}
		public double getLength(){
			return this.length;
		}
		public String setColor(String color){
			this.color=color;
		}
		public String  getColor(){
			return this.color;
		}
		
		//�Ǿ�̬�ڲ����ʵ������
		public void info(){
			System.out.println("��ǰţ����ɫ�ǣ�"+color+".���ǣ�"+weight);
		}
		
	}
	public void test(){
		Cowleg c1=new Cowleg(1.12,"�ڰ����");
	}
	public static void main(String[] args){
		Cow cow=new Cow(378.9);
		cow.test();
	}
	
}