package 设计模式.观察者模式.使用java自带的观察者模式_不重要;//  Lvcang created at  2017-11-10 15:32

import 设计模式.观察者模式.使用java自带的观察者模式_不重要.发布者.WeatherCenter;
import 设计模式.观察者模式.使用java自带的观察者模式_不重要.订阅者.Doctor;
import 设计模式.观察者模式.使用java自带的观察者模式_不重要.订阅者.Teacher;

public class Pro
{
    public static void main(String[] args)
    {
        WeatherCenter center = new WeatherCenter();
        Teacher t=new Teacher(center);
        Doctor doctor = new Doctor(center);

        center.notifyObservers("明天下雨");
    }
}
