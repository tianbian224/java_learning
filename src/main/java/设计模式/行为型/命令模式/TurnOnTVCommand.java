package 设计模式.行为型.命令模式;//  Lvcang created at  2017-11-14 9:18

public class TurnOnTVCommand implements ICommand
{
    private Television television;

    public TurnOnTVCommand(Television television)
    {
        this.television = television;
    }

    @Override public void execute()
    {
        this.television.turnOn();
    }
}
