package 语法.OOM异常;

// 产生大量的线程造成栈溢出
public class TestMultiThreadStack
{
	public static void main(String[] ds)
	{
		for (int i = 1; i < 1000000000; i++)
		{
			Thread d = new Thread(new MyThread());
			d.start();
		}
		System.out.println("完成");
	}
}

class MyThread implements Runnable
{

	@Override
	public void run()
	{
		try
		{
			Thread.sleep(1000000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
