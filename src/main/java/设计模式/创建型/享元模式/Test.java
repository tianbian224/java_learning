package 设计模式.创建型.享元模式;

/**
 * 享元模式是池技术的重要实现方式,String常量池、数据库连接池、缓冲池等等都是享元模式的应用
 */

public class Test {

    public static void main(String[] args) {
        WorkerFactory factory=new WorkerFactory();
        Worker jinping = factory.getworker("xi");
        jinping.doJob("chuiniu");

        Worker yuanping=factory.getworker("yuanping");
        yuanping.doJob("sleep zhangLanLan");

        Worker xi=factory.getworker("xi");
        xi.doJob("jixu chui niu");


    }
}
