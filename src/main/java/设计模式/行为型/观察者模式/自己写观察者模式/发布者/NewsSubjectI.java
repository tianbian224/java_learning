package 设计模式.行为型.观察者模式.自己写观察者模式.发布者;

import 设计模式.行为型.观察者模式.自己写观察者模式.订阅者.SubscriberI;

// 新闻主题接口
public interface NewsSubjectI
{
    /**
     * 注册订阅者
     */
    public void regist(SubscriberI observer);

    /**
     * 移除订阅者
     */
    public void remove(SubscriberI observer);

    /**
     * 通知订阅者
     */
    public void notice(String news);
}
