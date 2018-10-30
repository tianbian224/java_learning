package thread.线程练习;

public class Pro
{

	public static void main(String[] args)
	{
		Resource resource=new Resource();
		Producer producer=new Producer(resource);
		Customer customer=new Customer(resource);
		Thread thread1=new Thread(producer);
		Thread thread2=new Thread(customer);
		thread1.start();
		thread2.start();

	}

}
