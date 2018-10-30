package 设计模式.享元模式;

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
