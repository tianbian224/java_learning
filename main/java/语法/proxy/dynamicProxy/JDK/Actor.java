package 语法.proxy.dynamicProxy.JDK;

public class Actor implements IActor
{

	@Override
	public void play(String name)
	{
		System.out.println("演员：" + "___" + name);
	}

	@Override
	public void show(String name, String jiemu)
	{
		System.out.println(name + "执行show方法————" + jiemu);
	}

}
