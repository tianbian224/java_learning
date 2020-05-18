package 设计模式.观察者模式.重写;

import com.google.common.collect.Lists;
import 设计模式.观察者模式.重写.发布.FootballNews;
import 设计模式.观察者模式.重写.发布.StockNews;
import 设计模式.观察者模式.重写.订阅.Teacher;

/**
 * @Author: cang.lv
 * @Date: 2020/05/18 16:58
 * @Description:
 */
public class Pro {
    public static void main(String[] args) {
        StockNews s = new StockNews();
        FootballNews f = new FootballNews();
        Teacher t = new Teacher(Lists.newArrayList(s, f));

        s.notify("stock news published");
        f.notify("football news published");
    }
}
