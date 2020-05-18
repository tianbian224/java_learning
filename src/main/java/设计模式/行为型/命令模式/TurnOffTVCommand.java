package 设计模式.行为型.命令模式;//  Lvcang created at  2017-11-14 9:19


// 关闭电视命令
public class TurnOffTVCommand implements ICommand
{
    private Television television;

    public TurnOffTVCommand(Television television)
    {
        this.television = television;
    }

    @Override public void execute()
    {
        this.television.turnOff();
    }
}
