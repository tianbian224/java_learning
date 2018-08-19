package thread.死锁验证;


public class ProDeadLock
{

	public static void main(String[] args)
	{
		MyThread m1=new MyThread(true);
		MyThread m2=new MyThread(false);
		m1.start();
		m2.start();

	}

}
