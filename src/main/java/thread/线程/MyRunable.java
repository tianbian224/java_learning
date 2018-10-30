package thread.线程;

public class MyRunable implements Runnable
{
	public void run()
	{
		int i=100;
		while(i>0)
		{
			 System.out.println("ʵ��Runable�ӿ�");
			 i--;
		}
	}
}
