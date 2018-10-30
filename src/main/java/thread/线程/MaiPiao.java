package thread.线程;

public class MaiPiao extends Thread
{
    public	static  int sum=100;
    
    public MaiPiao(String name)//调用父类的构造函数，设置线程名称
    {
    	super(name);
    }
    
    public void run()
    {
    	while (true)
		{
			if(sum>0)
			{
				System.out.println(this.getName()+"===买票===="+sum);
				sum--;
			}
			else
				break;
		}
    }
}
