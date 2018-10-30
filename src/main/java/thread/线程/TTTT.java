package thread.线程;

public class TTTT extends Thread
{

	private int num = 100;

	@Override
	public void run()
	{

		if (this.num >= 0)
		{
			System.out.println(Thread.currentThread().getName() + "=====" + num--);
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
