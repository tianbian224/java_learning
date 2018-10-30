package 设计模式.适配器模式.对象适配器;

/**
 * 交流到直流供电适配器
 */
public class AC2DCadaptor implements DC {
    private ACpower ac=new ACpower();// 持有一个引用

    public AC2DCadaptor(ACpower ac) {
        this.ac = ac;
    }

    //实现目标接口，但是里面需要对被适配对象进行转化
    @Override
    public int getPower() {
        int ac = this.ac.getACpower();
        return (int)((double)ac/1.732);
    }
}
