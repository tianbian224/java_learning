package 设计模式.工厂模式.工厂方法;

/**
 * @Author: cang.lv
 * @Date: 2020/05/15 11:41
 * @Description:
 */
public class JavaVideo implements Video {
    @Override
    public void play() {
        System.out.println("java voideo is playing");
    }
}
