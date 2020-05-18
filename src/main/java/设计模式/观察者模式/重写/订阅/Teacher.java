package 设计模式.观察者模式.重写.订阅;

import 设计模式.观察者模式.重写.发布.INewsCenter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cang.lv
 * @Date: 2020/05/18 16:56
 * @Description:
 */
public class Teacher implements IListener {
    private List<INewsCenter> newsCenter;

    public Teacher(List<INewsCenter> newsCenter) {
        this.newsCenter = new ArrayList<>();
        this.newsCenter.addAll(newsCenter);
        newsCenter.forEach(a -> a.addSubcribe(this));
    }


    @Override
    public void doWork(String news) {
        System.out.println("teacher resived " + news);
    }
}
