package thread.线程___生产者消费者;

import java.util.Random;

public class ZiYuan
{
	private String name;
	private int ID;
	public boolean hasZiYuan=false;
	
	public synchronized  void set()
	{
		
		while (hasZiYuan==true)//if �ĳ�while�������жϱ��
		{
			try
			{ 
				this.wait();//�����ǹؼ�����Ҫ�ǿ��԰��Լ���ͬ�﻽�ѣ�ͬ�ﲻ���жϣ�ֱ������
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		Random random=new Random();
		int flag=random.nextInt()%3;
		if(flag==0)
		{
			this.name="��ƷAA";
			this.ID=1111111;
			System.out.println("�߳�����"+Thread.currentThread().getName()+
					"=88����88=="+this.name+"="+this.ID);
		}
		else if(flag==1) 
		{
			this.name="��ƷBB";
			this.ID=2222222;
			System.out.println("�߳�����"+Thread.currentThread().getName()+"=88����88=="+this.name+"="+this.ID);
		}
		else
		{
			this.name="��ƷCC";
			this.ID=3333333;
			System.out.println("�߳�����"+Thread.currentThread().getName()+"=88����88=="+this.name+"="+this.ID);
		}
		
		hasZiYuan=true;
		this.notifyAll();
	}
	public synchronized void get()
	{
		while(hasZiYuan==false)
		{
			
			try
			{
				this.wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("�߳�����"+Thread.currentThread().getName()+"==="+this.name+"="+this.ID);
		hasZiYuan=false;
		this.notifyAll();
		
	}
}
