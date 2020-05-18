package 设计模式.创建型.单例模式;//  Lvcang created at  2017-11-14 10:52

// 双重检查锁   2018年3月27日21:16:00 复习
public class Singleton {
    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) singleton = new Singleton();
            }
        }
        return singleton;
    }

    private Singleton() {
    }


}
