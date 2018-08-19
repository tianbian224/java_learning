package 语法.proxy.dynamicProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 将如何代理放在内部类中
public class Pro2
{

	public static void main(String[] args)
	{
		// 1.被代理对象
		final Actor actor = new Actor();
		// 2.代理人
		IActor actorProxy = (IActor) Proxy.newProxyInstance(actor.getClass().getClassLoader(),
				actor.getClass().getInterfaces(), new InvocationHandler()
				{

					public Object invoke(Object proxy, Method method, Object[] arg0) throws Throwable
					{
						if (method.getName().equals("play"))
						{
							System.out.println("开启事务");
							method.invoke(actor, arg0[0]);
							System.out.println("关闭事务");
						}
						// 别的if条件判断其他方法需要被如何代理
						if (method.getName().equals("show"))
						{
							System.out.println("show 方法前准备工作,没有和远平王结婚");
							method.invoke(actor, arg0[0], arg0[1]);
							System.out.println("show 方法后，和远平王结婚");
						}
						return null;// 是否返回没什么区别
					}
				});
		// 3. 代理人去干活
		actorProxy.play("fanbingbing");
		actorProxy.show("zhanglanan", "gangguanwu");

		// 动态代理和静态代理区别：
		// 静态代理需要：
		// 1. 对于开启事务、记录日志类需求，需要为每个方法写重复代码，很繁琐，动态代理只需要写一次。
		// 2. 对于个性化的方法，动态代理和静态代理一样，还是要针对性的写个性化代码
		// 3. 动态代理中需要判断方法名称。
	}

}
