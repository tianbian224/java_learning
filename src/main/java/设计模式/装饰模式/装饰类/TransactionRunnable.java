package 设计模式.装饰模式.装饰类;//  Lvcang created at  2018-03-27 21:20,have fun~

public class TransactionRunnable implements Runnable
{

    private Runnable worker;

    public TransactionRunnable(Runnable worker)
    {
        this.worker = worker;
    }

    @Override public void run()
    {
        System.out.println("开始事务");
        worker.run();
        System.out.println("执行事务");

    }
}