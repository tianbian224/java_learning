package thread.线程安全;
public class Bank extends Thread 
{
	public static int sum=0;
	public synchronized void add(int num)
	{
		
		sum+=num;//共享数据处，容易中断
		System.out.println(sum);
		
	}
	
	public void sub(int num)
	{
		sum-=num;
	}
}
