package 设计模式.观察者模式.自己写观察者模式.发布者;//  Lvcang created at  2017-11-10 14:50

import 设计模式.观察者模式.自己写观察者模式.订阅者.SubscriberI;

/**
 * 政治新闻
 */
public class PoliticalNews implements NewsSubjectI {
    @Override
    public void regist(SubscriberI observer) {

    }

    @Override
    public void remove(SubscriberI observer) {

    }

    @Override
    public void notice(String news) {

    }
}
