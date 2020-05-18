package 设计模式.创建型.工厂模式.工厂方法;

/**
 * @Author: cang.lv
 * @Date: 2020/05/15 11:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.createVideo();
        video.play();
    }
}
