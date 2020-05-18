package 设计模式.结构型.装饰模式.被装饰类;//  Lvcang created at  2017-09-07 20:30

public class Workcode implements Runnable
{

    @Override public void run()
    {
        try
        {
            Thread.sleep(2000);
            System.out.println("被装饰类正在运行");
        } catch (InterruptedException e)
        {
            throw new RuntimeException("执行代码异常");
        }
    }
}



