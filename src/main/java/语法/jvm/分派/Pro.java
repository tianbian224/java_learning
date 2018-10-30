package 语法.jvm.分派;

public class Pro
{
	public static void main(String[] cds) throws InterruptedException
	{
		Father Af = new Son();
		Father Bf = new Father();
		// 下面使用重载，也就是静态分派-java是静态多分派的，考虑接收者和方法参数
		Af.Say(12);// 结果："son say age " + 12
		Af.Say("af");

		Bf.Say("bf");// 结果："father say content" + bf
		Bf.Say(45);
		// 下面使用重写，也就是动态分派-Java是动态单分派的，只考虑接收者
		Bf.Smile();
		Af.Smile();// smile方法没有重载，也就是只考虑重写

		// 总结以上就是：复写只考虑接收者，重载考S虑接收者和参数
		// Thread.sleep(10000000);
	}

}

class Father
{
	public void Say(int age)
	{
		System.out.println("father say age " + age);
	}

	public void Say(String content)
	{
		System.out.println("father say content " + content);
	}

	public void Smile()
	{
		System.out.println("father Smile");
	}
}

class Son extends Father
{
	@Override
	public void Say(int age)
	{
		System.out.println("son say age " + age);
	}

	@Override
	public void Say(String content)
	{
		System.out.println("son say content " + content);
	}

	@Override
	public void Smile()
	{
		System.out.println("son Smile");
	}
}