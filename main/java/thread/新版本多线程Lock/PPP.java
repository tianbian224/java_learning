package thread.新版本多线程Lock;

public class PPP implements Runnable
{
	private ZiYuan zz;
	public PPP(ZiYuan aYuan)
	{
		zz=aYuan;
	}
	public void run()
	{
		while(true)
		{
			zz.set();
		}
	}
}