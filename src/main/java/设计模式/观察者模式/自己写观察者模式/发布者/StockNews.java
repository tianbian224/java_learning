package 设计模式.观察者模式.自己写观察者模式.发布者;//  Lvcang created at  2017-11-10 14:49

import 设计模式.观察者模式.自己写观察者模式.订阅者.SubscriberI;

import java.util.ArrayList;

/**
 * 股票新闻
 */
public class StockNews implements NewsSubjectI {
    private ArrayList<SubscriberI> observors;// 订阅者列表

    public StockNews() {
        this.observors = new ArrayList();
    }

    //产生新的新闻
    public void report(String news) {
        System.out.println("股票主题发布：" + news);
        notice(news);

    }

    @Override
    public void regist(SubscriberI observer) {
        // 谁订阅，就把谁添加到订阅者列表当中
        this.observors.add(observer);
    }

    @Override
    public void remove(SubscriberI observer) {
        //取消订阅，就把他 从订阅者列表中删除
        this.observors.remove(observer);
    }

    @Override
    public void notice(String news) {
        // 出现事件，就执行所有订阅者的方法
        for (SubscriberI s : observors) {
            s.update(news);
            Math.min(10, 10);
        }
    }
}
