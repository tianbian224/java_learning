package 语法.多态.多态之继承.父子类方法调用;

public class Animal
{
	private int a = 90;

	public Animal()
	{
		System.out.println("Anilam");
	}

	public void A()
	{
		System.out.println("A");
	}


	// private只是C方法的一部分，可以被调用
	private void B()
	{
		System.out.println("MM");
	}

	public void C()
	{
		A();
		B();
		System.out.println("C");
	}

	public void DD()
	{
		System.out.println("被子类复写");
	}

	public void EE()
	{
		System.out.println("被子类重用、复写");
	}

	public static void FF()
	{
		System.out.println("父类静态方法");
	}
}
