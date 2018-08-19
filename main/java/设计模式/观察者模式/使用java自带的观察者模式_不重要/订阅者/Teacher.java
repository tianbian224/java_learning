package 设计模式.观察者模式.使用java自带的观察者模式_不重要.订阅者;//  Lvcang created at  2017-11-10 15:25

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer
{
    private Observable observable;

    public Teacher(Observable weather)
    {
        this.observable = weather;
        observable.addObserver(this);
    }

    @Override public void update(Observable o, Object arg)
    {
        System.out.println("老师收到：" + arg);
    }
}
