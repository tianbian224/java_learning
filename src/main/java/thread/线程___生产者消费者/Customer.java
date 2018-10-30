package thread.线程___生产者消费者;
public class Customer implements Runnable
{
	private ZiYuan zz;
	public Customer(ZiYuan zz)
	{
		this.zz=zz;
	}
	public void run()
	{
		while(true)
		{
			zz.get();
		}
	}
}
