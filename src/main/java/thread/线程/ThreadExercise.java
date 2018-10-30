package thread.线程;

public class ThreadExercise extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("线程计数" + i);
		}
	}
}
