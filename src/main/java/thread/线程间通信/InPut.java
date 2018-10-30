package thread.线程间通信;

public class InPut implements Runnable
{
	private ZiYuan ziYuan;
	private boolean flag=true;
	public InPut(ZiYuan aa)
	{
		ziYuan=aa;
	}
	public void run()
	{ 
		while(true)
		{
			
			synchronized (ziYuan)
			{
				if(ziYuan.has)//有就等待
					try{ziYuan.wait();}catch (Exception e) {};
				if(flag)
				{
					
					ziYuan.name="AAAA";
					ziYuan.age=1000000;
					flag=false;
				}
				else
				{
					ziYuan.name="BBBBB";
					ziYuan.age=1111111;
					flag=true;
				}
				ziYuan.has=true;//添加了数据
				ziYuan.notify();
			}//end synchronized
		
		}
	}
}
