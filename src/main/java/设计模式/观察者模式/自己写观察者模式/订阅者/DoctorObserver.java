package 设计模式.观察者模式.自己写观察者模式.订阅者;//  Lvcang created at  2017-11-10 15:08

// DoctorObserver类当订阅者，就实现订阅者接口，复写事件出现时的处理方法
public class DoctorObserver implements SubscriberI
{


    public DoctorObserver()
    {

    }

    // 对事件的处理方法：收到事件通知时的处理逻辑
    @Override public void update(String news)
    {
        System.out.println("医生收到了信息:" + news);
    }
}
