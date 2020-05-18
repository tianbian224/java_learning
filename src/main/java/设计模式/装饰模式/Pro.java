package 设计模式.装饰模式;//  Lvcang created at  2017-09-07 20:37
//2018年3月27日21:23:59  复习

import 设计模式.装饰模式.被装饰类.Workcode;
import 设计模式.装饰模式.装饰类.LoggingRunnable;

/**
 * 适配器模式和装饰器模式非常类似，都叫包装模式，注意以下区别：
 * 1. 装饰器模式注重功能增强，适配器强调不同对象的转换。所以在代码层面来说，
 * 装饰器要持有源对象，实现的目标对象的接口，进而源到目标的转换。而装饰器持有源对象，实现的也是源对象的接口，进而实现对源的增强
 */
public class Pro {
    public static void main(String[] sds) {
        Runnable runnable = new LoggingRunnable(new Workcode());
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
