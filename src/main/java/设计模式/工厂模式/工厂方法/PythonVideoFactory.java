package 设计模式.工厂模式.工厂方法;

/**
 * @Author: cang.lv
 * @Date: 2020/05/15 11:44
 * @Description:
 */
public class PythonVideoFactory implements VideoFactory {
    @Override
    public Video createVideo() {
        return new PythonVideo();
    }
}
