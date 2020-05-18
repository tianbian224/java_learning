package 设计模式.结构型.外观模式.SubSystem;//  Lvcang created at  2018-03-27 22:21,have fun~


//  电源子系统
public class Power
{
    public void start()
    {
        System.out.println("电源通电");
    }

    public void turnOff()
    {
        System.out.println("电源断开");
    }
}
