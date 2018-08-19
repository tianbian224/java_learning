package 设计模式.外观模式;//  Lvcang created at  2017-11-13 22:02

// 测试使用外观模式：   2018年3月27日22:33:16  复习
public class Pro
{
    public static void main(String[] args)
    {
        // 电脑内部使用了非常复杂的子系统，经过了比较复杂的步骤，
        // 但是对Pro用户来说，只是调用简单的方法
        Computer computer = new Computer();
        computer.startComputer();
        computer.shutDownComputer();
    }
}
