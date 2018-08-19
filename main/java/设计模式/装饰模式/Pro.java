package 设计模式.装饰模式;//  Lvcang created at  2017-09-07 20:37
//2018年3月27日21:23:59  复习

import 设计模式.装饰模式.被装饰类.Workcode;
import 设计模式.装饰模式.装饰类.LoggingRunnable;

public class Pro
{
    public static void main(String[] sds)
    {
        Runnable runnable = new LoggingRunnable(new Workcode());
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
