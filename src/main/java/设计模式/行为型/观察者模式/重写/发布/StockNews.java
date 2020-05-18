package 设计模式.行为型.观察者模式.重写.发布;

import 设计模式.行为型.观察者模式.重写.订阅.IListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cang.lv
 * @Date: 2020/05/18 16:50
 * @Description:
 */
public class StockNews implements INewsCenter {
    private List<IListener> listeners;

    public StockNews() {
        this.listeners = new ArrayList<>();
    }

    @Override
    public void notify(final String news) {
        listeners.forEach(a -> a.doWork(news));
    }

    @Override
    public void addSubcribe(IListener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(IListener listener) {
        this.listeners.remove(listener);
    }
}
