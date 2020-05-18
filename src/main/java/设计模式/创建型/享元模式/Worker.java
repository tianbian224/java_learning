package 设计模式.创建型.享元模式;

public class Worker implements Employee {
    private String name;// 内部状态


    // 内部状态初始化就确定，不能改变
    public Worker(String name) {
        this.name = name;
    }


    //job是外部状态，可以复用共享
    @Override
    public void doJob(String job) {
        System.out.println(name + "正在做：" + job);
    }
}
