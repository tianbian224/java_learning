package 语法.proxy.dynamicProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 如何代理
public class MyInvocationHandler implements InvocationHandler
{
	private Actor actor = null;

	public MyInvocationHandler(Actor actor)
	{
		this.actor = actor;
	}

	// 如何代理
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		if (method.getName().equals("play"))
		{
			System.out.println("开启事务");
			method.invoke(actor, args[0]);
			System.out.println("关闭事务");
		}
		// 别的if条件判断其他方法需要被如何代理
		if (method.getName().equals("show"))
		{
			System.out.println("show 方法前准备工作,没有和远平王结婚");
			method.invoke(actor, args[0], args[1]);
			System.out.println("show 方法后，和远平王结婚");
		}
		return null;// 是否返回没什么区别
	}

}
