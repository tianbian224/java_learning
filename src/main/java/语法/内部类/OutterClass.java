package 语法.内部类;

public class OutterClass
{
	private String oname = "AAAAAA";
	private int age;

	static class InnerClass
	{
		String age = "21";

		static String name = "aaaaa";

		public void m1()
		{
			System.out.println("�ڲ��෽�����ڲ����Ա");// Ĭ����InnerClass.this.name
			// System.out.println("�ڲ��෽�����ⲿ���Ա" + OutterClass.this.name);
		}
	}

	public static void main(String[] args)
	{

	}

	public static void m2()
	{
		System.out.println();
	}

}
