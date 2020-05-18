package 设计模式.观察者模式.重写.发布;

import 设计模式.观察者模式.重写.订阅.IListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cang.lv
 * @Date: 2020/05/18 16:50
 * @Description:
 */
public class FootballNews implements INewsCenter {
    private List<IListener> listeners;

    public FootballNews() {
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
