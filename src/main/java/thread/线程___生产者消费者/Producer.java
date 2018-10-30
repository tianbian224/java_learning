package thread.线程___生产者消费者;
import java.util.Set;

public class Producer implements Runnable
{
	private ZiYuan zz;
	public Producer(ZiYuan zz)
	{
		
		this.zz=zz;
	}
	public void run()
	{
		while(true)
		{
			zz.set();
		}
	}
}
