package thread.线程间通信;
public class Pro
{

	public static void main(String[] args)
	{
		ZiYuan j=new ZiYuan();
		InPut ii=new InPut(j);
		Output oo=new Output(j);
		
		Thread t1=new Thread(ii);
		Thread t2=new Thread(oo);
		
		t1.start();
		t2.start();
	}

}
