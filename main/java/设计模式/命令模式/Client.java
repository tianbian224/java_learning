package 设计模式.命令模式;//  Lvcang created at  2017-11-14 9:33

// 客户端：给调用者（遥控器）赋值命令
public class Client
{
    public static void main(String[] args)
    {
        // 创建执行者
        Television tv = new Television();
        Light light = new Light();


        // 创建命令对象
        TurnOnTVCommand tvOn = new TurnOnTVCommand(tv);
        TurnOffTVCommand tvOff = new TurnOffTVCommand(tv);
        TurnOnLightCommand lightOn = new TurnOnLightCommand(light);
        TurnOffLightCommand lightOff = new TurnOffLightCommand(light);

        // 给调用者赋值,设置每个按钮具体功能
        RemoteControler controler=new RemoteControler();
        controler.setCommand(0,tvOn);
        controler.setCommand(1,tvOff);
        controler.setCommand(2,lightOn);
        controler.setCommand(3,lightOff);

        // 测试使用遥控器
        controler.buttonDown(0);
        controler.buttonDown(1);
        controler.buttonDown(2);
        controler.buttonDown(3);

    }
}
