package 语法.多态.多态之继承.父子类方法调用;


import 语法.多态.多态之继承.父类构造器中有this.Person;

// 父类
public class Cat extends Animal
{
	public Cat()
	{
		System.out.println("cat null");
	}

	public Cat(int a, int b, int c)
	{
		this(12, 23);
		c=10;
		System.out.println("cat 3");
	}

	public Cat(int a, int b)
	{
		System.out.println("cat null");
	}



	@Override
	public void DD()
	{
		System.out.println("子类复写父类方法DD");
	}

	@Override
	public void EE()
	{
		super.EE();
		System.out.println("重用父类方法，复写父类方法");
	}

	//@Override
	public static void FF()
	{
		System.out.println("不能复写父类静态方法");
	}

	public static void main(String[] dac)
	{
		Cat cc = new Cat();

		// instanceof 运算符
		System.out.println(cc instanceof Object);
		System.out.println(cc instanceof Animal);


		cc.A();
		cc.C();
		cc.DD();
		Cat.FF();
		assert cc==null ;
		System.out.println(cc);
		Animal animal = new Cat(10,11);
		animal.DD();
		Animal a2=new Animal();
		a2.DD();


	}
}
