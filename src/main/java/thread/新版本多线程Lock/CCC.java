package thread.新版本多线程Lock;


public class CCC implements Runnable
{
	private ZiYuan zz;
	public CCC(ZiYuan aYuan)
	{
		zz=aYuan;
	}
	public void run()
	{
		while(true)
		{
			zz.get();
		}
	}
}
