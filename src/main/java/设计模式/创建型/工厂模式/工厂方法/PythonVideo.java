package 设计模式.创建型.工厂模式.工厂方法;

/**
 * @Author: cang.lv
 * @Date: 2020/05/15 11:41
 * @Description:
 */
public class PythonVideo implements Video {
    @Override
    public void play() {
        System.out.println("python video is playing");
    }
}
