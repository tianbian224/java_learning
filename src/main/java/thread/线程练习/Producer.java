package thread.线程练习;

public class Producer implements Runnable
{
	private Resource resource=null;
	public Producer(Resource rr)
	{
		this.resource=rr;
	}
	
	public void run()
	{
		resource.setResource();
	}
}
