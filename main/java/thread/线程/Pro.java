package thread.线程;
public class Pro
{

	public static void main(String[] args)
	{
		// ThreadExercise tt=new ThreadExercise();
		// tt.start();

		// MaiPiao p1 = new MaiPiao("��ƱԱ1");
		// MaiPiao p2 = new MaiPiao("��ƱԱ2");
		// MaiPiao p3 = new MaiPiao("��ƱԱ3");
		//
		// p2.start();
		// p3.start();

		// MyRunable mm=new MyRunable();
		// Thread lvcThread=new Thread(mm);
		// lvcThread.start();

		test();
		System.out.println("==========");
		testIsAlive();

	}

	// Ҳ���̲߳���ȫ�ģ�run���������̵߳Ĵ���������ͬһ���̶߳���ͬһ������
	public static void test()
	{
		TTTT produce = new TTTT();
		Thread t1 = new Thread(produce, "�߳�1");
		Thread t2 = new Thread(produce, "�߳�2");
		Thread t3 = new Thread(produce, "�߳�3");
		t1.start();
		t2.start();
		t3.start();

	}

	public static void testIsAlive()
	{
		TTTT produce = new TTTT();
		System.out.println(produce.isAlive());
		produce.start();
		System.out.println(produce.isAlive());
	}

}
