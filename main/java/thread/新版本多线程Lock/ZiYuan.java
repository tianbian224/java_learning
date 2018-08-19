package thread.新版本多线程Lock;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ZiYuan
{
	private String name;
	private int age;
	private boolean has=false;
	private Lock lock=new ReentrantLock();
	private Condition condition_ppp=lock.newCondition();
	private Condition condition_ccc=lock.newCondition();
	
	public void set()
	{
		lock.lock();
		while(has==true)
		{
			
			try
			{
				condition_ppp.await();
			} catch (InterruptedException e)
			{
				//这里是强制结束冻结状态，转向运行状态。
				//这样就可以操作标记，让线程结束
				
			}
		}
		
		Random random=new Random();
		int flag=random.nextInt()%2;
		if(flag==0)
		{
			this.name="AAA";
			this.age=1000000;
			System.out.println(Thread.currentThread().getName()+"===="+name);
		}
		else 
		{
			this.name="BBB";
			this.age=1111111;
			System.out.println(Thread.currentThread().getName()+"===="+name);
		}
		has=true;
		condition_ccc.signal();
		lock.unlock();
	}
	
	public void get()
	{
		lock.lock();
		while(has==false)
		{
			try
			{
				condition_ccc.await();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"===|||||||||||=="+name);
		has=false;
		condition_ppp.signal();
		lock.unlock();
	}
}
