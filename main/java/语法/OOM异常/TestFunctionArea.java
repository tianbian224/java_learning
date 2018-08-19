package 语法.OOM异常;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

interface Itest
{
	public void Play();
}

class Door implements Itest
{

	public void Play()
	{
		System.out.println("nei");
	}

}

// 测试方法区溢出，方法区保存了类的信息，向方法区填充大量的类可以造成方法区溢出
// 参数：-XX:PermSize1M -XX：MaxPermSize1M
public class TestFunctionArea
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread.sleep(5000);
		while (true)
		{
			Door or = new Door();
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(Door.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor()
			{

				public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable
				{
					return null;
				}
			});
			Door da = (Door) enhancer.create();
			da.Play();
		}

	}
}
