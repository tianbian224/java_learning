package thread.线程练习;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Resource
{
	private String nameString;
	private int ID;
	private int flag=0;
	public boolean has=false;
	
	public synchronized void setResource()
	{
		
		if (flag==0)
		{
			this.nameString="��ƷAAA";
			this.ID=111111;
		}
		else if(flag==1)
		{
			this.nameString="��ƷBBB";
			this.ID=222222;
		}
		else 
		{
			this.nameString="��Ʒ";
			this.ID=333333;
		}
		Random random=new Random();
		flag=random.nextInt(3);
	}
	
	public synchronized void getResource()
	{
		System.out.println(Thread.currentThread().getName()+this.nameString+"===="+this.ID);
	}
}
