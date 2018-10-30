package thread.线程间通信;

public class Output implements Runnable
{
	private ZiYuan zz;
	public Output(ZiYuan aa)
	{
		zz=aa;
	}
	public void run()
	{
		while(true)
		{
			synchronized(zz)
			{
				if(!zz.has)//没有就等待
					try{zz.wait();}catch (Exception e) {};
				System.out.println(zz.name+"===="+zz.age);//一句话也要同步
				//因为和input使用了同一个对象
				zz.has=false;
				zz.notify();
				
			}
			
		}
	}
}
/*
线程安全的两条件
1.多个线程使用同一个资源
2.使用同一个锁:这里是zz和Input中的ziYuan相同，是同一个锁
*/