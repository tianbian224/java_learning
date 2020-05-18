package 设计模式.行为型.观察者模式.使用java自带的观察者模式_不重要.订阅者;//  Lvcang created at  2017-11-10 15:31

import java.util.Observable;
import java.util.Observer;

public class Doctor implements Observer {
    private Observable observable;

    public Doctor(Observable weather) {
        this.observable = weather;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("医生收到：" + arg);
    }
}