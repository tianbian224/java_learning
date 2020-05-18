package 设计模式.结构型.适配器模式.对象适配器;

/**
 * 写一个将交流电源转换为直流电源5V电源的适配器
 */
public class Test{
    public static void main(String[] args) {
        ACpower aCpower = new ACpower();
        AC2DCadaptor ac2DCadaptor = new AC2DCadaptor(aCpower);
        int power = ac2DCadaptor.getPower();
        System.out.println(power);
    }
}
