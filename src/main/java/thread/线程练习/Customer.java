package thread.线程练习;

public class Customer implements Runnable
{
	private Resource  resource=null;
	
	public Customer(Resource rr)
	{
		resource=rr;
	}
	
	public void run()
	{
		resource.getResource();
	}
}
