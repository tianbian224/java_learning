package 设计模式.行为型.观察者模式.重写.发布;

import 设计模式.行为型.观察者模式.重写.订阅.IListener;

/**
 * @Author: cang.lv
 * @Date: 2020/05/18 16:47
 * @Description: 发布者
 */
public interface INewsCenter {
    /**
     * 发布通知
     */
    void notify(String news);

    /**
     * 添加订阅者
     */
    void addSubcribe(IListener listener);

    /**
     * 移除订阅者
     */
    void removeListener(IListener listener);
}
