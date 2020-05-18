package 设计模式.行为型.命令模式;//  Lvcang created at  2017-11-14 9:23

public class TurnOffLightCommand implements ICommand
{

    private Light light;

    public TurnOffLightCommand(Light light)
    {
        this.light = light;
    }

    @Override public void execute()
    {
        this.light.turnOffLight();
    }
}
