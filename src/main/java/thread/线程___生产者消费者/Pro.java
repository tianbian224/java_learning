package thread.线程___生产者消费者;

public class Pro
{

	public static void main(String[] args)
	{
		ZiYuan zz=new ZiYuan();
		Producer p1=new Producer(zz);
		Producer p2=new Producer(zz);
		Customer c1 =new Customer(zz);
		Customer c2=new Customer(zz);
		Customer c3=new Customer(zz);
		
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(c3).start();
		
	}

}
