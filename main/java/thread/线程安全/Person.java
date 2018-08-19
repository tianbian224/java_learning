package thread.线程安全;

public class Person implements Runnable
{
	public Bank bank = new Bank();

	@Override
	public void run()
	{
		for (int i = 0; i < 3; i++)
		{
			bank.sub(100);
		}
	}
}
