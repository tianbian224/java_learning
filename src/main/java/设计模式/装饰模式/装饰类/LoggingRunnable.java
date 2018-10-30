package 设计模式.装饰模式.装饰类;//  Lvcang created at  2018-03-27 21:20,have fun~

public class LoggingRunnable implements Runnable
{

    private Runnable worker;

    public LoggingRunnable(Runnable worker)
    {
        this.worker = worker;
    }

    @Override public void run()
    {
        System.out.println("开始时间" + System.currentTimeMillis());
        worker.run();
        System.out.println("结束时间" + System.currentTimeMillis());

    }
}
