package thread.死锁验证;


public class MyThread extends Thread
{
	private boolean flag;
	public MyThread(boolean flag)
	{
		this.flag=flag;
	}
	public void run()
	{
		if(flag)
		{
			synchronized(MyLock.a)
			{
//				try
//				{
//					Thread.sleep(1000);
//				} catch (Exception e)
//				{
//					// TODO: handle exception
//				}
				System.out.println("true===out ===synchronized");
				synchronized (MyLock.b)
				{
					System.out.println("true===in===synchronized");
				}
			}
		}
		else
		{
			synchronized(MyLock.b)
			{
				System.out.println("false==out ===synchronized");
				synchronized (MyLock.a)
				{
					System.out.println("false==in===synchronized");
				}
			}
		}
	}
}
