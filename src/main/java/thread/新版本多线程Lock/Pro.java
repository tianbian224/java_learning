package thread.新版本多线程Lock;

import java.util.Stack;

public class Pro
{

	public static void main(String[] args)
	{
		ZiYuan zz=new ZiYuan();
		PPP ppp=new PPP(zz);
		PPP ppp2=new PPP(zz);
		PPP ppp3=new PPP(zz);
		CCC ccc=new CCC(zz);
		CCC ccc2=new CCC(zz);
		CCC ccc3=new CCC(zz);
		new Thread(ppp).start();
		new Thread(ppp2).start();
		new Thread(ppp3).start();
		new Thread(ccc).start();
		new Thread(ccc2).start();
		new Thread(ccc3).start();
		
	}
}
