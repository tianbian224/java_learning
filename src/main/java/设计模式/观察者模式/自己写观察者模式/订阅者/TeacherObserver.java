package 设计模式.观察者模式.自己写观察者模式.订阅者;//  Lvcang created at  2017-11-10 15:04

public class TeacherObserver implements SubscriberI {

    public TeacherObserver() {
    }

    //事件处理函数
    @Override
    public void update(String news) {
        System.out.println("老师收到了信息:" + news);
    }
}
