package 设计模式.观察者模式.使用java自带的观察者模式_不重要.发布者;//  Lvcang created at  2017-11-10 15:24


import java.util.Observable;

public class WeatherCenter extends Observable
{

    @Override public void notifyObservers(Object arg)
    {
        //arg="明天下雨";
        this.setChanged();// f发布之前必须先设置变化
        System.out.println("气象中心发布："+arg);
        super.notifyObservers(arg);
    }
}
