package 设计模式.观察者模式.自己写观察者模式;//  Lvcang created at  2017-11-10 15:10

import 设计模式.观察者模式.自己写观察者模式.发布者.StockNews;
import 设计模式.观察者模式.自己写观察者模式.订阅者.DoctorObserver;
import 设计模式.观察者模式.自己写观察者模式.订阅者.TeacherObserver;

// 测试：观察者模式

/**
 * 有如下几个方面：
 * 1. 发布者
 * 2. 订阅者
 * 3. 事件处理函数。也就是事件出现时的处理方法
 * 4. 触发事件
 */
public class Pro {
    public static void main(String[] args) {
        // 发布者
        StockNews stockNews = new StockNews();
        // 订阅者
        DoctorObserver doc = new DoctorObserver();//新建医生对象
        TeacherObserver tea = new TeacherObserver();// 新建老师对象
        //订阅者订阅发布者
        stockNews.regist(doc);
        stockNews.regist(tea);

        // 触发事件
        stockNews.report("上证指数跌停！");
        // 取消订阅
        stockNews.remove(doc);
        // 再次触发事件
        stockNews.report("涨停！");

    }
}
