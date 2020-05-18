package 设计模式.行为型.观察者模式.自己写观察者模式.订阅者;

/**
 * 新闻订阅者接口
 * 哪一个类想当订阅者，就实现这个接口
 */
public interface SubscriberI
{
    /**
     * 订阅者实现这个接口，复写这个方法
     * 方法表示出现订阅的事件时，订阅者的处理逻辑
     */
    public void update(String news);
}
