package 设计模式.工厂模式.工厂方法;

/**
 * @Author: cang.lv
 * @Date: 2020/05/15 11:43
 * @Description:
 */
public class JavaVideoFactory implements VideoFactory {
    @Override
    public Video createVideo() {
        return new JavaVideo();
    }
}
