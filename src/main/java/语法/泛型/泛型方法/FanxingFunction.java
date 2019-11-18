package 语法.泛型.泛型方法;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

/**
 * @author cang.lv
 * @date 2019/11/18 0018 22:33
 * 泛型方法
 */
public class FanxingFunction {
    private static final Logger log = LoggerFactory.getLogger(FanxingFunction.class);

    public static void main(String[] args) {
        // 普通泛型方法
        String sayhello = new FanxingFunction().test1("a", "b");
        // 绑定父类
        Date date = FanxingFunction.test2(new Date(), new Date());
        //FanxingFunction.test2(new FanxingFunction(), new FanxingFunction());


        //

        List<SanJiao> ddd = Lists.newArrayList(new SanJiao());
//        int i = test5(ddd);
        int i1 = test4(ddd);
    }


    /**
     * 定义一个普通的泛型方法
     */
    public <T> T test1(T... arrr) {
        return arrr[0];
    }


    /**
     * 将方形绑定一个类型，只允许输入某个类型的子类
     *
     * @param <T> 只能是Compareable的子类
     */
    public static <T extends Comparable> T test2(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }


    /**
     * 将方形绑定一个类型，只允许输入<span>两个</span>类型的子类
     *
     * @param <T> 只能是Compareable的子类
     */
    public static <T extends Thread & Runnable> T test3(T a, T b) {
        a.start();
        b.start();
        return a;
    }


    //================================================================
    // List<Shape>不是List<SanJiao>的父类，List<? extends Shape>才是List<SanJiao>的父类
    //================================================================

    public static int test4(List<? extends Shape> a) {
        return a.size();
    }

    public static int test5(List<Shape> a) {
        return a.size();
    }

}
